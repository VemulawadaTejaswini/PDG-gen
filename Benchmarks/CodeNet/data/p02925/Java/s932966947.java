import java.util.*;
import java.io.*;
 
public class Main {
    static int maxN = 1005;
    static int maxV = maxN*(maxN-1)/2;
    static ArrayList<ArrayList<Integer>> to = new ArrayList<ArrayList<Integer>>();
    static int[][] id = new int[maxN][maxN];
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        for(int i = 0; i < maxV; i++){
            to.add(new ArrayList<Integer>());
        }
        int[][] arr = new int[n][n-1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                arr[i][j] = sc.nextInt()-1;
            }
        }
        int V = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i < j){
                    V++;
                    id[i][j] = V;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                arr[i][j] = toId(i,arr[i][j]);
            }
            for(int j = 0; j < n-2; j++){
                to.get(arr[i][j]).add(arr[i][j+1]);
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            int res = dfs(i);
            if(res == -1){
                pw.println(-1);
                pw.flush();
                return;
            }
            ans = Math.max(ans,res);
        }
        pw.println(ans);
        pw.flush();
    }
    
    private static int toId(int i, int j){
        if(i > j){
            int tmp = i;
            i = j;
            j = tmp;
        }
        return id[i][j];
    }
    
    static boolean[] visited = new boolean[maxV];
    static boolean[] calculated = new boolean[maxV];
    static int[] dp = new int[maxV];
    private static int dfs(int i){
        if(visited[i]){
            if(!calculated[i]) return -1;
            return dp[i];
        }
        dp[i] = 1;
        visited[i] = true;
        for(int next : to.get(i)){
            int res = dfs(next);
            if(res == -1) return -1;
            dp[i] = Math.max(dp[i],res+1);
        }
        calculated[i] = true;
        return dp[i];
    }

    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
        }
 
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
