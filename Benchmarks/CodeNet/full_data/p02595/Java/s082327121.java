
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();
        long[] X = new long[N];
        long[] Y = new long[N];
        int count = 0;

        for (int i = 0 ; i < N ; i++) {
            X[i] = scanner.nextLong();
            Y[i] = scanner.nextLong();

            double distance = Math.sqrt(X[i] * X[i] + Y[i] * Y[i]);
            if (distance <= D) {
                count++;
            }
        }

        System.out.println(count);
    }
}
