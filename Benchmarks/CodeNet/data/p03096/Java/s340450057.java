	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();	
	        int[] a = new int[N];
	        long[] dp = new long[N+5];
	        for(long i=0;i<N;i++)list.add(new ArrayList<Integer>());
	        for (int i=0 ; i<N; i++) {
	            a[i] = sc.nextInt();
	            dp[i+1]=dp[i];
	            if(i==0||a[i]!=a[i-1]) {
	            	for(int k:list.get(a[i])) {
	            		dp[i+1]=dp[i+1]+dp[k-1]+1;
	            	}	            	
	            	list.get((int)a[i]).add(i+1);          	
	            }
	        }	        
	        	        
	        System.out.println(dp[N]+1);
	        
		 }
		 
	}