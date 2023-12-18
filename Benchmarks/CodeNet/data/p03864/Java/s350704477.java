import java.util.*;

public class Main {
    private static int[] update(int[] candies) {
        int[] sums = new int[candies.length-1];
        for (int i = 0; i < candies.length-1; i++) {
            sums[i] = candies[i] + candies[i+1];
        }

        return sums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] candies = new int[n];
        int[] sums;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        sums = update(candies);

        for (int i = 0; i < n - 2; i++) {
            while (sums[i] > x && sums[i+1] > x) {
                candies[i+1]--;
                sums[i]--;
                sums[i+1]--;
                ans++;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            ans += Math.max((sums[i] - x), 0);
        }

        System.out.println(ans);
    }
}
