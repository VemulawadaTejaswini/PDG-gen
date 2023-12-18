import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    static class Value {
        int n;
        int p;

        Value(int n, int p) {
            this.n = n;
            this.p = p;
        }
    }

    private static void solve() throws IOException {
        int D = nextInt();
        int G = nextInt();

        int a[] = new int[D + 1];
        int b[] = new int[D + 1];

        List<Value> data = new ArrayList<>();

        for (int i = 1; i <= D; i++) {
            a[i] = nextInt();
            b[i] = nextInt();


            for (int j = 1; j < a[i]; j++) {
                data.add(new Value(j, i * j * 100));
            }
            data.add(new Value(a[i], a[i] * i * 100 + b[i]));
        }

        data.sort((o1, o2) -> {
            if (o1.n == o2.n) {
                return o1.p - o2.p;
            }
            return o1.n - o2.n;
        });

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).p >= G) {
                pw.print(data.get(i).n);
                return;
            }
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