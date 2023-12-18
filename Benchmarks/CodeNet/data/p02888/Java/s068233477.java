import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] l = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        Arrays.sort(l);

        int ans = 0;
        for (int i = n-1; i > 1; i--) {
            for (int j = i-1; j > 0; j--) {
                int max = l[i] + l[j];
                int min = l[i] - l[j];
                for (int k = 0; k < j; k++) {
                    if (l[k] >= max)
                        break;
                    if (l[k] <= min)
                        continue;
                    ans++;
                }
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