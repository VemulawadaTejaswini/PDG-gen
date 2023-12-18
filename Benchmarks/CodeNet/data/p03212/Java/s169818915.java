import java.util.*;
public class Main {
    static int ans = 0;
    static int[] check = new int[3];
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        dfs(n, 0, 0, check);
        System.out.println(ans);
    }
    public static void dfs(int n, int m, int d, int[] check) {
        if (m <= n && check[0] > 0 && check[1] > 0 && check[2] > 0) ans++;
        if (d >= 9) return;
        for (int i = 1; i <= 3; i++) {
            check[i - 1]++;
            dfs(n, 10 * m + 2 * i + 1, d + 1, check);
            check[i - 1]--;
        }
    }
}