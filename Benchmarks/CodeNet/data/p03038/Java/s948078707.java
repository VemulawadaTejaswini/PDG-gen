import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Long, Long> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            if (map.containsKey(a))
                map.put(a, map.get(a) + 1);
            else
                map.put(a, 1L);
        }

        for (int i = 0; i < m; i++) {
            long b = sc.nextLong();
            long c = sc.nextLong();
            Object[] set = map.keySet().toArray();
            for (Object j : set) {
                long k = (long)j;
                if (k < c) {
                    long add = 0;
                    if (map.get(k) <= b) {
                        add = map.get(k);
                        map.remove(k);
                    } else {
                        add = b;
                        map.put(k, map.get(k)-b);
                    }
                    b -= add;

                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + add);
                    } else {
                        map.put(c, add);
                    }
                } else {
                    break;
                }

                if (b <= 0)
                    break;
            }
        }

        long ans = 0;
        for (long i : map.keySet())
            ans += i * map.get(i);
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