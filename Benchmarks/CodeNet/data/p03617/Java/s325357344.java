import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IceTea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> teas = new ArrayList<>();
        teas.add(Arrays.asList(1, sc.nextInt()));
        teas.add(Arrays.asList(2, sc.nextInt()));
        teas.add(Arrays.asList(4, sc.nextInt()));
        teas.add(Arrays.asList(8, sc.nextInt()));

        int N = sc.nextInt();

        long[] dp = new long[N*4 + 1];

        for (int i = 1; i < dp.length; i++) {
            long min = Integer.MAX_VALUE;
            for (List<Integer> tea : teas) {
                int deno = tea.get(0);
                int price = tea.get(1);
                if (i >= deno && dp[i - deno] != -1) {
                    min = Math.min(min, dp[i - deno] + price);
                }

                if (min != Integer.MAX_VALUE)
                    dp[i] = min;
                else
                    dp[i] = -1;
            }
        }

        System.out.println(dp[dp.length - 1]);
    }
}
