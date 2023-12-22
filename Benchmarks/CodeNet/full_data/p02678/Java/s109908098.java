import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();
        Vector<Integer>[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            vectors[a].add(b);
            vectors[b].add(a);
        }

        int[] ans = new int[n];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int t = queue.poll();
            for (int v : vectors[t]) {
                if (ans[v] == 0) {
                    ans[v] = t + 1;
                    queue.add(v);
                }
            }
        }

        PrintWriter pw = new PrintWriter(System.out);
        boolean isAns = true;
        for (int i = 1; i < n; i++) {
            if (ans[i] == 0) {
                isAns = false;
                break;
            }
            pw.println(ans[i]);
        }

        if (isAns) {
            System.out.println("Yes");
            pw.close();
        } else {
            System.out.println("No");
            pw = null;
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