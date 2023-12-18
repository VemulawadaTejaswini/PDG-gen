import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        Arrays.sort(w);

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum1 += w[i];
            } else {
                sum2 += w[i];
            }
        }

        System.out.println((sum1 > sum2) ? sum1 - sum2 : sum2 - sum1);
    }

}