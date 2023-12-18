import java.util.Scanner;
import java.util.HashMap;

public class Main {

    static int[] memo;
    static int getSum(int[] a, int i, int j) {
        if (i == 0) {
            return memo[j];
        } else {
            return memo[j] - memo[i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        memo = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            memo[i] = sum;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (getSum(a, i, j) == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}