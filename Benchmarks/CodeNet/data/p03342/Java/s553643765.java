import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for AtCoder Regular Contest 098.
 * Problem available at: https://arc098.contest.atcoder.jp/tasks/arc098_b
 *
 * @author ryosuke
 */
public class Main {

    public static int arrXor(int[] arr) {
        int res = 0;
        for (int n : arr) {
            res ^= n;
        }
        return res;
    }

    public static int arrSum(int[] arr) {
        int res = 0;
        for (int n : arr) {
            res += n;
        }
        return res;
    }

    public static int countXorSumMatches(int n, int[] arr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] currentArr = Arrays.copyOfRange(arr, i, j + 1);
                int xor = arrXor(currentArr);
                int sum = arrSum(currentArr);
                if (xor == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = countXorSumMatches(n, arr);
        System.out.println(res);
        sc.close();
    }
}
