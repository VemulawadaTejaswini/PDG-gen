import java.util.*;

public class Main {
	
	   

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        Long[] all = new Long[n];
	        for(int i = 0 ; i<n; i++) {
	        	all[i] = sc.nextLong();
	        	//System.out.println(sum);
	        }
	        int q = sc.nextInt();
	        Long[] res = new Long[q];
	        //int sum = 0;
	        for(int i = 0; i<q; i++) {
	        	Long sum = 0L;
	        	Long b = sc.nextLong();
	        	Long c = sc.nextLong();
	        	//sum = 0L;
	        	for(int j = 0 ; j<n; j++) {
	        		if(all[j] == b) {
	        			all[j] = c;
	        			sum += all[j];
	        			
	        		}else {
	        			sum += all[j]; 
	        		}
	        		
	        }
	        	res[i] = sum;
	        	
	        	
	        }
	        
	        
	        for(int i = 0; i<q; i++) {
	        	System.out.println(res[i]); 
	        }
	       
            //System.out.println(sum); 
	        
	}
}


