import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			long k = sc.nextLong();
			int[] a = new int[n+1];
			Map<Integer,Integer> townnum = new HashMap<Integer,Integer>();
			
			
			for(int i=1;i<=n;i++) {
				a[i] = sc.nextInt();
			}
			
			int go = a[1];
			int cyc = 0;
			int init = 0;
			townnum.put(1, 0);
			
			for(int i=1;i<=n;i++) {
				if(townnum.containsKey(go)) {
					cyc = i-townnum.get(go)-1;
					init = townnum.get(go);
					break;
				}else {
					townnum.put(go, i);
				}
				
				go = a[go];
			}
			
			long num = (k-cyc-init)%(cyc+1);
			
			int ret = 1;
			
			if(k<=num) {
				for(int i=1;i<=k;i++) {
					ret = a[ret];
				}
				System.out.println(ret);
				return;
			}
			
			
			if(num==0) {
				for(int i=1;i<=(init+cyc);i++) {
					ret = a[ret];	
				}
			}else {
				for(int i=1;i<=(init+num-1);i++) {
					ret = a[ret];	
				}
			}
			System.out.println(ret);
			
		}
		
		
	}
