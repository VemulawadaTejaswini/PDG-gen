
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static class KMP {

        String pattern;
        int[] t;

        public KMP(String pattern) {
            this.pattern = pattern;
            buildTable();
        }

        void buildTable() {
            t = new int[pattern.length()];
            switch (t.length) {
                case 2:
                    t[1] = 0;
                case 1:
                    t[0] = -1;
                case 0:
                    return;
            }

            t[0] = -1;
            t[1] = 0;
            int pos = 2;
            int cnd = 0;
            while (pos < pattern.length()) {
                if (pattern.charAt(pos - 1) == pattern.charAt(cnd)) {
                    // case 1: the substring continues
                    cnd++;
                    t[pos] = cnd;
                    pos++;
                } else if (cnd > 0) {
                    // case 2: it doesn't, but we can fall back
                    cnd = t[cnd];
                } else {
                    // case 3: we have run out of candidates.  Note cnd = 0
                    t[pos] = 0;
                    pos++;
                }
            }
        }

        public List<Integer> searchAll(String text) {
            List<Integer> ret = new ArrayList<Integer>();
            if (t.length == 0) {
                return ret;
            }
            int textIdx = 0, patternIdx = 0;
            while (textIdx < text.length()) {
                if (pattern.charAt(patternIdx) == text.charAt(textIdx)) {
                    if (patternIdx == pattern.length() - 1) {
                        ret.add(textIdx - patternIdx);
                        patternIdx = t[patternIdx];
                    } else { // continue to match next
                        textIdx++;
                        patternIdx++;
                    }
                } else { // fallback
                    patternIdx = t[patternIdx];
                }
                if (patternIdx == -1) {
                    textIdx++;
                    patternIdx++;
                }
            }
            return ret;
        }
    }

    public static void main(String[] args) throws IOException {
        String text = nextString();
        String pattern = nextString();

        KMP kmp = new KMP(pattern);

        for (int pos : kmp.searchAll(text)) {
            out.println(pos);
        }
        out.flush();
    }

    private static final StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static String nextString() throws IOException {
        in.nextToken();
        return in.sval;
    }
}