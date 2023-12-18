
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            sum[i] = 2 * scanner.nextInt();
        }

        int[] res = new int[n];

        int totalSum = 0;

        int mul = 1;

        for (int i = 1; i < sum.length; i++) {
            totalSum += sum[i] * mul;
            mul *= -1;
        }

        int first = (sum[0] - totalSum) / 2;

        res[0] = first;

        for (int i = 1; i < sum.length; i++) {
            res[i] = sum[i - 1] - res[i - 1];
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
