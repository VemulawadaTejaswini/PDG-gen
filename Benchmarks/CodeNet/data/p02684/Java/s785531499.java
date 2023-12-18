import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			long k = sc.nextLong();
			int[] a = new int[n];
			int now = 0;
			Map<Integer,Integer> m = new HashMap<Integer,Integer>();
			int cyc = 0;
			int start = 0;
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			m.put(0, 0);
			
			for(int i=1;i<n;i++) {
				now = a[now]-1;
				
				if(m.containsKey(now)) {
					start = m.get(now);
					cyc = i-m.get(now);;
					break;
				}else {
					m.put(now, i);
				}
			}

			
			long lstart = start;
			long lcyc = cyc;
			
			long cal = (k-lstart)%lcyc;
			int now2 = 0;
			for(int i=1;i<=lstart+cal;i++) {
				now2=a[now2]-1;
			}
			
			
			System.out.println(now2+1);
			
		}
		
		
	}
