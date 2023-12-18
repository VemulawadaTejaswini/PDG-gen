import java.io.*;
import java.util.*;
public class Main{
	public static int n, m;
	public static List<Integer> adj[];
	public static int dist[];
    public static void main(String[] args) throws IOException{
    	FastScanner sc = new FastScanner();
    	PrintWriter out = new PrintWriter(System.out);
    	n = sc.nextInt();
    	m = sc.nextInt();
    	dist = new int[n];
    	adj = new ArrayList[n];
    	for(int i=0; i<n; i++) {
    		adj[i] = new ArrayList<>();
    	}
    	for(int i=0; i<m; i++) {
    		int a = sc.nextInt()-1;
    		int b = sc.nextInt()-1;
    		adj[a].add(b);
    	}
    	for(int i=0; i<n; i++) {
    		if(dist[i]!=0) continue;
    		dfs(i, 0);
    	}
    	int max = 0;
    	for(int i=0; i<n; i++) {
    		max = Math.max(max, dist[i]);
    	}
    	out.println(max);
    	out.close();
    }
    public static void dfs(int start, int cnt) {
    	dist[start] = cnt;
    	for(int i:adj[start]) {
    		if(dist[i]>cnt+1) continue;
    		dfs(i, cnt+1);
    	}
    }
    public static class FastScanner {
    	BufferedReader br;
    	StringTokenizer st;

    	public FastScanner(String s) {
    		try {
    			br = new BufferedReader(new FileReader(s));
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		}
    	}

    	public FastScanner() {
    		br = new BufferedReader(new InputStreamReader(System.in));
    	}
    	
    	String nextToken() {
    		while (st == null || !st.hasMoreElements()) {
    			try {
    				st = new StringTokenizer(br.readLine());
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    		return st.nextToken();
    	}

    	String nextLine() {
    		st = null;
    		try {
    			return br.readLine();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		return null;
    	}

    	int nextInt() {
    		return Integer.parseInt(nextToken());
    	}

    	long nextLong() {
    		return Long.parseLong(nextToken());
    	}

    	double nextDouble() {
    		return Double.parseDouble(nextToken());
    	}
    }
}
