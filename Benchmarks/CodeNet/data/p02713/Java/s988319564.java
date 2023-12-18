import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
   	 static int a_dist[];
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long K = sc.nextLong();
	        
	        long ans=0;
	        for(int i=1;i<=K;i++) {
	        	for(int j=1;j<=K;j++) {
	        		for(int k=1;k<=K;k++) {
	        			long tmp=GCD(i,j);
	        			tmp=GCD(tmp,k);
	        			ans=ans+tmp;
	        		}
	        	}
	        }
	        
	    	System.out.println(ans);
	        
	        	        	        
	 }
	 
	  static long GCD(long a,long b) {
		  long tmp;
		  long r;
		  if(a<b) {
			  tmp = a;
			  a = b;
			  b = tmp;				  
		  }
		  
		  r = a % b;
		  while(r!=0) {
			  a=b;
			  b=r;
			  r=a%b;
		  }
		  
		  return b;
	  }
}