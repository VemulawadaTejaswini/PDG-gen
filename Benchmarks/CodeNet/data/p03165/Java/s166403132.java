import java.io.*;
import java.util.*;
import java.math.*;

public class Main {


    public static void solve() {
        String s = in.nextLine();
        String t = in.nextLine();

        int[][] store = new int[s.length()+1][t.length()+1];

        for(int i = 1; i <= s.length(); i += 1) {
            for(int j = 1; j <= t.length(); j += 1) {
                if(s.charAt(i-1) == t.charAt(j-1))
                    store[i][j] = 1 + store[i-1][j-1];
                else
                    store[i][j] = Math.max(store[i-1][j], store[i][j-1]);
            }
        }

        int length = store[s.length()][t.length()];
        char[] lcs = new char[length];

        int index = length-1;

        int i = s.length(), j = t.length();
        while (i > 0 && j > 0)
        {
            // If current character in X[] and Y are same, then
            // current character is part of LCS
            if (s.charAt(i-1) == t.charAt(j-1))
            {
                // Put current character in result
                lcs[index] = s.charAt(i-1);
                i -= 1;
                j -= 1;
                index -= 1;
            }
            else if (store[i-1][j] > store[i][j-1])
                i -= 1;
            else
                j -= 1;
        }



        out.println(lcs);
    }


    public static InputReader in = new InputReader();
    public static PrintWriter out;

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        /**
         * When you call next(), that entire line will be skipped.
         * No flushing buffers.
         * Doesn't work when you want to scan the remaining line.
         *
         * @return entire line
         */
        public String nextLine() {
            String str = "";
            try {
                str = reader.readLine();
                tokenizer = null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }
    }
}