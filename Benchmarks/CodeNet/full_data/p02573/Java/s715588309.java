import java.util.Scanner;

public class Main {
    static int[] data;
    static int[] w;

    static int root(int q) {
        if (data[q] != q) {
            data[q] = root(data[q]);
        }
        return data[q];
    }

    static void union(int p, int q) {
        int rp = root(p);
        int rq = root(q);
        if (w[rp] > w[rq]) {
            data[rq] = rp;
            w[rp] += w[rq];
        } else {
            data[rp] = rq;
            w[rq] += w[rp];
        }
    }

    static boolean find(int p, int q) {
        return root(p) == root(q);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        data = new int[n];
        w = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = i;
            w[i] = 1;
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (!find(a - 1, b - 1)) union(a - 1, b - 1);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (data[i] == i)
                ans = Math.max(ans, w[i]);
        }
        System.out.println(ans);
    }
}