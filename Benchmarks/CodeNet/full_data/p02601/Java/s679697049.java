import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        int k = sc.nextInt();
        boolean ok = false;
        for (int mask = 0; mask < (int) Math.pow(3, k); mask++) {
            String m = Integer.toString(mask, 3);
            while (m.length() < k) m = "0" + m;
            int x = a; int y = b; int z = c;
            for (int i = 0; i < m.length(); i++) {
                if (m.charAt(i) == '0') x *= 2;
                if (m.charAt(i) == '1') y *= 2;
                if (m.charAt(i) == '2') z *= 2;
            }
            ok |= (z > y && y > x);
        }
        out.println(ok ? "Yes" : "No");
        out.close();
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