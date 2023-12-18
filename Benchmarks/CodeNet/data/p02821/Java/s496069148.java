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
        long M;
        M = sc.nextLong();
        long[] A = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextLong();
        }
        solve(N, M, A);
    }

    static void solve(long N, long M, long[] A){
        long[] sum = new long[(int)2e5+1];
        Arrays.sort(A);
        reverse(A);

        for (int i = 0; i < sum.length; i++) {
            sum[i] = 0;
        }

        for (long a : A) {
            sum[(int)a]++;
        }

        for (int i = sum.length-1; i > 0; i--) {
            sum[i-1] += sum[i];
        }
        
        int ng = (int)2e5+1;
        int ok = 2;
        int mid = (ok+ng)/2;

        while(ng - ok > 1) {
            if(get_count(mid, sum, A) >= M) ok = mid;
            else ng = mid;
            mid = (ok+ng)/2;
        }

        long[] sum2 = Arrays.copyOf(A, A.length);
        Arrays.sort(sum2);
        reverse(sum2);

        for (int i = 1; i < sum2.length; i++) {
            sum2[i] += sum2[i-1];
        }

        int ans = get_ans(ok+1, sum, sum2, A);
        int nnn = (int)M - get_count(ok+1, sum, A);

        System.out.println(ans + nnn * ok);

    }

    static int get_count(int K, long[] sum, long[] A) {
        int ans = 0;
        for (long a : A) {
            ans += sum[Math.max(0,(int)(K-a))];
        }
        return ans;
    }

    public static void reverse(long[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            long t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
    }

    static int get_ans(int K, long[] sum, long[] sum2, long[] A) {
        int ans = 0;
        for (long a : A) {
            long num = sum[Math.max(0,(int)(K-a))];
            if(num == 0) continue;
            ans += num * a;
            ans += sum2[(int)num-1];
        }

        return ans;
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
