import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		//knapSack();
		longestPath();
	}


	private static void longestPath() {
		Scanner sc = new Scanner(System.in);
		int nodes = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer,ArrayList<Integer>> adj = new HashMap<>();
		
		for(int i =0;i<M;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			ArrayList<Integer> cur= adj.getOrDefault(x, new ArrayList<Integer>());
			cur.add(y);
			adj.put(x,cur);
		}
		
		Set<Integer> visited = new HashSet<>();
		int dp[] = new int[nodes+1];
		Arrays.fill(dp, -1);
		int ans = 0;
		for(Integer k : adj.keySet()) {
			if(dp[k]==-1) {
				ans = Math.max(ans, dfs(k, dp,adj));
			}
		}
		//System.out.println(Arrays.toString(dp));
		System.out.println(ans);
		
	}


	private static int dfs(Integer k, int[] dp, Map<Integer, ArrayList<Integer>> adj) {
		//System.out.println("k "+ k);
		if(dp[k]!=-1) {
			//System.out.println("quick return k "+ k + " dp[k] "+ dp[k]);
			return dp[k];
		}
		
		int ans = 0;
		if(adj.get(k)==null) {
			dp[k]=0;
			return 0;
		}
		for(int i: adj.get(k)) {
			//System.out.println(" k "+k+" i "+ i + " dp[i] "+ dp[i]);
			if(dp[i] != -1) {
				ans = Math.max(ans, dp[i]+1);
			}else {
				ans = Math.max(ans, dfs(i, dp,adj)+1);
			}
		}
		dp[k]= ans;
		//System.out.println("result updated dp["+ k+"] "+ dp[k]);
		return ans;
	}


	public static void knapSack() {
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		int weight = sc.nextInt();
		
		int[] values = new int[items];
		int[] weights = new int[items];
		for(int i =0;i<items;i++) {
			weights[i] = sc.nextInt();
			values[i] = sc.nextInt();
		}
		
		long[][]dp = new long[items+1][weight+1];
		knapSackHelper(dp, items,weight,weights, values);
		System.out.println(dp[items][weight]);
	}

	private static long knapSackHelper(long[][] dp, int items, int WT, int[] weights, int[] values) {
		System.out.println("items "+ items +" WT "+ WT + "current Item ");
		if(items <=0) {
			return 0;
		}
		
		if(dp[items][WT]!=0) {
			return dp[items][WT];
		}
		
		if(WT>=weights[items-1]) {
			dp[items][WT] = knapSackHelper(dp, items-1,WT-weights[items-1],weights,values)+values[items-1];
		}
		
		dp[items][WT] = Math.max(dp[items][WT], knapSackHelper(dp, items-1, WT, weights, values));
		//System.out.println("dp ["+ items+"]["+WT+"] "+dp[items][WT]);
		
		return dp[items][WT];
	}
}
