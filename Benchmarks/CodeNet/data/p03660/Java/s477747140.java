import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static ArrayList<String> s = new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n= in.nextInt();
		ArrayList<Integer>[] adj= new ArrayList[n];
		for (int i = 0; i < adj.length; i++) {
			adj[i]= new ArrayList<Integer>();
		}
		for (int i = 0; i < n-1; i++) {
			int a= in.nextInt()-1;
			int b= in.nextInt()-1;
			adj[a].add(b);
			adj[b].add(a);
		}
		int midnode= 0;
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.offer(0);
		int[] vis = new int[n];
		int [] dist= new int[n];
		Arrays.fill(vis, -1);
		vis[0] = 0;
		dist[0]=0;
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int v : adj[cur]) {
				if (vis[v] == -1) {
					vis[v] = cur;
					dist[v]= dist[cur]+1;
					q.offer(v);
				}
			}
		}
		ArrayDeque<Integer> path = new ArrayDeque<Integer>();
		int go = n-1;
		path.add(go);
		while (go != -1 && go != 0) {
			path.addFirst(vis[go]);
			go = vis[go];
		}
		int distance= dist[n-1];
		int cop=distance;
		int block= -1;
		if(distance==1){
			block= n-1;
		}
		else{
			while(cop>0){
				int w= path.poll();
				cop--;
			}
			block= path.poll();
		}
		boolean [] numferr= new boolean[n];
		ArrayDeque<Integer> ferrad= new ArrayDeque<>();
		numferr[0]= true;
		ferrad.offer(0);
		while(!ferrad.isEmpty()){
			int cur= ferrad.poll();
			for(int nex: adj[cur]){
				if(nex==block) continue;
				if(!numferr[nex]){
					ferrad.offer(nex);
					numferr[nex]= true;
				}
			}
		}
		int res=0;
		for (int i = 0; i < numferr.length; i++) {
			if(numferr[i]) res++;
		}
		int other= n-res;
		if(res<=other){
			System.out.println("Snuke");
		}
		else{
			System.out.println("Fennec");
		}
		
	}
	public static void combinations(String suffix,String prefix){
        if(prefix.length()<0)return;
        s.add(suffix);
        for(int i=0;i<prefix.length();i++)
         combinations(suffix+prefix.charAt(i),prefix.substring(i+1,prefix.length()));
    }
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
			st = new StringTokenizer("");
		}

		public double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		public String next() throws IOException {
			if (!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
				return next();
			}
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}

