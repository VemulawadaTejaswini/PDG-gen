import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        
        long[] a = new long[(int)N];
        int cnt1=0;
        for (int i=0 ; i<N; i++) {
            int cnt=0;
            a[i] = sc.nextLong();
            long tmp=a[i];
            	while(tmp%2==0) {
            		tmp=tmp/2;
            		cnt++;
            			
            	}
        		if(i==0) {
        			cnt1=cnt;
        		} else {
        			if(cnt1!=cnt) {
        				System.out.println(0);
        				return;
        			}
            }
        }
        
        long lcm=a[0];
        for(int i=1;i<N;i++) {
        	lcm=LCM(lcm,a[i]);
        	if(lcm>M) {
        		System.out.println(0);
        		return;
        	}
        }
        	
        long ans=1;
        if(M<lcm/2) {
    		System.out.println(0);
        	return;
        } else {
        	long tmp=M-lcm/2;
        	ans=ans+tmp/lcm;
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
      
      static long LCM(long a,long b) {
    	  return a*b/GCD(a,b);
      }
}