import java.io.*;
import java.util.*;

public class Main {

public static void main(String[] args){

   new Thread(null, null, "Anshum Gupta", 99999999) {
        public void run() {
            try {
                solve();
            } catch(Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }.start();
}
static final long mxx = (long)(1e18+5);
static final int mxN = (int)(1e6);
static final int mxV = (int)(1e6), log = 18;
static long mod = (long)(1e9+7); //998244353;//̇
static final int INF = (int)1e9;
static boolean[]vis;
static ArrayList<ArrayList<Integer>> adj1, adj2;
static int n, m, k, q, h, w, cnt = 0, cur = 0;
static char[]str;
static int[]size, comp;
static void dfs(int u, int original) {
	vis[u] = true;
	cnt++;
	comp[u] = original;
	for(Integer x : (cur == 0 ? adj1.get(u) : adj2.get(u))) {
		if(!vis[x]) {
			dfs(x, original);
		}
	}
}
public static void solve() throws Exception {
	   // solve the problem here
		s = new MyScanner();
   		out = new PrintWriter(new BufferedOutputStream(System.out), true);
//	   		out = new PrintWriter("output.txt");
        int tc = 1;//s.nextInt();
        while(tc-- > 0){
        	n = s.nextInt();
        	m = s.nextInt();
        	k = s.nextInt();
        	adj1 = s.readUndirectedUnweightedGraph(n, m);
        	adj2 = s.readUndirectedUnweightedGraph(n, k);
        	int[]ans = new int[n+1];
        	size = new int[n+1];
        	comp = new int[n+1];
        	vis = new boolean[n+1];
        	for(int i=1; i<=n; i++) {
        		if(!vis[i]) {
        			cnt = 0;
        			dfs(i, i);
        			size[i] = cnt;
        		}else {
        			size[i] = size[comp[i]];
        		}
        	}
//        	Arrays.fill(vis, false);
//        	Arrays.fill(comp, 0);
//        	cur++;
//        	int[]tmp = new int[n+1];
//        	for(int i=1; i<=n; i++) {
//        		if(!vis[i]) {
//        			cnt = 0;
//        			dfs(i, i);
//        			tmp[i] = cnt;
//        		}else {
//        			tmp[i] = tmp[comp[i]];
//        		}
//        	}
//        	out.println(Arrays.toString(tmp));
//        	for(int i=1; i<=n; i++)size[i] += tmp[i] - 1;
//        	out.println(Arrays.toString(size));
        	for(int i=1; i<=n; i++) {
        		ans[i] = size[i] - 1 - adj1.get(i).size() - getSameComponent(i);//adj2.get(i).size();
        		out.print(ans[i] + " ");
        	}out.println();
        } 
           
        out.flush();
        out.close();
}

private static int getSameComponent(int i) {
	cnt = 0;
	for(Integer x : adj2.get(i)) {
		if(comp[x] == comp[i])cnt++;
	}
	return cnt;
}
public static PrintWriter out;
public static MyScanner s;
static class MyScanner {

    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    public MyScanner(String fileName) {
    	try {
			br = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble() { return Double.parseDouble(next()); }
    int[] nextIntArray(int n){
    	int[]a = new int[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextInt();
    	}
    	return a;
    }
    long[] nextlongArray(int n) {
    	long[]a = new long[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextLong();
    	}
    	return a;
    }
    Integer[] nextIntegerArray(int n){
    	Integer[]a = new Integer[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextInt();
    	}
    	return a;
    }
    Long[] nextLongArray(int n) {
    	Long[]a = new Long[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextLong();
    	}
    	return a;
    }
    char[][] next2DCharArray(int n, int m){
    	char[][]arr = new char[n][m];
    	for(int i=0; i<n; i++) {
    		arr[i] = this.next().toCharArray();
    	}
    	return arr;
    }
    ArrayList<ArrayList<Integer>> readUndirectedUnweightedGraph(int n, int m) {
    	ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
    	for(int i=0; i<=n; i++)adj.add(new ArrayList<Integer>());
    	for(int i=0; i<m; i++) {
    		int u = s.nextInt();
    		int v = s.nextInt();
    		adj.get(u).add(v);
    		adj.get(v).add(u);
    	}
    	return adj;
    }
    ArrayList<ArrayList<Integer>> readDirectedUnweightedGraph(int n, int m) {
    	ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
    	for(int i=0; i<=n; i++)adj.add(new ArrayList<Integer>());
    	for(int i=0; i<m; i++) {
    		int u = s.nextInt();
    		int v = s.nextInt();
    		adj.get(u).add(v);
    	}
    	return adj;
    }
    String nextLine(){
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

 
}
