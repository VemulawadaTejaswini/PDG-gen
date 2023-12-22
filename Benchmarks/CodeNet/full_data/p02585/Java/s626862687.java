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
	        int K = sc.nextInt();	
	        long[] p = new long[N];
	        for (int i=0 ; i<N; i++) {
//	            p[i] = Long.parseLong(sc.next())-1;
	        	p[i]=(i+5)%N;
	        }
	        long[] c = new long[N];
	        long sum =0;
	        for (int i=0 ; i<N; i++) {
//	            c[i] = Long.parseLong(sc.next());
	        	c[i] = (long)Math.random()*1000000;
	        }
	        
	        boolean[] visited = new boolean[N];
	        
	        long ans = Long.MIN_VALUE;
	        for(int s=0;s<N;s++) {
	        	if(visited[s]==true)continue;
	        	else {
	        		long[] b = new long[N];
	        		b[0]=c[s];
		            sum = b[0];
	        		long next = p[s];
	        		visited[(int)next]=true;
	        		int cnt=1;
	        		while(next!=s) {
	        			b[cnt]=c[(int)next];
	        			sum = sum+b[cnt];
	        			next=p[(int)next];
	        			cnt++;
	        			visited[(int)next]=true;
	        		}
	    	        long[][][] dp = new long[cnt][cnt][2];
	    	        for(int i=0;i<cnt;i++) {
	       	        	for(int j=0;j<cnt;j++) {
	    	        		if(j==0) {
	    	        			dp[i][j][0]=b[i];
	    	        			dp[i][j][1]=(i+1)%cnt;
	    	        		} else {
	    	        			dp[i][j][0]=dp[i][j-1][0] + b[(int)dp[i][j-1][1]];
	    	        			dp[i][j][1]=(dp[i][j-1][1]+1)%cnt;
	    	        		}
	    	        	}	    	        	
	    	        }
 	    	        long at = Long.MIN_VALUE;
	    	        int t = K%cnt;
	    	        if(t==0) {
	    	        	t=cnt;
	    	        	at=at-sum;
	    	        }
	    	        for(int i=0;i<cnt;i++) {
	    	        	for(int j=0;j<t;j++) {
	    	        		at=Math.max(at, dp[i][j][0]);
	    	        	}
	    	        }
	    	        if(sum>0) {
	    	        	at=at+sum*(K/cnt);
	    	        }
		        	ans = Math.max(ans, at);
	        	}
	        }
	        
	        
	        
	        System.out.println(ans);
		 }
		 
	}