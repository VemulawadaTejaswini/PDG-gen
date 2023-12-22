	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        
	        int N = sc.nextInt()+1;	
	        int[] a = new int[N];
	        long sum=0;
	        for (int i=0 ; i<N; i++) {
	            a[i] = Integer.parseInt(sc.next());
	            sum=sum+a[i];
	        }
	        long ans=0;
	        long ro=1;
	        for(int i=0;i<N;i++) {
	        	ans=ans+Math.min(ro, sum);
	        	sum=sum-a[i];
	        	ro=ro-a[i];
	        	if(ro<0) {
	        		ans=-1;
	        		break;
	        	}
	        	ro=Math.min(ro*2, Long.MAX_VALUE/2-100);
	        }
	        
	        
	        
	        System.out.println(ans);
	    }
	}