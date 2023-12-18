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
        long X;
        X = sc.nextLong();
        long Y;
        Y = sc.nextLong();
        long A;
        A = sc.nextLong();
        long B;
        B = sc.nextLong();
        long C;
        C = sc.nextLong();
        long[] p = new long[(int)(A)];
        for(int i = 0 ; i < A ; i++){
                p[i] = sc.nextLong();
        }
        long[] q = new long[(int)(B)];
        for(int i = 0 ; i < B ; i++){
                q[i] = sc.nextLong();
        }
        long[] r = new long[(int)(C)];
        for(int i = 0 ; i < C ; i++){
                r[i] = sc.nextLong();
        }
        solve(X, Y, A, B, C, p, q, r);
    }

    static void solve(long X, long Y, long A, long B, long C, long[] p, long[] q, long[] r){
        Arrays.sort(p);
        reverse(p);
        Arrays.sort(q);
        reverse(q);
        Arrays.sort(r);
        reverse(r);

        long[] p2 = Arrays.copyOfRange(p, 0, (int)X);
        long[] q2 = Arrays.copyOfRange(q, 0, (int)Y);

        reverse(p2);
        reverse(q2);

        int ip = 0;
        int iq = 0;

        for (int i = 0; i < C; i++) {
            if(ip < X && iq < Y) {
                if(p2[ip] < q2[iq]) {
                    if(p2[ip] < r[i]) {
                        p2[ip] = r[i];
                        ip++;
                    } else {
                        break;
                    }
                } else {
                    if(q2[iq] < r[i]) {
                        q2[iq] = r[i];
                        iq++;
                    } else {
                        break;
                    }
                }
            } else if (ip < X) {
                if(p2[ip] < r[i]) {
                    p2[ip] = r[i];
                    ip++;
                } else {
                    break;
                }
            } else if (iq < Y) {
                    if(q2[iq] < r[i]) {
                        q2[iq] = r[i];
                        iq++;
                    } else {
                        break;
                    }
            } else {
                break;
            }
        }
        long sum = Arrays.stream(p2).sum() + Arrays.stream(q2).sum();
        System.out.println(sum);


    }

    public static void reverse(long[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            long t = arr[i];
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
