package C;

import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {
    public static void main(final String[] args) {
        final InputStream inputStream = System.in;
        final OutputStream outputStream = System.out;
        final InputReader in = new InputReader(inputStream);
        final PrintWriter out = new PrintWriter(outputStream);
        final Solution solver = new Solution();
        solver.solve(in, out);
        out.close();
    }

    static class Solution {
        void solve(final InputReader in, final PrintWriter out) {
            final String text = in.next().replaceAll(Pattern.quote("?"), ".");
            final String pattern = in.next();
            String minimumText = "~";
            for (int i = 0; i + pattern.length() <= text.length(); i++) {
                if (pattern.matches(text.substring(i, i + pattern.length()))) {
                    final String replacedText = text.subSequence(0, i) + pattern + text.substring(i + pattern.length());
                    if (replacedText.compareTo(minimumText) < 0) {
                        minimumText = replacedText.replaceAll(Pattern.quote("."), "a");
                    }
                }
            }
            if (minimumText.equals("~")) {
                out.println("UNRESTORABLE");
            } else {
                out.println(minimumText);
            }
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(final InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (final IOException e) {
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
