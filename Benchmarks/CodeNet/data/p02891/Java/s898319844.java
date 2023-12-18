import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();

        List<Integer> list = new ArrayList<>();
        int cnt = 1;
        for (int i = 1; i < s.length; i++) {
            if (s[i-1] == s[i]) {
                cnt++;
            } else {
                list.add(cnt);
                cnt = 1;
            }
        }
        list.add(cnt);

        long ans = 0;
        if (list.size() == 1) {
            ans = s.length * k / 2;
        } else {
            for (Integer i : list) {
                if (i > 1)
                    ans += i / 2 * k;
            }

            if (s[0] == s[s.length-1]) {
                long tmp = list.get(0) / 2 + list.get(list.size()-1) / 2;
                tmp -= (list.get(0) + list.get(list.size()-1)) / 2;
                ans -= tmp * (k-1);
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