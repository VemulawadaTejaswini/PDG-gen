import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        Arrays.sort(a);
        boolean[] cnt = new boolean[n];
        Arrays.fill(cnt,true);
        int[] exist = new int[1000003];
        int index = 1;
        for(int v : a){
            if(exist[v] != 0){
                cnt[index-1] = false;
                cnt[exist[v]-1] = false;
            }else{
                int max = (int)Math.sqrt(v);
                for(int i = 2; i <= max; i++){
                    if(v % i == 0){
                        if(exist[i] != 0){
                            cnt[index-1] = false;
                        }
                        if(exist[v/i] != 0){
                            cnt[index-1] = false;
                        }
                    }
                }
            }
            exist[v] = index;
            index++;
        }
        int ans = 0;
        for(int i = n-1; i >= 0; i--){
            if(cnt[i]){
                ans++;
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
    
    public void close() throws Exception{
        this.reader.close();
        return;
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