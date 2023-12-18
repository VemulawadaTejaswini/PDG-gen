import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	 static char[][] S;
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long M = GCD(A,B);
        
        long ans=1;
        for(int i=2;i<Math.pow(M, 0.5);i++){
        	if(M%i==0) {
        		ans++;
        		while(M%i==0)M=M/i;
        	}
        }
        if(M!=1) {
        	ans++;
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