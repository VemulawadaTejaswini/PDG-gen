import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECrestedIbisVsMonster solver = new ECrestedIbisVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECrestedIbisVsMonster {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int n = in.nextInt();
            long hdp[] = new long[10000 + 1];
            ArrayList<node> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new node(in.nextInt(), in.nextInt()));
            }
            Collections.sort(a, new Comparator<node>() {

                public int compare(node o1, node o2) {
                    return o1.y - o2.y;
                }
            });
            for (int i = 0; i < n; i++) {
                hdp[a.get(i).x] = a.get(i).y;
            }
            for (int i = 10000; i > 0; i--) {
                if (hdp[i] == 0) {
                    continue;
                }
                while (i > 0 && hdp[i - 1] == 0) {
                    hdp[i - 1] = hdp[i];
                    i--;
                }
            }
            for (int i = 1; i <= 10000; i++) {
                if (hdp[i] == 0) hdp[i] = Integer.MAX_VALUE;
            }
//        for(int i=1;i<10;i++){
//            out.print(hdp[i] + " ");
//        }
//        out.println();
            for (int i = 1; i <= 10000; i++) {
                for (int j = 1; j <= 10000; j++) {
                    if (i + j > 10000) {
                        break;
                    }
                    hdp[i + j] = Math.min(hdp[i + j], hdp[i] + hdp[j]);
                }
            }
            out.println(hdp[h]);


        }

        class node {
            int x;
            int y;

            node(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

