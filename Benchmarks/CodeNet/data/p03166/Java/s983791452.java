
import java.util.*;

public class Main {// Main
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n =sc.nextInt();
		int m = sc.nextInt();
		
		map = directed(n, m);
		int[] dp = new int[n+1];
		boolean[] vis = new boolean[n+1];
		for(int i = 1 ;i <= n;i++) {
			find(i , vis , dp);
		}
		int ans = 0 ;
		for(int val : dp)ans = Math.max(ans , val);
		
		
		
		
		
  System.out.println(ans);
	}
	
	private static int find(int i, boolean[] vis , int[] dp) {
		if(vis[i])return dp[i];
		int max = -1 ;
		for(int nbr : map.get(i)) {
			max = Math.max(max , find(nbr, vis , dp) );
		}
		vis[i]=true;
		dp[i] = max+1;
		return dp[i];
	}

	static TreeMap<Integer , ArrayList<Integer> > map ;

	public static TreeMap<Integer , ArrayList<Integer> > directed(int n , int m  ) throws Exception{
		TreeMap<Integer , ArrayList<Integer> > map = new TreeMap<>();
		for(int i = 1 ;i<=n ;i++)map.put(i, new ArrayList<Integer>());
		for(int i = 1 ;i <= m ;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.get(a).add(b);
		}
		return map;
	}
}