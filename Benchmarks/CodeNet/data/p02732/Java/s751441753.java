import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Main {
		
		 

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n];
			HashMap<Integer,Long> m = new HashMap<Integer,Long>(); 
			
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
				m.merge(a[i], 1L, Long::sum);
			}
			
			long ret = 0L;
			
			for(Map.Entry<Integer, Long> e :m.entrySet()) {
	  			int key = e.getKey();
	  			long val = e.getValue();
	  			ret+=val*(val-1)/2;
	  		}
			
			for(int k=0;k<n;k++) {
		  		System.out.println(ret-(m.get(a[k])-1));
			}
			
	    }
				
	}
	
