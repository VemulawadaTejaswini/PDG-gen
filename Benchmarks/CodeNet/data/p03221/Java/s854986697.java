import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			int[]P = new int[M];
			int[]Y = new int[M];
			int[]p = new int[M];
			int[]y = new int[M];
			
			Map<Integer,Map<Long,Integer>>D = new TreeMap<Integer,Map<Long,Integer>>();
			for(int i = 1;i<=M;i++) {
				D.put(i, new TreeMap<Long,Integer>());
			}
			for(int i = 0;i<M;i++) {
				P[i] = scan.nextInt();
				Y[i] = scan.nextInt();
				D.get(P[i]).put((long)Y[i], i+1);
			}
			
			for(Integer key:D.keySet()) {
				int count = 1;
				for(Long a:D.get(key).keySet()) {
					int s = D.get(key).get(a);
					p[s-1] = key;
					y[s-1] = count;
					count++;
				}
			}
			/*
			for(int i = 0;i<M;i++) {
				String pi = String.valueOf(p[i]);
				String yi = String.valueOf(y[i]);
				StringBuffer sb = new StringBuffer();
				for(int j =0;j<6-pi.length();j++)sb.append('0');
				sb.append(pi);
				for(int j =0;j<6-yi.length();j++)sb.append('0');
				sb.append(yi);
				
				System.out.println(sb.toString());
				
			}
			
			*/
			
			
			
			
		}
		
		
	}
		

}
