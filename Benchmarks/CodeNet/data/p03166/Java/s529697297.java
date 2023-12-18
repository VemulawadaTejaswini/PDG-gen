

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static int max=(int) (1e5 + 5);
	public static LinkedList<Integer>[] adjLinkedList=new LinkedList[max];
	public static int degree[]=new int[max];
	public static int dist[]=new int[max];
	public static boolean visited[]=new boolean[max];
	
	public static void dfs(int a) {
		
		
			visited[a]=true;
			for(int b:adjLinkedList[a])
			{
				dist[b]=Math.max(dist[b], dist[a]+1);
				degree[b]--;
				if(degree[b]==0)
					dfs(b);
				
			}
		
	}
	
	public static void main(String[] args) {
		FastScanner scanner=new FastScanner();
		int n=scanner.nextInt(),m=scanner.nextInt();
		//adjLinkedList
		for(int i=1;i<=n;i++)
			 adjLinkedList[i] = new LinkedList<Integer>();
		for(int i=0;i<m;i++) {
			int a=scanner.nextInt(),b=scanner.nextInt();
		
			adjLinkedList[a].add(b);
		
			degree[b]++;
		}

		for(int i=1;i<=n;i++) {
			if(!visited[i]&&degree[i]==0) {
				
				dfs(i);
			}
		}
		
		int ans=0;
		for(int i:dist) ans=Math.max(ans, i);
		System.out.println(ans);
		

	}
	static class FastScanner{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		int [] readArray(int n) {
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=nextInt();
			return a;
		}
		
		
	}

}
