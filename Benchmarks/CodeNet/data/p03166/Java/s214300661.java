import java.io.*;
import java.util.ArrayList;

public class Main {
	static ArrayList<Integer>[] arr = null;
	static int longestPath[] = null;
	static boolean vis[]  = null;
	
	private static int dfs(int node) {
		if(vis[node]) return longestPath[node];
		int maxLen = 0;
		for(int i=0; i<arr[node].size(); i++) {
			maxLen = Math.max(maxLen, dfs(arr[node].get(i))+1);
		}
		vis[node] = true;
		return longestPath[node] = maxLen;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int len = (int)1e5+1;
		arr = new ArrayList[len];
		for(int i=0; i<len; i++) arr[i] = new ArrayList<>();
		for(int i=0; i<m; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			arr[x].add(y);
		}
		longestPath = new int[len];
		vis = new boolean[len];
		for(int i=0; i<len; i++) dfs(i);
		int ans = -1;
		for(int i=0; i<len; i++) ans = Math.max(ans, longestPath[i]);
		System.out.println(ans);
	}
}
