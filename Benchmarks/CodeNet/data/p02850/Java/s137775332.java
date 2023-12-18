import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        List[] num = new List[n];

        for (int i = 0; i < n; i++) {
            num[i] = new ArrayList();
        }

        int max = 0;
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int j = 1;
            for ( ; ; j++) {
                if (num[a].indexOf(j) < 0 && num[b].indexOf(j) < 0) {
                    break;
                }
            }
            num[a].add(j);
            num[b].add(j);
            pw.println(j);
            max = Math.max(max, j);
        }

        System.out.println(max);
        pw.flush();
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