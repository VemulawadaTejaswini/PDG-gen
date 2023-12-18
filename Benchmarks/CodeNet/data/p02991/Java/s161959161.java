import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> G = new ArrayList<>();
        for(int i = 0; i < N; i++){
            G.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            G.get(u).add(v);
        }
        int s = sc.nextInt()-1;
        int t = sc.nextInt()-1;
        long[][] dist = new long[N][3];
        for(int i = 0; i < N; i++){
            Arrays.fill(dist[i],-1);
        }
        dist[s][0] = 0;
        Deque<Point> q = new ArrayDeque<>();
        q.add(new Point(s,0));
        while (q.size() > 0) {
            Point P = q.poll();
            int v = P.v;
            int p = P.p;
            for(int nv : G.get(v)){
                int np = (p+1)%3;
                if(dist[nv][np] == -1){
                    dist[nv][np] = dist[v][p]+1;
                    q.add(new Point(nv,np));
                }
            }
        }
        pw.println(dist[t][0] != -1 ? dist[t][0]/3 : -1);
        pw.flush();
    }
}

class Point{
    int v, p;
    public Point(int v, int p){
        this.v = v;
        this.p = p;
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
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
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
