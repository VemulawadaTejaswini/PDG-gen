import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'R') {
                cnt++;
                for (int j = i+1; j < s.length; j++) {
                    if (s[j] == 'R')
                        cnt++;
                    else
                        break;
                }
                max = Math.max(cnt, max);
                cnt = 0;
            }
        }

        System.out.println(max);
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