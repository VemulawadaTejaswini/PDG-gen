import java.util.*;
import java.io.*;
 
public class Main {
    static int[] p;
    static long[] c;
    static long[] v;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        p = sc.nextIntArray(n);
        c = sc.nextLongArray(n);
        long total = 0;
        for(int i = 0; i < n; i++){
            total += c[i];
        }
        boolean used = false;
        long ans = 0;
        for(int i = 0; i < n; i++){
            int cycle = 0;
            v = new long[n];
            v[0] = c[i];
            int next = p[i]-1;
            for(int j = 1; j < n; j++){
                v[j] = v[j-1]+c[next];
                next = p[next]-1;
                if(next == i){
                    cycle = j+1;
                    break;
                }
            }
            int rem = k % cycle;
            long tmp1 = -Long.MAX_VALUE;
            long tmp2 = -Long.MAX_VALUE;
            for(int j = 0; j < cycle; j++){
                if(j < rem){
                    tmp1 = Math.max(tmp1,v[j]);
                }else{
                    tmp2 = Math.max(tmp2,v[j]);
                }
            }
            if(v[cycle-1] > 0){
                tmp1 += v[cycle-1]*(k/cycle);
                tmp2 += v[cycle-1]*Math.max(0,(k/cycle)-1);
            }
            if(tmp1 >= 0 || (k >= cycle && tmp2 >= 0)){
                used = true;
            }
            ans = Math.max(ans,tmp1);
            if(k >= cycle) ans = Math.max(ans,tmp2);
        }
        if(!used) ans = -Long.MAX_VALUE;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans,c[i]);
        }
        pw.println(ans);
        pw.flush();
    }
    
    public static long dfs(int s,int cnt,long max,long now){
        if(cnt == 0){
            return max;
        }
        now += c[s];
        max = Math.max(max,now);
        return dfs(p[s]-1,cnt-1,max,now);
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
