import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for AtCoder Regular Contest 098.
 * Problem available at: https://arc098.contest.atcoder.jp/tasks/arc098_b
 *
 * @author ryosuke
 */
public class Main {

    public static int countMatches(int n, int[] arr) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;

            int a = arr[i];
            int b = a | arr[j];

            while (b == (a ^ arr[j])) {
                a = b;
                j++;
                if (j >= n) break;
                b = b | arr[j];
            }
            count += j - i;
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = countMatches(n, arr);
        System.out.println(res);
        sc.close();
    }
}
