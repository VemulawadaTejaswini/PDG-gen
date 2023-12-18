import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ans = new int[m];
        Arrays.fill(ans, 0);
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int b = sc.nextInt();
                ans[b - 1]++;
            }
        }
        int answe = 0;
        for (int i = 0; i < m; i++) {
            if (ans[i] == n) {
                answe++;
            }
        }
        System.out.println(answe);

    }
}