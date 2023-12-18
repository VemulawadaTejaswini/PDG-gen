import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt()-1;
        }

        int cnt = 0;
        boolean[] isVisit = new boolean[n];
        int[] visit = new int[n];
        visit[0] = 0;
        do {
            int p = visit[cnt];
            isVisit[p] = true;
            visit[++cnt] = a[p];
        } while (!isVisit[visit[cnt]]);

        int dist = 1;
        int loopPoint = 0;
        for (int i = cnt-1; i >= 0; i--) {
            if (visit[cnt] == visit[i]) {
                loopPoint = i;
            }
            dist++;
        }

        long ansPoint = loopPoint + (k - cnt) % dist;
        System.out.println(visit[(int)ansPoint]+1);   // 剰余を取っているから大丈夫
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