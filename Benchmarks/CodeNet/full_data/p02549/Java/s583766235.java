	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
//		 static int mod =  (int) (Math.pow(10,9)+7);
		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int K = sc.nextInt();
	        int[][] a = new int[N][2];
	        for(int i=0;i<K;i++) {
	        	a[i][0] =Integer.parseInt(sc.next());
	        	a[i][1] =Integer.parseInt(sc.next());
	        }
	        long[] dp = new long[3*N];
	        dp[0]=1;
	        dp[1]=-1;
	        long sum =0;
	        for(int i=0;i<N;i++) {
	        	sum = sum+dp[i];
	        	for(int j=0;j<K;j++) {
	        		dp[i+a[j][0]]=(dp[i+a[j][0]]+sum)%mod;
	        		dp[i+a[j][1]+1]=(dp[i+a[j][1]+1]-sum)%mod;
	        	}
	        }
	        long ans=0;
	        for(int i=0;i<N;i++) {
	        	ans=(ans+dp[i]+mod)%mod;
	        }
	        System.out.println(ans);
		 }
	}