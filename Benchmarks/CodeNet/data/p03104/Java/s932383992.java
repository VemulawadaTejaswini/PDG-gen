	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        long A = sc.nextLong();
	        long B = sc.nextLong();
	        long ans=0;
	        long a1=-(A+1)/2+(B)/2;
	        if(a1%2!=0) {
	        	ans++;
	        }
	        long tmp=2;
	        for(long i=1;i<40;i++) {
	        	tmp=2*tmp;
	        	long x = A%tmp+(B-A)%tmp;
	        	long a = A%tmp;
	        	long b = (B-A)%tmp;
	        	long mod;
	        	long aa=0;
	        	if(a<tmp/2) {
	        		 aa =tmp/2;
	        	} else {
	        		aa=a;
	        	}
	        	if(x>tmp*3/2)x=tmp*3/2;
	        	if(x>=tmp/2&&x<tmp) {
	        		mod=(x-aa+1)%2;
	        		ans=ans+mod*tmp/2;
	        	}
	        	if(x>=tmp&&x<tmp*3/2) {
	        		mod=(tmp-aa)%2;
	        		ans=ans+mod*tmp/2;
	        	}
	        	if(x>=tmp*3/2) {
	        		mod=((tmp-aa)+(x-tmp*3/2+1))%2;
	        		ans=ans+(mod%2)*tmp/2;
	        	}
	        }
	        
	        
	        System.out.println(ans);
	        

	    }
	    
	    

	}