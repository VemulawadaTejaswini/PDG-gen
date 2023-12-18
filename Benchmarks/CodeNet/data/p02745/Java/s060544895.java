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
        String a;
        a = sc.next();
        String b;
        b = sc.next();
        String c;
        c = sc.next();
        solve(a, b, c);
    }

    static void solve(String a, String b, String c){
        int ab = cal(a,b);
        int ac = cal(a,c);
        int ba = cal(b,a);
        int bc = cal(b,c);
        int ca = cal(c,a);
        int cb = cal(c,b);

        int hoge = Math.max(ab + bc, ac + cb);
        hoge = Math.max(hoge, ba + ac);
        hoge = Math.max(hoge, bc + ca);
        hoge = Math.max(hoge, ca + ab);
        hoge = Math.max(hoge, cb + ba);

        System.out.println(a.length() + b.length() + c.length() - hoge);
    }

    static int cal(String a, String b){
        int ans = 0;
        int len = Math.min(a.length(), b.length());
        boolean ok = true;

        for (int i = 1; i <= len; i++) {
            ok = true;
            for (int j = 0; j < i; j++) {
                if (b.charAt(j) != '?' && 
                a.charAt(a.length() - i + j) != '?' &&
                b.charAt(j) != a.charAt(a.length() - i + j)) {
                    ok = false;
                    break;
                } 
            }
            if(ok) ans = i;
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
