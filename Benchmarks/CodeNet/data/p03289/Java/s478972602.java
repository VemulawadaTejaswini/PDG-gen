import java.io.*;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/6/23 11:55
 * @see meituan.n2018.Bturn
 */
public class Main {


    private static BufferedReader br;
    private static StreamTokenizer st;
    private static PrintWriter pw;

    private static void solve() throws IOException {
        String s = nextLine();
        int n = s.length();

        if (s.charAt(0) != 'A' || s.charAt(1) < 'a') {
            pw.print("WA");
            return;
        }
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (s.charAt(i) < 'a') {
                if (flag || s.charAt(i) != 'C') {
                    pw.print("WA");
                    return;
                } else {
                    if (i == n - 1) {
                        pw.print("WA");
                        return;
                    }
                    flag = true;
                }
            }
        }
        if (!flag) {
            pw.print("WA");
        } else {
            pw.print("AC");
        }
    }

    public static void main(String args[]) throws IOException {
//        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
//        if (!oj) {
//            System.setIn(new FileInputStream("src/in.txt"));
//        }
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StreamTokenizer(br);
        pw = new PrintWriter(new OutputStreamWriter(System.out));
        st.ordinaryChar('\''); //指定单引号、双引号和注释符号是普通字符
        st.ordinaryChar('\"');
        st.ordinaryChar('/');

        long t = System.currentTimeMillis();
        solve();
//        if (!oj) {
//            pw.println("[" + (System.currentTimeMillis() - t) + "ms]");
//        }
        pw.flush();
    }


    private static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    private static long nextLong() throws IOException {
        st.nextToken();
        return (long) st.nval;
    }

    private static double nextDouble() throws IOException {
        st.nextToken();
        return st.nval;
    }

    private static String[] nextSS(String reg) throws IOException {
        return br.readLine().split(reg);
    }

    private static String nextLine() throws IOException {
        return br.readLine();
    }
}