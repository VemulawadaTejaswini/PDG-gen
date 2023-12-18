import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        Human[] a = new Human[n];

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            a[i] = new Human(i, h);
        }

        Arrays.sort(a, Comparator.comparing(Human::getH));

        int ans = 0;
        for (int i = a.length-1; i >= 0; i--) {
            if (a[i].h >= n)
                continue;

            for (int j = 0; j < i; j++) {
                int num = Math.abs(a[i].num - a[j].num);
                int h = a[i].h + a[j].h;

                if (h > n)
                    break;

                if (num == h)
                    ans++;
            }
        }

        System.out.println(ans);
    }

    static class Human {
        int num, h;

        Human(int num, int h) {
            this.num = num;
            this.h = h;
        }

        int getH() {
            return this.h;
        }
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