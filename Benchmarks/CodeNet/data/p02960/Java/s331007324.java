import java.io.*;
import java.io.IOException;
import java.util.*;

@SuppressWarnings({"rawtypes", "unchecked"})
class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        String S;
        S = sc.next();
        solve(S);
    }

    static void solve(String S){
        char[] ca = S.toCharArray();
        reverse(ca);

        int base = 0;
        int[] dp = new int[13];
        dp[0] = 1;

        int ju = 1;
        for (int i = 0; i < ca.length; i++) {

            if(ca[i] != '?') {
                int n = Character.getNumericValue(ca[i]);
                base += ju * n % 13;
                base %= 13;
            } else {
                int[] dp2 = new int[13];
                for (int j = 0; j < 10; j++) {
                    int d = ju * j % 13;
                    for (int k = 0; k < 13; k++) {
                        dp2[(k+d)%13] += dp[k] % MOD;
                        dp2[(k+d)%13] %= MOD;
                    }
                }
                dp = dp2;
            }

            ju *= 10;
            ju %= 13;
        }

        System.out.println(dp[(18 - base)%13]%MOD);
    }

    static long pow(long a, long r, long MOD) {
        long sum = 1;
        while (r > 0) {
            if ((r & 1) == 1) {
                sum *= a;
                sum %= MOD;
            }
            a *= a;
            a %= MOD;
            r >>= 1;
        }
        return sum;
    }
    public static void reverse(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            char t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
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
            return nn();
        }

        String nextLine() {
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
