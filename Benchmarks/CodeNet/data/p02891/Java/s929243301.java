// AGC039_A 解説を見て書いた
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        long ans = 0;

        boolean isSame = true;
        for (int i = 1; i < s.length; i++) {
            if (s[0] != s[1]) {
                isSame = false;
                break;
            }
        }

        if (isSame) {  // 全て同じ文字だった場合
            ans = s.length / 2 * k;
        } else {
            List<Integer> cntList = new ArrayList<>();

            int cnt = 1;
            for (int i = 1; i < s.length; i++) {
                if (s[i-1] != s[i]) {
                    cntList.add(cnt);
                    cnt = 1;
                } else {
                    cnt++;
                }
            }
            cntList.add(cnt);

            int listSize = cntList.size();
            for (int i = 1; i < listSize-1; i++) {
                ans += cntList.get(i) / 2 * k;
            }
            if (s[0] == s[s.length-1]) {
                ans += (cntList.get(0) + cntList.get(listSize-1)) / 2 * (k-1);
                ans += cntList.get(listSize-1) / 2;
            } else {
                ans += cntList.get(0) / 2 * k;
                ans += cntList.get(listSize-1) / 2 * k;
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