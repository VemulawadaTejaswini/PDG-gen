import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        long ans = 0;

        int cnt = 0;
        for (int i = 1; i < s.length; i++) {
            if (s[i-1] == s[i]) {
                cnt++;
                s[i] = '★';  // 別の文字に置換
            }
        }

        // 最初と最後が同じ文字の場合、最後の文字を置換する
        // k回目は最後なので置換する必要がない為、ans-1する
        if (s[0] == s[s.length-1]) {
            cnt++;
            ans--;
        }

        // 文字列の長さが１だった場合、k/2が答えとなる
        if (s.length == 1) {
            ans = k / 2;
        } else {
            ans += cnt * k;
        }
        
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