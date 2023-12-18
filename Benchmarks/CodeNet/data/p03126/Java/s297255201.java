import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] food = new int[m+1];
        Arrays.fill(food, 0);
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int a = sc.nextInt();
                food[a] += 1;
            }
        }
        int ans = 0;
        for (int i = 0; i <= m; i++) {
            if (food[i] == n) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}