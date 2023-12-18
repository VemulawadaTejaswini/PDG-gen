import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
//        int tc = scan.nextInt();
//        for (int i = 0; i < tc; i++) {
            solve();
//        }
        out.close();
    }

    private static void solve() {
        int k = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int l = (int) Math.ceil(a / (float) k);
        int r = (int) Math.floor(b / (float) k);
        if (l <= r) {
            out.println("OK");
        } else {
            out.println("NG");
        }
    }


    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static MyScanner scan = new MyScanner();

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
//--------------------------------------------------------

}