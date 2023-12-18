import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		
		boolean[] q = new boolean[n];
		int[] q_wa = new int[n];
		
		int ac = 0;
		int wa = 0;
		
		for(int i=0 ; i < n ; i++) {
			q[i] = false;
			q_wa[i] = 0;
		}
		
		for(int i=0 ; i < m ; i++) {
			int p = Integer.parseInt(sc.next());
			String s = sc.next();
			if(!q[p-1]) {
				if(s.equals("AC")) {
					ac++;
					wa += q_wa[p-1];
					q[p-1] = true;
				}else {
					q_wa[p-1]++;
				}
			}
			
			
			
		}
		
		System.out.println(ac + " " + wa);
		

	}
}