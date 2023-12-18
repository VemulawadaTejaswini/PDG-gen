import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] x = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += 2 * Math.min(Math.abs(x[i] - 0), Math.abs(x[i] - K));
            }
            System.out.println(sum);
        }
    }
}
