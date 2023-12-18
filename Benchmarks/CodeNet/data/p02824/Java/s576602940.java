import java.io.*;
import java.io.IOException;
import java.util.*;

@SuppressWarnings({"rawtypes", "unchecked"})
class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        // long start = System.currentTimeMillis();
        final MyScanner sc = new MyScanner();
        int N;
        N = sc.nextInt();
        int M;
        M = sc.nextInt();
        int V;
        V = sc.nextInt();
        int P;
        P = sc.nextInt();
        int[] A = new int[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextInt();
        }
        solve(N, M, V, P, A);
        // long end = System.currentTimeMillis();
        // System.out.println((end - start)  + "ms");
    }

    static void solve(int N, int M, int V, int P, int[] A){
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int l : A) {
            if(hashmap.containsKey(l)) hashmap.put(l, hashmap.get(l) + 1);
            else hashmap.put(l, 1);
        }

        TreeSet<Integer> ts = new TreeSet(hashmap.keySet());
        
        int v;
        int n_v;
        int n_sum = 0;
        int v_border = -1;
        int ans = 0;
        int fix = 0;

        while(!ts.isEmpty()) {
            v = ts.pollLast();
            n_v = hashmap.get(v);
            n_sum += n_v;

            if(n_sum < P) {
                ans = n_sum;
            } else {
                if(v_border < 0) v_border = v;
                fix += (v_border - v) * n_v;

                int n_vote = (V - (N - n_sum + (P - 1))) * M;
                int n_fixed_vote = n_vote - fix;
                if(v + M < v_border) {
                    break;
                } else if(n_fixed_vote < 0) {
                    ans = n_sum;
                } else {
                    int delta = (int)Math.ceil(1.0 * n_fixed_vote / (n_sum - P + 1));
                    if(v + M >= v_border + delta) ans = n_sum;
                    else break;
                }
            }
        }
        System.out.println(ans);

    }

    static class MyScanner {
 
        BufferedReader br;
        StringTokenizer st;
 
        MyScanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }
 
        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String nn() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        String next() {
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }
 
        char nextChar() {
            return nn().charAt(0);
        }
 
        int nextInt() {
            return Integer.parseInt(nn());
        }
 
        long nextLong() {
            return Long.parseLong(nn());
        }
 
        double nextDouble() {
            return Double.parseDouble(nn());
        }
 
        Integer[] niArr0(int n) {
            Integer[] ar = new Integer[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Integer[] niArr1(int n) {
            Integer[] ar = new Integer[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Long[] nlArr0(int n) {
            Long[] ar = new Long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
 
        Long[] nlArr1(int n) {
            Long[] ar = new Long[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
    }
}
