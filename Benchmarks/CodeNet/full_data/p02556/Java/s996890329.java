import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        Pair ur = null; Pair ul = null; Pair ll = null; Pair lr = null;
        long urb = Long.MIN_VALUE; long ulb = Long.MIN_VALUE; long llb = Long.MIN_VALUE; long lrb = Long.MIN_VALUE;
        ArrayList<Pair> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            Pair p = new Pair(x, y);
            a.add(p);
            if (x + y > urb) {
                ur = p;
                urb = x + y;
            }
            if (-x + y > ulb) {
                ul = p;
                ulb = -x + y;
            }
            if (x - y > lrb) {
                lr = p;
                lrb = x - y;
            }
            if (-x - y > llb) {
                ll = p;
                llb = -x - y;
            }
        }
        long res = Long.MIN_VALUE;
        for (Pair i: a) {
            res = Math.max(res, dist(i, ll));
            res = Math.max(res, dist(i, lr));
            res = Math.max(res, dist(i, ul));
            res = Math.max(res, dist(i, ur));
        }
        out.println(res);
        out.close();
    }

    static long dist(Pair i, Pair j) {
        return Math.abs(i.x - j.x) + Math.abs(i.y - j.y);
    }

    static class Pair {
        long x; long y;
        Pair(long x, long y) {
            this.x = x; this.y = y;
        }
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}