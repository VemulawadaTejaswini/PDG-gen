import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int[N];
			for(int i= 0;i<N;i++) {
				A[i] = scan.nextInt();
			}
			
			Map<Integer,Integer>map = new HashMap<Integer,Integer>();
			
			for(int i = 0;i<N;i++) {
				if(map.containsKey(A[i])) {
					map.put(A[i], map.get(A[i])+1);
				}else{
					map.put(A[i], 1);
				
				}
			}
			//long goukei2 =0;
			long anstemp = 0;
			for(Integer key:map.keySet()) {
					//goukei2+=sa(map.get(key),2);
				long v = map.get(key);
				   anstemp+=(v*(v-1)/2);
			}
			for(int i= 0;i<N;i++) {
				/*long goukei = 0;
				goukei +=goukei2;
				goukei-=sa(map.get(A[i]),2);
				goukei+=sa(map.get(A[i])-1,2);
				System.out.println(goukei);*/
				
				 long ans = anstemp;
				   long v = map.get(A[i]);
				   ans -= (v*(v-1)/2);
				   ans += ((v-1)*(v-2)/2);
				   System.out.println(ans);
				
			}
			
		}
		
		
	}
	
	private static long sa(int n,int b) {
		return n*(n-1)/b;
	}
	
	

}