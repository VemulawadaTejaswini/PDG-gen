import java.util.*;
import java.io.*;
 
public class Main {
    static int[] town;
    static int[][] road;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        town = new int[r];
        for(int i = 0; i < r; i++){
            town[i] = sc.nextInt()-1;
        }
        road = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(road[i],Integer.MAX_VALUE/2);
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int c = sc.nextInt();
            road[a][b] = road[b][a] = c;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    road[j][k] = Math.min(road[j][k], road[j][i] + road[i][k]);
                }
            }
        }
        long ans = Long.MAX_VALUE;
        for(int i = 0; i < r; i++){
            boolean[] arrived = new boolean[r];
            arrived[i] = true;
            ans = Math.min(ans,dfs(town[i],1,arrived,0L,r));
        }
        System.out.println(ans);
    }
    
    public static long dfs(int now, int cnt, boolean[] arrived, long dist, int r){
        if(cnt == r){
            return dist;
        }
        long ret = Long.MAX_VALUE;
        for(int i = 0; i < r; i++){
            if(!arrived[i]){
                arrived[i] = true;
                ret = Math.min(ret,dfs(town[i],cnt+1,arrived,(dist + road[now][town[i]]), r));
                arrived[i] = false;
            }
        }
        return ret;
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
