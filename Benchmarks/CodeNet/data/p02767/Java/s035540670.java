
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] X = new int[N + 1];

        int total = 0;
        for (int i = 1 ; i <= N ; i++) {
            X[i] = scanner.nextInt();
            total += X[i];
        }

        int ave = total / N;
        int ave1 = ave + 1;

        int p = 0;
        int p1 = 0;
        for (int i = 1 ; i <= N ; i++) {
            p += (X[i] - ave) * (X[i] - ave);
            p1 += (X[i] - ave1) * (X[i] - ave1);
        }

        System.out.println(Math.min(p, p1));

    }
}
