import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Main {
		
		 

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			long[] a = new long[n];
			HashMap<Long,Long> m = new HashMap<Long,Long>(); 
			
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextLong();
				m.merge(a[i], 1L, Long::sum);
			}
			
			for(int k=0;k<n;k++) {
				long ret = 0L;
		  		for(Map.Entry<Long, Long> e :m.entrySet()) {
		  			long key = e.getKey();
		  			long val = e.getValue();
		  			if(key==a[k]) {
		  				ret+=(val-1)*(val-2)/2;
		  			}else {
		  				ret+=val*(val-1)/2;
		  			}
		  			 
		  		}
		  		
		  		System.out.println(ret);
			}
			
	    }
				
	}
	
