import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int total = a + b;
        int cnt = 0;
        int bCnt = 0;
        for (char c : s) {
            if (c == 'c')
                pw.println("No");
            else if (total > cnt) {
                if (c == 'a') {
                    pw.println("Yes");
                    cnt++;
                } else if (b > bCnt){
                    pw.println("Yes");
                    cnt++;
                    bCnt++;
                } else {
                    pw.println("No");
                }
            } else {
                pw.println("No");
            }
        }

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