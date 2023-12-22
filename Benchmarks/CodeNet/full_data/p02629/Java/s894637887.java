import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long n = sc.nextLong();

        Stack<Character> stack = new Stack<>();
        while (n > 26) {
            int t = (int)(n % 26);
            if (t == 0) {
                t = 26;
                n -= 26;
            }

            char c = (char)('a' + t - 1);
            //System.out.println(c);
            stack.push(c);
            //n -= 26;
            n /= 26;
        }
        //System.out.println((char)('a' + n - 1));
        stack.push((char)('a' + n - 1));

        PrintWriter pw = new PrintWriter(System.out);
        while (!stack.empty()) {
            pw.print(stack.pop());
        }

        pw.println();
        pw.flush();
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