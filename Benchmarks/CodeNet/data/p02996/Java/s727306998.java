import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			long[] a = new long[n];
			long[] b = new long[n];
			HashMap<Long,Long> m = new HashMap<Long,Long>();
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextLong();
				b[i] = sc.nextLong();
			}
			
			for(int i=0;i<n;i++) {
				m.merge(b[i], a[i], Long::sum);
			}
			
			for(Map.Entry<Long, Long> e :m.entrySet()) {
				if(e.getKey()<e.getValue()) {
					System.out.println("No");
					return;
				}
			}
			
			System.out.println("Yes");
	    }
		
	}
	
