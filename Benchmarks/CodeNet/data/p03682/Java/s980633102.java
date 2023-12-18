import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        int n = Integer.parseInt(line);
        int x[] = new int[n];
        int y[] = new int[n];
        
        for (int i = 0; i < n; i++) {
			line = sc.nextLine();
			String[] split = line.split(" ");
			x[i] = Integer.parseInt(split[0]);
			y[i] = Integer.parseInt(split[1]);
		}
        
        int c[][] = new int[n][n];			// cost
//        boolean r[][] = new boolean[n][n]; 				// road exists
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int c_x = Math.abs(x[i] - x[j]);
				int c_y = Math.abs(y[i] - y[j]);
				c[i][j] = c_x > c_y ? c_y : c_x;
//				if (c[i][j] == 0) {
//					r[i][j] = true;			// intial roads without any costs
//				}
			}
		}
        
        HashSet<Integer> connected = new HashSet<>();
        connected.add(new Integer(0));
        
        HashSet<Integer> not_connected = new HashSet<>();
        for (int i = 1; i < n; i++) {
        	not_connected.add(new Integer(i));
		}
        
        
        int total = 0;
        for (int i = 1; i <n; i++) {
        	int minimum = 1000000001;
        	int minimum_idx = -1;
        	Integer idx1_o = null;
        	for (Iterator<Integer> iterator1 = not_connected.iterator(); iterator1.hasNext();) {
    			idx1_o = iterator1.next();
    			int idx1 = idx1_o.intValue();
                // search minimum road cost
            	for (Iterator<Integer> iterator = connected.iterator(); iterator.hasNext();) {
        			int idx = iterator.next().intValue();
        			int m = c[idx][idx1];
        			if (minimum > m) {
        				minimum = m;
        				minimum_idx = idx1;
        			}
        		}
                
    		}
        	connected.add(new Integer(minimum_idx));
        	connected.remove(idx1_o);
        	total += minimum;

		}
        
        System.out.println(total);
        
        // connect all 0 cost
        
        
        
        
	}
	
	public static int min(int x[]) {
		int ans=x[0];
		for (int i = 1; i < x.length; i++) {
			if (ans > x[i]) {
				ans = x[i];
			}
		}
		return ans;
	}

	

}
