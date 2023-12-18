
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int k = in.nextInt();
        int[] cost = new int[n];
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    min = Math.min(min, cost[i - j] + Math.abs(h[i] - h[i - j]));
                } else {
                    break;
                }
            }
            cost[i] = min;
        }
        System.out.println(cost[n - 1]);
    }
}