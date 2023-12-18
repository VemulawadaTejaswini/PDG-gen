import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[] arrived;
    static ArrayList<ArrayList<Integer>> map;
    static long mod = (long)1e9+7;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        arrived = new boolean[n];
        map = new ArrayList<>();
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<>());
        }
        for(int i = 0; i < n-1; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            map.get(x).add(y);
            map.get(y).add(x);
        }
        pw.println(k*dfs(k,0,-1) % mod);
        pw.flush();
    }
    
    private static long dfs(int k, int now, int prev){
        int num = 0;
        if(prev == -1){
            num = k-1;
        }else{
            num = k-2;
        }
        if(k < map.get(now).size()){
            return 0;
        }else{
            long cnum = 1;
            for(int v : map.get(now)){
                if(v == prev) continue;
                cnum *= num;
                num--;
                cnum %= mod;
            }
            for(int v : map.get(now)){
                if(v == prev) continue;
                cnum *= dfs(k,v,now);
                cnum %= mod;
            }
            return cnum;
        }
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
