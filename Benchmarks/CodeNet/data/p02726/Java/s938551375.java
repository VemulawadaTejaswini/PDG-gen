import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] ans = new int[n];
        for (int i = 1; i <= n - 1; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (j <= x || i >= y) {
                    ans[j - i]++;
                    continue;
                }
                if (i <= x && j >= y) {
                    ans[j - i - (y - x - 1)]++;
                    continue;
                }
                int idx = Math.min(j - i, Math.abs(x - i) + 1 + Math.abs(y - j));
                ans[idx]++;
            }
        }
        for (int i = 1; i < n; i++) {
            System.out.println(ans[i]);
        }
    }

}
