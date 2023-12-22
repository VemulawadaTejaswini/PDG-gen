import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 0) {

            int[] scores = new int[n];

            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
            }

            Arrays.sort(scores);

            int sum = 0;

            for (int i = 1; i < n - 1; i++) {
                sum += scores[i];
            }

            double ave = (double) sum / (n - 2);

            System.out.println((int) ave);

            n = sc.nextInt();
        }

        sc.close();
    }
}
