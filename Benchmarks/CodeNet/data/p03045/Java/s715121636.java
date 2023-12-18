import java.util.Scanner;

import tool.Tools.UnionFind;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] X = new int[M];
        int[] Y = new int[M];
        int[] Z = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = scanner.nextInt() - 1;
            Y[i] = scanner.nextInt() - 1;
            Z[i] = scanner.nextInt() - 1;
        }
        UnionFind find = new UnionFind(N);
        for (int i = 0; i < M; i++) {
            find.connect(X[i], Y[i]);
        }
        boolean[] ans = new boolean[N];
        for (int i = 0; i < N; i++) {
            ans[find.root(i)] = true;
        }
        int cnt = 0;
        for (boolean b : ans) {
            if (b) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
