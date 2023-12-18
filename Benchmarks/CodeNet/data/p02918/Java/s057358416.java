import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int ans = 0;
        int cnt = 0;
        int changeCnt = 0;
        for (int i = 1; i < n; i++) {
            if (s[i-1] == s[i]) {
                ans++;
            } else {
                if (cnt % 2 == 1 && changeCnt < k) {
                    ans += 2;
                    changeCnt++;
                }
                cnt++;
            }
        }
        if (cnt % 2 == 1 && changeCnt < k)
            ans++;

        System.out.println(ans);
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