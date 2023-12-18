	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
//		 static int mod =  (int) (Math.pow(10,9)+7);
		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        long N = sc.nextLong();	

	        for(long i=3498;i<=3500;i++) {
	        	for(long j=i;j<=3500;j++) {
	        		long up=3501;
	        		long down=0;
	        		while(up>=down) {
	        			long mid = (up+down)/2;
		        		if(4*i*j*mid==N*(i*j+j*mid+mid*i)) {
	        				System.out.print(i);
	        				System.out.print(" ");
	        				System.out.print(j);
	        				System.out.print(" ");
	        				System.out.println(mid);
	        				return;
	        			} else if(4*i*j*mid<N*(i*j+j*mid+mid*i)) {
	        				down=mid+1;
	        			} else {
	        				up=mid-1;
	        			}
	        		}
	        	}
	        }
	        
	        
	        System.out.println("end");
	        

	    }
	    
	    

	}