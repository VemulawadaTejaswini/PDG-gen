

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    private void solve() {
        String string = in.next();
        boolean s = false, e = false, n = false, w = false;
        for (char ch : string.toCharArray()) {
            switch (ch) {
                case 'S':
                    s = true;
                    break;
                case 'E':
                    e = true;
                    break;
                case 'N':
                    n = true;
                    break;
                case 'W':
                    w = true;
                    break;
            }
        }

        if (s ^ n || e ^ w) {
            out.println("No");
        } else {
            out.println("Yes");
        }
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
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

    private FastScanner in;
    private PrintWriter out;


    private void run() {
        try {
            in = new FastScanner();
            out = new PrintWriter(new BufferedOutputStream(System.out));
            solve();
        } catch (Exception e) {
            throw e;
        } finally {
            out.close();
        }
    }


    public static void main(String[] arg) {
        new Main().run();
    }
}



