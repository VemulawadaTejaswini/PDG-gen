import java.io.*;
import java.io.IOException;
import java.util.*;

class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        long[] T = new long[(int)(2)];
        for(int i = 0 ; i < 2 ; i++){
                T[i] = sc.nextLong();
        }
        long[] A = new long[(int)(2)];
        for(int i = 0 ; i < 2 ; i++){
                A[i] = sc.nextLong();
        }
        long[] B = new long[(int)(2)];
        for(int i = 0 ; i < 2 ; i++){
                B[i] = sc.nextLong();
        }
        solve(T, A, B);
    }

    static void solve(long[] T, long[] A, long[] B){
        if(T[0] * A[0] + T[1] * A[1] == T[0] * B[0] + T[1] * B[1]) {
            System.out.println("infinity");
            return;
        }

        long big;
        long small;
        if(T[0] * A[0] > T[0] * B[0]) {
            big = T[0] * A[0] - T[0] * B[0];
            small = T[1] * A[1] - T[1] * B[1];
        } else {
            big = T[0] * B[0] - T[0] * A[0];
            small = T[1] * B[1] - T[1] * A[1];
        };

        if(big + small > 0) {
            System.out.println(0);
            return;
        } else if (big + small == 0) return;
        else {
            long ans = big / (-1 * small - big);
            long amari = big & (-1 * small - big);

            ans = 2 * ans - 1;
            if(amari == 0)ans++;
            else ans += 2;

            System.out.println(ans);
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
