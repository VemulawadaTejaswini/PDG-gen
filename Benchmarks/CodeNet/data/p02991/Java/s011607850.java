import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[] arrived;
    static ArrayList<ArrayList<Integer>> map;
    static ArrayList<ArrayList<Integer>> mapm3;
    static long mod = (long)1e9+7;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arrived = new boolean[n];
        map = new ArrayList<>();
        mapm3 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<>());
            mapm3.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            map.get(x).add(y);
            //map.get(y).add(x);
        }
        int s = sc.nextInt()-1;
        int t = sc.nextInt()-1;
        for(int i = 0; i < n; i++){
            dfs(0,i,i);
        }
        arrived = new boolean[n];
        arrived[s] = true;
        long ans = dfs2(0,s,t);
        pw.println(ans == -1 ? -1 : ans);
        pw.flush();
    }
    
    private static void dfs(int cnt, int now, int start){
        if(cnt == 3){
            mapm3.get(start).add(now);
            //mapm3.get(now).add(start);
            return;
        }
        for(int next : map.get(now)){
            dfs(cnt+1,next,start);
        }
    }
    
    private static long dfs2(long cnt, int now, int goal){
        if(now == goal){
            return cnt;
        }
        long ret = -1;
        //System.out.println(mapm3.get(now) + " " + now);
        for(int v : mapm3.get(now)){
            if(arrived[v]){
                continue;
            }
            arrived[v] = true;
            long tmp = dfs2(cnt+1,v,goal);
            if(tmp != -1){
                if(ret == -1 || ret > tmp){
                    ret = tmp;
                }
            }
            arrived[v] = false;
        }
        return ret;
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
