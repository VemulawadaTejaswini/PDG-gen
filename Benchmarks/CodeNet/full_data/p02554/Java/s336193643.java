	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        long N = sc.nextInt();	
	        long ans=1;
	        for(int i=0;i<N;i++) {
	        	ans=(ans*10)%mod;
	        }
	        long t=2;
	        for(int i=0;i<N;i++) {
	        	t=(t*9)%mod;
	        }
	        long t2=1;
	        for(int i=0;i<N;i++) {
	        	t2=(t2*8)%mod;
	        }
	        ans=(ans-t+t2)%mod;
	        
	        
	        System.out.println(ans);
		 }
		 
	}