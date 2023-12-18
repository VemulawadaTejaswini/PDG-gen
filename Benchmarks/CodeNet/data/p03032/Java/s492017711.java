import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        long max = 100000 * 20000000000L;
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = sc.nextLongArray(n);
        long ans = 0;
        for(int i = 0; i <= k; i++){
            for(int j = 0; j <= k-i; j++){
                if(i+j > n) continue;
                long now = 0;
                int d = k-i-j;
                ArrayList<Long> li = new ArrayList<>();
                for(int l = 1; l <= i; l++){
                    now += a[l-1];
                    li.add(a[l-1]);
                }
                for(int r = 1; r <= j; r++){
                    now += a[n-r];
                    li.add(a[n-r]);
                }
                Collections.sort(li);
                for(int v = 0; v < d; v++){
                    if(v >= li.size()) break;
                    if(li.get(v) >= 0) break;
                    now -= li.get(v);
                }
                ans = Math.max(ans,now);
            }
        }
        System.out.println(ans);
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


