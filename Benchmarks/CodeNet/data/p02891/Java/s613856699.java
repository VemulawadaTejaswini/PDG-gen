// AGC039_A 解説を見て書いた
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        long ans = 0;

        List<Integer> cntList = new ArrayList<>();
        int cnt = 1;
        for (int i = 1; i < s.length; i++) {
            if (s[i-1] == s[i]) {
                cnt++;
            } else if (cnt > 0) {
                cntList.add(cnt);
                cnt = 1;
            }
        }
        cntList.add(cnt);

        // sが全て同じ文字だった場合
        if (cntList.size() == 0) {
            ans = s.length * k / 2;
        } else {
            for (int i : cntList) {
                ans += i / 2;
            }
            ans *= k;

            if (s[0] == s[s.length-1]) {
                int a = cntList.get(0);
                int b = cntList.get(cntList.size()-1);
                ans -= (a/2 + b/2 - (a+b)/2) * (k-1);
            }
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