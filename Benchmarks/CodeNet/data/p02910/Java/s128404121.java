import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();

        boolean isAns = true;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'R' && i % 2 == 1) {
                isAns = false;
                break;
            } else if (s[i] == 'L' && i % 2 == 0) {
                isAns = false;
                break;
            }
        }

        System.out.println(isAns ? "Yes" : "No");
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}