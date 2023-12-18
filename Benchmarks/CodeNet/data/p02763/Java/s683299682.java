import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.nextInt();
            char[] S = in.next().toCharArray();
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i <= 'z' - 'a'; i++) {
                map.put(i, new ArrayList<>());
            }
            for (int i = 0; i < N; i++) {
                map.get(S[i] - 'a').add(i + 1);
            }
            int Q = in.nextInt();
            for (int i = 0; i < Q; i++) {
                int type = in.nextInt();
                if (type == 1) {
                    Integer iq = in.nextInt();
                    char cq = in.next().charAt(0);
                    char c = S[iq - 1];
                    map.get(c - 'a').remove(iq);
                    map.get(cq - 'a').add(iq);
                } else {
                    int lq = in.nextInt();
                    int rq = in.nextInt();
                    int cnt = 0;
                    for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
                        if (search(e.getValue(), lq, rq)) {
                            cnt++;
                        }
                    }
                    out.println(cnt);
                }
            }
        }

        private boolean search(List<Integer> value, int lq, int rq) {
            int l = -1, r = value.size();
            while (r - l > 1) {
                int pos = l + (r - l) / 2;
                int v = value.get(pos);
                if (v < lq) {
                    l = pos;
                } else {
                    r = pos;
                }
            }
            return r < value.size() && lq <= value.get(r) && value.get(r) <= rq;
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

