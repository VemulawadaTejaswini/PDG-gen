import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        int ans = solve(n, l);
        System.out.println(ans);
    }

    static int solve(int n, int[] l) {
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int r = binSearch(l, l[i] + l[j]) - 1;
                ans += r - j; // 条件を満たす最大数を都度加算する。
            }
        }
        return ans;
    }

    private static int binSearch(int[] l, int end) {
        int L = 0;
        int R = l.length;
        while (R - L > 1) {

            int M = (L + R) / 2;
            if (l[M] < end) {
                L = M;
            } else {
                R = M;
            }
        }
        return R;
    }
}
