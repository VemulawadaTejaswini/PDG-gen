import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }

        int q = sc.nextInt();
        int change = 0;
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();

            if (t == 1) {
                change++;
            } else {
                if (change % 2 == 1)
                    ChangeList(list);
                change = 0;

                int f = sc.nextInt();
                char c = sc.next().charAt(0);

                if (f == 1)
                    list.add(0, c);
                else
                    list.add(c);
            }
        }

        if (change % 2 == 1)
            ChangeList(list);

        PrintWriter pw = new PrintWriter(System.out);
        for (char c : list)
            pw.print(c);

        pw.flush();
    }

    static void ChangeList(List<Character> list) {
        char t = list.get(0);
        list.set(0, list.get(list.size()-1));
        list.set(list.size()-1, t);
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