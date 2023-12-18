import java.util.Scanner;

public class Main {

    static int n, A, B, C, l[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        l = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        System.out.println(dfs(0, 0, 0, 0));
    }

    static int dfs(int cur, int a, int  b, int c) {
        if (cur == n) {
            if (a <= 0 || b <= 0 || c <= 0)
                return 99999;
            return Math.abs(a-A) + Math.abs(b-B) + Math.abs(c-C)-30;
        }

        int ret0 = dfs(cur+1, a, b, c);
        int ret1 = dfs(cur+1, a+l[cur], b, c)+10;
        int ret2 = dfs(cur+1, a, b+l[cur], c)+10;
        int ret3 = dfs(cur+1, a, b, c+l[cur])+10;

        int min = Math.min(Math.min(ret0, ret1), Math.min(ret2, ret3));
        return min;
    }
}
