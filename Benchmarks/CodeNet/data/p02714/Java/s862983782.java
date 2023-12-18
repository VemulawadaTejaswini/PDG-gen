import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        long sum = 0;
        int[] cnt = new int[3];
        for (int i = 0; i < n; i++) {
            cnt[checkRGB(s[i])]++;
        }

        int[] cnt2 = new int[3];
        for (int i = 0; i < n-3; i++) {
            cnt2[checkRGB(s[i])]++;

            int[] cnt3 = new int[3];
            for (int j = i+1; j < n-1; j++) {
                cnt3[checkRGB(s[j])]++;
                if (s[i] == s[j])
                    continue;

                int tmp = 3 - checkRGB(s[i]) - checkRGB(s[j]);
                sum += cnt[tmp] - cnt2[tmp] - cnt3[tmp];

                if (j + (j-i) < n && checkRGB(s[j + (j-i)]) == tmp)
                    sum--;
            }
        }

        System.out.println(sum);
    }

    static int checkRGB(char c) {
        if (c == 'R')
            return 0;
        else if (c == 'G')
            return 1;
        else
            return 2;
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