	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			Set<Integer> newset = new HashSet<>();
			for (int i=0;i<N;i++) {
				newset.add(sc.nextInt());
			}
			System.out.println(newset.size());
			
			sc.close();
		}
		
		
	}