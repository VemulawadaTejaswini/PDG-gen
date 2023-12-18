import java.util.*;
public class Main {
    static int N, A, B, C;
    static int[] l;
    static final int INF = 1000000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        l = new int[N];
        for (int i = 0; i < N; i++) {
            l[i] = sc.nextInt();
        }
        System.out.println(dfs(0, 0, 0, 0));
        sc.close();
    }
    static int dfs(int i, int a, int b, int c) {
        if (i == N) {
            if (a == 0 || b == 0 || c == 0) {
                return INF;
            }
            return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C);
        }

        int res = dfs(i + 1, a, b, c);
        if (a == 0) {
            res = Math.min(res, dfs(i + 1, a + l[i], b, c));
        } else {
            res = Math.min(res, dfs(i + 1, a + l[i], b, c) + 10);
        }
        if (b == 0) {
            res = Math.min(res, dfs(i + 1, a, b + l[i], c));
        } else {
            res = Math.min(res, dfs(i + 1, a, b + l[i], c) + 10);
        }
        if (c == 0) {
            res = Math.min(res, dfs(i + 1, a, b, c + l[i]));
        } else {
            res = Math.min(res, dfs(i + 1, a, b, c + l[i]) + 10);
        }

        return res;
    }
}