// 参考 -> https://atcoder.jp/contests/abc146/submissions/8713526
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        Node[] tree = new Node[n];
        int[] index = new int[n-1];

        for (int i = 0; i < n; i++) {
            tree[i] = new Node();
        }

        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            index[i] = b;

            tree[a].child.add(b);
        }

        tree[0].color = 0;
        for (int i = 0; i < n; i++) {
            int nowColor = 1;
            int myColor = tree[i].color;

            for (int j : tree[i].child) {
                if (nowColor == myColor)
                    nowColor++;

                tree[j].color = nowColor;
                nowColor++;
            }
        }

        int max = 0;
        for (Node node : tree) {
            max = Math.max(max, node.color);
        }

        pw.println(max);
        for (int i = 0; i < n-1; i++) {
            pw.println(tree[index[i]].color);
        }
        pw.flush();
    }

    static class Node {
        int color;
        List<Integer> child;

        Node() {
            child = new ArrayList<>();
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