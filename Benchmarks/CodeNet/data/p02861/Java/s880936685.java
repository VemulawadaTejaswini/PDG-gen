import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<int[]> map = new ArrayList<>();
        for (int i = 0; i < N; i++) {
        	int[] pos = new int[2];
        	pos[0] = sc.nextInt();
        	pos[1] = sc.nextInt();
        	map.add(pos);
        }
        String str = "";
        int index = 1;
        while (str.length() < N) {
        	str += index;
        	index++;
        }
        List<String> order = new ArrayList<>();
        pmt(str, "", order);
        double all = 0.0;
        for (String s : order) {
        	double total = 0.0;
        	for (int i = 1; i < s.length(); i++) {
        		int[] now = map.get((s.charAt(i) - '0') - 1);
        		int[] before = map.get((s.charAt(i - 1) - '0') - 1);
        		int x = (before[0] - now[0]) * (before[0] - now[0]);
        		int y = (before[1] - now[1]) * (before[1] - now[1]);
        		double dis = Math.sqrt(x + y);
        		total += dis;
        	}
        	all += total;
        }
        System.out.println(all/(double) order.size());
        
    }
    private static void pmt(String str, String c, List<String> order) {
    	for (int i = 0; i < str.length(); i++) {
    		if (str.length() == 1) {
    			order.add(c + str);
    		} else {
    			pmt(str.substring(0, i) + str.substring(i + 1),
    					c + str.substring(i, i + 1),
    					order);
    		}
    	}
    }
}