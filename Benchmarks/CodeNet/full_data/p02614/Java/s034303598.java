import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int h = sc.nextInt(); int w = sc.nextInt(); int k = sc.nextInt();
        int [][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                a[i][j] = (s.charAt(j) == '.' ? 0 : 1);
            }
        }
        int ans = 0;
        for (int row = 0; row < (1 << h); row++) {
            for (int col = 0; col < (1 << w); col++) {
                int [][] copy = new int[h][w];
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        copy[i][j] = a[i][j];
                    }
                }
                for (int b = 0; b < h; b++) {
                    if (((row >> b) & 1) == 1) {
                        for (int j = 0; j < w; j++) copy[b][j] = -1;
                    }
                }
                for (int b = 0; b < w; b++) {
                    if (((col >> b) & 1) == 1) {
                        for (int i = 0; i < h; i++) copy[i][b] = -1;
                    }
                }
                int ct = 0;
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (copy[i][j] == 1) ct++;
                    }
                }
                if (ct == k) ans++;
            }
        }
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