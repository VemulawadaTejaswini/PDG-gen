
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n = Integer.parseInt(sc.next());
			long m = Long.parseLong(sc.next());
			
			int []a = new int [n];
			
			for(int i = 0 ; i < n ;i++) {
				a[i] = Integer.parseInt(sc.next())-1;
			}
			
			Map<Integer,Integer> hm = new HashMap<Integer,Integer>(); 
			int now = 0;
			
			while(!hm.containsKey(now)) {
				hm.put(now, hm.size());
				now = a[now];
				m--;
				
				if(m == 0) {
					System.out.println(now+1);
					return;
				}
			}
			
			int c = hm.size() - hm.get(now) + 1;
			long p = m % c;
			
			System.out.println(a[(int)p]+1);	
		}
	}
