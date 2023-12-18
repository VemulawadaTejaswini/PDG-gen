import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    static int n;
    static int m;
    static int[] keyPrices;
    static int[][] keys;
    static int best = Integer.MAX_VALUE;

    private static int check(int i, boolean[] treasures, int sum) {
        if (i >= m) {
            return Integer.MAX_VALUE;
        }

        if (sum >= best) {
            return sum;
        }

        // Buy
        int sumInCaseBuy;
        {
            int newSum = sum + keyPrices[i];
            boolean[] newTreasures = Arrays.copyOf(treasures, n);
            int[] key = keys[i];
            boolean complete = true;
            for (int ii = 0; ii < n; ii++) {
                if (key[ii] == 1) {
                    newTreasures[ii] = true;
                }
                if (!newTreasures[ii]) {
                    complete = false;
                }
            }

            if (complete) {
                if (newSum < best) {
                    best = newSum;
                }
                sumInCaseBuy = newSum;
            }
            else {
                sumInCaseBuy = check(i + 1, newTreasures, newSum);
            }
        }

        // Stay
        int sumInCaseStay = check(i + 1, treasures, sum);

        return Math.min(sumInCaseBuy, sumInCaseStay);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        keyPrices = new int[m];
        keys = new int[m][n];
        for (int i = 0; i < m; i++) {
            keyPrices[i] = scanner.nextInt();
            int b = scanner.nextInt();
            int[] ks = new int[n];
            for (int j = 0; j < n; j++) {
                ks[j] = 0;
            }

            for (int j = 0; j < b; j++) {
                ks[scanner.nextInt() - 1] = 1;
            }
            keys[i] = ks;
        }

        boolean[] treasures = new boolean[n];
        for (int i = 0; i < n; i++) {
            treasures[i] = false;
        }

        int result = check(0, treasures, 0);
        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else {
            System.out.println(result);
        }
    }
}

