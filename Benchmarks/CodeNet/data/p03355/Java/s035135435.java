import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CKthSubstring solver = new CKthSubstring();
        solver.solve(1, in, out);
        out.close();
    }

    static class CKthSubstring {
        char[] s;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            s = in.next().toCharArray();
            int k = in.NextInt();
            Substring[] first = new Substring[k];

            for (int i = 0; i < s.length; i++) {
                LOOP:
                for (int j = i; j < s.length; j++) {
                    Substring curr = new Substring();
                    curr.start = i;
                    curr.end = j;
                    if (k != 0) {
                        k--;
                        first[k] = curr;
                        if (k == 0) {
                            Arrays.sort(first);
                        }
                    } else {
                        for (int l = 0; l < first.length; l++) {
                            if (first[l].compareTo(curr) == 0) continue LOOP;
                        }
                        for (int t = first.length - 1; t >= 0; t--) {
                            if (first[t].compareTo(curr) > 0) {
                                if (t == first.length - 1) {
                                    first[t] = curr;
                                } else {
                                    first[t + 1] = first[t];
                                    first[t] = curr;
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < first[first.length - 1].length(); i++) {
                out.print(s[first[first.length - 1].start + i]);
            }
            out.println();
        }

        class Substring implements Comparable<Substring> {
            int start;
            int end;

            int length() {
                return end - start + 1;
            }


            public int compareTo(Substring o) {
                for (int i = 0; i < Math.min(length(), o.length()); i++) {
                    if (s[start + i] != s[o.start + i]) {
                        return Integer.compare(s[start + i], s[o.start + i]);
                    }
                }
                return Integer.compare(length(), o.length());
            }

        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

    }
}

