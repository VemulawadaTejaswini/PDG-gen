	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			Set<Integer> a = new HashSet<Integer>();
			
			for (int i=0;i<N;i++) {
				a.add(sc.nextInt());
			}
			int s =a.size();
			if(s == N) {
				System.out.println("YES");
				return;
			}else {
				System.out.println("NO");
			}
				
			
		}
				
	}