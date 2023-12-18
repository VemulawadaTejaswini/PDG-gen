import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        private String s;
        private String t;
        private Positions[] pos;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            s = in.next();
            t = in.next();
            pos = new Positions[26];
            for (int i = 0; i < 26; i++)
                pos[i] = new Positions();
            if (!existAnswer())
                out.println(-1);
            else {
                int l1 = s.length();
                int l2 = t.length();
                for (int i = 0; i < l1; i++)
                    pos[s.charAt(i) - 'a'].ind.add(i);
                int lastJ = 0;
                long ans = 0;
                for (int i = 0; i < l2; i++) {
                    char cur = t.charAt(i);
                    int pos = binarySearch(lastJ, (int) (cur - 'a'));
                    long dif;
                    if (pos >= lastJ)
                        dif = pos - lastJ + 1;
                    else {
                        dif = l1 - 1 - lastJ + 1;
                        dif += pos + 1;
                    }
                    ans += dif;
                    lastJ = pos + 1;
                    if (pos >= l1)
                        lastJ = 0;
                }
                out.println(ans);
            }
        }

        private int binarySearch(int s, int numC) {
            int l = -1;
            int r = pos[numC].ind.size();
            int pos = simpleBinarySearch(l, r, numC, s);
            if (pos != -1)
                return pos;
            else {
                pos = simpleBinarySearch(l, r, numC, 0);
                return pos;
            }
        }

        private int simpleBinarySearch(int l, int r, int numC, int s) {
            while (l + 1 < r) {
                int mid = (l + r) / 2;
                int midPos = pos[numC].ind.get(mid);
                if (midPos == s)
                    return s;
                if (midPos < s)
                    l = mid;
                else
                    r = mid;
            }
            for (int i = Math.max(0, l); i <= Math.min(pos[numC].ind.size() - 1, r); i++) {
                int curPos = pos[numC].ind.get(i);
                if (curPos >= s)
                    return curPos;
            }
            return -1;
        }

        private boolean existAnswer() {
            int[] c1 = f(s);
            int[] c2 = f(t);
            for (int i = 0; i < 26; i++)
                if (c2[i] > 0 && c1[i] == 0)
                    return false;
            return true;
        }

        private int[] f(String s) {
            int[] c = new int[26];
            for (int i = 0, l = s.length(); i < l; i++)
                c[s.charAt(i) - 'a']++;
            return c;
        }

        private class Positions {
            private ArrayList<Integer> ind;

            public Positions() {
                this.ind = new ArrayList<>();
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

    }
}

