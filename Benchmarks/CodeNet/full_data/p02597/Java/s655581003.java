import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        String s = sc.next();
        int ans = Integer.MAX_VALUE;
        int prefR = 0; int prefW = 0; int sufR = 0; int sufW = 0;
        for (int i = 0; i < n; i++) if (s.charAt(i) == 'R') sufR++; else sufW++;
        for (int i = 0; i < n; i++) {
            int got = Math.min(prefW, sufR);
            ans = Math.min(ans, got + Math.max(i - (prefR + got), (n - i) - (sufW + got)));
            if (s.charAt(i) == 'R') {
                prefR++;
                sufR--;
            } else {
                prefW++;
                sufW--;
            }
        }
        int got = Math.min(prefW, sufR);
        ans = Math.min(ans, got + Math.max(n - (prefR + got), (n - n) - (sufW + got)));
        out.println(ans);
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