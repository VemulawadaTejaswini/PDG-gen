import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			long[]A = new long[N];
			Map<Long,Long>map = new TreeMap<Long,Long>();
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				if(map.containsKey(A[i])) {
					map.put(A[i], map.get(A[i])+1);
				}else {
					map.put(A[i], (long)1);
				}
			
			}
			int Q = scan.nextInt();
			long []B = new long[Q];
			long []C = new long[Q];
			
			for(int i = 0;i<Q;i++) {
				B[i] = scan.nextLong();
				C[i] = scan.nextLong();	
			}
			
			long goukei = 0;
			for(int i = 0;i<N;i++)goukei+=A[i];
			
			
			for(int i = 0;i<Q;i++) {
				
				if(!map.containsKey(B[i])) {
					System.out.println(goukei);
					continue;
				}
				
				long kosuu = map.get(B[i]);
				
				long sa = C[i]*kosuu-B[i]*kosuu;
				
				goukei+=sa;
				System.out.println(goukei);
				
				if(map.containsKey(C[i])) {
					map.put(C[i], map.get(C[i])+kosuu);
				}else {
					map.put(C[i], kosuu);
				}
				
				
				
				
			}
			
			
			
		}
		
		
	}
		

}
