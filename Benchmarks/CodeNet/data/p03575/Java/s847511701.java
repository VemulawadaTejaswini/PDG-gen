import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] map = new boolean[n][n];
        ArrayList<Bridge> li = new ArrayList<Bridge>();
        for(int i = 0; i < m; i++){
            int s = sc.nextInt()-1;
            int g = sc.nextInt()-1;
            map[s][g] = map[g][s] = true;
            li.add(new Bridge(s,g));
        }
        int ans = 0;
        for(Bridge b : li){
            Boolean[] visited = new Boolean[n];
            Arrays.fill(visited,false);
            visited[0] = true;
            map[b.s][b.g] = map[b.g][b.s] = false;
            visited = dfs(0,map,visited,n);
            if(Arrays.asList(visited).contains(false)){
                ans++;
            }
            map[b.s][b.g] = map[b.g][b.s] = true;
        }
        System.out.println(ans);
    }
    
    public static Boolean[] dfs(int now, boolean[][] map, Boolean[] visited, int n){
        for(int i = 0; i < n; i++){
            if(visited[i] || !map[now][i]){
                continue;
            }else{
               visited[i] = true;
               dfs(i,map,visited,n);
            }
        }
        return visited;
    }
}

class Bridge{
    int s,g;
    public Bridge(int s, int g){
        this.s = s;
        this.g = g;
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
