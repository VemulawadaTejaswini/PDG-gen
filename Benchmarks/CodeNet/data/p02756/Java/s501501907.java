import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();

        Stack<Character> top = new Stack<>();
        Stack<Character> bottom = new Stack<>();

        top.push(s[0]);
        bottom.push(s[s.length-1]);

        int q = sc.nextInt();
        int change = 0;
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (t == 1) {
                change++;
            } else {
                int f = sc.nextInt();
                char c = sc.next().charAt(0);

                if (change % 2 == 1)
                    ChangeStack(top, bottom);
                change = 0;

                if (f == 1)
                    top.push(c);
                else
                    bottom.push(c);
            }
        }

        if (change % 2 == 1)
            ChangeStack(top, bottom);

        char[] ans = new char[s.length + top.size() + bottom.size() - 2];
        int i = 0;
        while (top.size() > 0)
            ans[i++] = top.pop();

        for (int j = 1; j < s.length-1; j++)
            ans[i++] = s[j];

        int j = ans.length-1;
        while (bottom.size() > 0)
            ans[j--] = bottom.pop();

        System.out.println(String.valueOf(ans));
    }

    static void ChangeStack(Stack<Character> top, Stack<Character> bottom) {
        char tmp = top.pop();
        top.push(bottom.pop());
        bottom.push(tmp);
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