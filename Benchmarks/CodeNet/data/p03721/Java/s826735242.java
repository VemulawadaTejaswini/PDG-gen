import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
			long k = sc.nextLong();
			TreeMap<Long,Long> m = new TreeMap<Long,Long>();
			
			for(int i=0;i<n;i++) {
				long a = sc.nextLong();
				long b = sc.nextLong();
				
				m.merge(a, b, Long::sum);
			}
			
			long ret = 0;
			
			for(Map.Entry<Long, Long> e: m.entrySet()) {
				k -= e.getValue();
				if(k<=0) {
					ret = e.getKey();
					break;
				}
			}
			
			//System.out.println(m);
			System.out.println(ret);
			
	    }
		
	}
	
