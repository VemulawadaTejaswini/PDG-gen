import java.io.*;
import java.util.*;

public class Main {

    static class Task {

        private static final int MOD = 998244353;

        private long gcd(long m, long n) {
            if (n == 0) {
                return m;
            }
            return gcd(n, m % n);
        }

        // 快速幂
        public int pow(long x, long n, int mod) {
            long res = 1;
            x %= mod;
            while (n > 0) {
                if ((n & 1) == 1) {
                    res = res * x % mod;
                }

                x = x * x % mod;
                n >>>= 1;
            }
            return (int) res % mod;
        }


        int[] h,to,next,wt,fa;int ct = 0;
        void init(int n ,int m){
            h = new int[n]; Arrays.fill(h,-1);
            to = new int[m*2+2];
            wt = new int[m*2+2];
            next = new int[m*2+2];
            fa = new int[n];Arrays.fill(fa,-1);
            ct = 0;
        }

        void add(int u,int v,int w){
            to[++ct] = v;
            next[ct] = h[u];
            wt[ct] = w;
            h[u] = ct;
        }
        long all = 0;
        PriorityQueue<long[]> q =new PriorityQueue<>((x,y)->{ return Long.compare(y[1]*(y[0]-y[0]/2),x[1]*(x[0]-x[0]/2));});
        public int dfs(int rt,long path){
            int cd = 0;
            int c = 0;
            for(int i=h[rt];i!=-1;i=next[i]){
                if(to[i]==fa[rt]) continue;
                cd++;
                fa[to[i]] = rt;
                int g = dfs(to[i],path+wt[i]);
                q.offer(new long[]{ wt[i] ,(long)g});
                c += g;
            }
            if(cd==0){
                all += path;
                return 1;
            }else{
                return c;
            }


        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {

            for(int i=in.nextInt();i>0;--i){

                int t = in.nextInt();
                out.println(t>=30?"Yes":"No");
                        

            }
        }
    }

    private static void sort(double[] arr) {
        Double[] objArr = Arrays.stream(arr).boxed().toArray(Double[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(int[] arr) {
        Integer[] objArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(long[] arr) {
        Long[] objArr = Arrays.stream(arr).boxed().toArray(Long[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task task = new Task();
        task.solve(1, in, out);
        out.close();
    }

    public static void main(String[] args) {
        new Thread(null, () -> solve(), "1", 1 << 26).start();
    }

    static class InputReader {

        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}