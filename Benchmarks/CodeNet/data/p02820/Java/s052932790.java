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
        final MyScanner sc = new MyScanner();
        long N;
        N = sc.nextLong();
        long K;
        K = sc.nextLong();
        long R;
        R = sc.nextLong();
        long S;
        S = sc.nextLong();
        long P;
        P = sc.nextLong();
        String T;
        T = sc.next();
        solve(N, K, R, S, P, T);
    }

    static void solve(long N, long K, long R, long S, long P, String T){
        char[] tarr = T.toCharArray();
        
        int pre_r = 0;
        int pre_s = 0;
        int pre_p = 0;
        int r = 0;
        int s = 0;
        int p = 0;
        int ans = 0;

        for (int j = 0; j < K; j++) {
            int i = 0;
            while ((int)(j + i * K) < N) {
                r = Math.max(pre_s, pre_p);
                s = Math.max(pre_r, pre_p);
                p = Math.max(pre_s, pre_r);

                switch (tarr[(int)(j + i * K)]) {
                    case 'r':
                        p+=P;
                        break;
                    case 'p':
                        s+=S;
                        break;
                    case 's':
                        r+=R;
                        break;
                    default:
                        break;
                }
                pre_r = r;
                pre_s = s;
                pre_p = p;
                i++;
            }
            ans += Math.max(p, Math.max(r, s));
            pre_r = 0;
            pre_s = 0;
            pre_p = 0;
            r = 0;
            s = 0;
            p = 0;
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
