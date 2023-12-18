import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			Map<Character,Long> m = new HashMap<Character,Long>();
			long one = 1;
			
			for(int i=0;i<n;i++) {
				char[] s = sc.next().toCharArray();
				m.merge(s[0], one, Long::sum);
			}
			
			long[] num = new long[5];
			char[] march = "MARCH".toCharArray();
			long sum =0;
			long kind =0;
			long subst =0;
			
			if(n<3) {
				System.out.println(0);
				return;
			}
			
			for(int i=0;i<5;i++) {
				if(m.containsKey(march[i])) {
					num[i] = m.get(march[i]);
				}
				if(num[i]>0) {
					kind++;
				}
				sum += num[i];
			}
			
			for(int i=0;i<5;i++) {
				if(num[i]>0) {
					subst += num[i]*(num[i]-1)/2*(kind-1);
				}
				if(num[i]>=3) {
					subst += num[i]*(num[i]-1)*(num[i]-2)/6;
				}
			}
			
			
			
			long ret = sum*(sum-1)*(sum-2)/6-subst;
			
			System.out.println(ret);
		}
		
	}
