import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int[N];
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				if(map.containsKey(A[i])) {
					map.put(A[i], map.get(A[i])+1);
				}else {
					map.put(A[i], 1);
				}
			
			}
			int Q = scan.nextInt();
			int []B = new int[Q];
			int []C = new int[Q];
			
			for(int i = 0;i<Q;i++) {
				B[i] = scan.nextInt();
				C[i] = scan.nextInt();	
			}
			
			long goukei = 0;
			for(int i = 0;i<N;i++)goukei+=A[i];
			
			
			for(int i = 0;i<Q;i++) {
				
				if(!map.containsKey(B[i])) {
					System.out.println(goukei);
					continue;
				}
				
				int kosuu = map.get(B[i]);
				
				int sa = C[i]*kosuu-B[i]*kosuu;
				
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
