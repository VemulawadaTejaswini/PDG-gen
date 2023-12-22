import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = -10000000000007L;
    //static final long MOD = 998244353L;
    static final int INF = 50000000;
    static final int NINF = -500000000;
    
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.ni();
        int M = sc.ni();
        DisjointSetUnion dsu = new DisjointSetUnion(N);
        for (int e = 0; e < M; e++) {
        	int a = sc.ni()-1;
        	int b = sc.ni()-1;
        	dsu.connect(a, b);
        }
        pw.println(dsu.count-1);
        
        pw.close();
    }
    
    static class DisjointSetUnion {
    	public int[] parent;
    	public int[] weight;
    	public int count;

    	public DisjointSetUnion(int N) {
    		count = N;
    		parent = new int[N];
    		for (int i = 0; i < N; i++)
    			parent[i] = i;
    		weight = new int[N];
    		Arrays.fill(weight,1);
    	}

    	//"find"
    	public int root(int p) {
    		while (p != parent[p]) {
    			p = parent[p];
    		}
    		return p;
    	}

    	//"union"
    	public void connect(int p, int q) {
    		p = root(p);
    		q = root(q);
    		if (p==q)
    			return;
    		if (weight[p] < weight[q]) {
    			parent[p] = q;
    			weight[q] += weight[p];
    		} else {
    			parent[q] = p;
    			weight[p] += weight[q];
    		}
    		count--;
    	}

    	public boolean connected(int p, int q) {
    		return root(p) == root(q);
    	}
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
 
        int ni() {
            return Integer.parseInt(next());
        }
 
        long nl() {
            return Long.parseLong(next());
        }
 
        double nd() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
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