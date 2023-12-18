import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        static final String LAST = "zyxwvutsrqponmlkjihgfedcba";
        String S, ans;
        Set<Character> charsInS = new HashSet<>();

        void solve(InputReader in, PrintWriter out) {
            S = in.next();
            for (char c : S.toCharArray()) charsInS.add(c);

            if (S.length() < 26) {
                char last = 'a';
                for (char c = 'a'; c <= 'z'; ++c) {
                    if (!charsInS.contains(c)) {
                        last = c;
                        break;
                    }
                }
                ans = new StringBuilder(S).append(last).toString();
            } else if (S.equals(LAST)) {
                ans = "-1";
            } else {
                TreeSet<Character> available = new TreeSet<>();
                Stack<Character> remains = new Stack<>();
                for (char c : S.toCharArray()) remains.add(c);

                while (!remains.isEmpty()) {
                    char last = remains.pop();
                    if (available.size() > 0) {
                        Character substitute = available.higher(last);
                        if (substitute != null) {
                            StringBuilder tmp = new StringBuilder();
                            for (char c : remains) {
                                tmp.append(c);
                            }
                            tmp.append(substitute);
                            ans = tmp.toString();
                            break;
                        }
                    }
                    available.add(last);
                }
            }

            out.println(ans);
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        int[] nextIntArray(int n) {
        	int[] arr = new int[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextInt();
        	}
        	return arr;
        }

        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}
