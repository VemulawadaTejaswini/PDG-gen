	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int max = 2*100005;
	        int N = sc.nextInt();	
	        int[] a = new int[N];
	        long[] dp = new long[N+5];
	        long[] cnt = new long[max];
	        for (int i=0 ; i<N; i++) {
	            a[i] = sc.nextInt();
	            dp[i+1]=dp[i];
	            if(i==0||a[i]!=a[i-1]) {
	            	dp[i+1]=(dp[i+1]+cnt[a[i]])%mod;
	            	cnt[a[i]]=(cnt[a[i]]+dp[i]+1)%mod;
	            }
	        }	        
	        	        
	        System.out.println(dp[N]+1);
	        
		 }
		 
	}