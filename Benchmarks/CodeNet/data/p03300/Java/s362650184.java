import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int[] balance = new int[2 * n + 1];
            for (int i = 0; i < 2 * n; ++i) {
                int w = s.charAt(i) - 'a';
                balance[i + 1] = balance[i] + 2 * w - 1;
            }
            int start = 0;
            List<String> sections = new ArrayList<>();

            for (int i = 1; i <= 2 * n; ++i)
                if (balance[i] == 0) {
                    String cur = solveSection(s.substring(start, i));
                    while (!sections.isEmpty() && (sections.get(sections.size() - 1) + cur).compareTo(cur) < 0) {
                        sections.remove(sections.size() - 1);
                    }
                    sections.add(cur);
                    start = i;
                }
            for (String x : sections) out.print(x);
            out.println();
        }

        private String solveSection(String s) {
            if (s.charAt(0) == 'a') {
                return solveASection(s);
            } else {
                return solveBSection(s);
            }
        }

        private String solveBSection(String s) {
            int n = s.length() / 2;
            int[] cnt = new int[2];
            int[] index = new int[2 * n];
            int[][] where = new int[2][n];
            for (int i = 0; i < 2 * n; ++i) {
                int w = s.charAt(i) - 'a';
                index[i] = cnt[w];
                where[w][cnt[w]] = i;
                ++cnt[w];
            }
            String res = "";
            for (int first = 0; first < n; ++first) {
                StringBuilder b = new StringBuilder();
                for (int i = 0; i < 2 * n; ++i) if (index[i] >= first) b.append(s.charAt(i));
                String t = b.toString();
                if (t.compareTo(res) > 0) res = t;
            }
            return res;
        }

        private String solveASection(String s) {
            int n = s.length() / 2;
            int[] cnt = new int[2];
            int[] index = new int[2 * n];
            int[][] where = new int[2][n];
            for (int i = 0; i < 2 * n; ++i) {
                int w = s.charAt(i) - 'a';
                index[i] = cnt[w];
                where[w][cnt[w]] = i;
                ++cnt[w];
            }
            StringBuilder res = new StringBuilder();
            int atleast = 0;
            for (int i = 0; i < 2 * n; ++i) {
                if (s.charAt(i) == 'b') {
                    int pa = where[0][index[i]];
                    if (pa >= atleast) {
                        res.append("ab");
                        atleast = i + 1;
                    }
                }
            }
            return res.toString();
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

