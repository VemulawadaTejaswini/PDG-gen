import java.io.*;
import java.util.*;

public class Main {
    static long mod = (int)Math.pow(10,9)+7;
	public static void main(String[] args) throws IOException {
	    long max = Long.MAX_VALUE/5;
		FastScanner sc = new FastScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[][] a = new long[n][n];
		for(int i = 0; i < n; i++){
		    Arrays.fill(a[i],max);
		}
		for(int i = 1; i < n; i++){
		    a[i][i-1] = 0;
		}
		for(int i = 0; i < m; i++){
		    int l = sc.nextInt()-1;
		    int r = sc.nextInt()-1;
		    long c = sc.nextLong();
		    a[l][r] = c;
		}
		long ans = dijkstra(a,0,n-1,n);
		System.out.println(ans != max ? ans : -1);
	}
	public static long dijkstra(long[][] cost , int s, int end,int node) {
        long[] d = new long[node];
        Arrays.fill(d,Long.MAX_VALUE);
        boolean[] used = new boolean[node];
        d[s] = 0;
        while(true){
            int v = -1;
            for(int i = 0; i < node; i++){
                if(!used[i] && v == -1){
                    v = i;
                }else if(!used[i] &&  d[i] < d[v]){
                    v = i;
                }
            }
            if(v == -1) break;
            used[v] = true;
            for(int j = 0; j < node; j++){
                d[j] = Math.min(d[j],d[v]+cost[v][j]);
            }
        }
        return d[end];
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}

