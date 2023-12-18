import java.util.Scanner;

public class Main {
    static int N;
    static int A;
    static int B;
    static int C;
    static int[] l;
    static int INF = 1000000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        l = new int[N];

        for (int i = 0; i < N; i++) {
            l[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(dfs(0, 0, 0, 0));
    }

    public static int dfs(int cur, int a, int b, int c) {
        if (cur == N) {
            if (a > 0 && b > 0 && c > 0) {
                return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
            } else {
                return INF;
            }
        }

        int ret0 = dfs(cur + 1, a, b, c);
        int ret1 = dfs(cur + 1, a + l[cur], b, c) + 10;
        int ret2 = dfs(cur + 1, a, b + l[cur], c) + 10;
        int ret3 = dfs(cur + 1, a, b, c + l[cur]) + 10;
        return Math.min(Math.min(Math.min(ret0, ret1), ret2), ret3);
    }
}