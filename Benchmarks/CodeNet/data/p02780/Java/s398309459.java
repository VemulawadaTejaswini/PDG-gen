import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }

            double[] E = new double[N];
            for (int i = 0; i < N; i++) {
                E[i] = (1 + P[i]) / 2.0;
            }

            double sum = 0;
            for (int i = 0; i < K; i++) {
                sum += E[i];
            }

            double max = sum;
            for (int i = K; i < N; i++) {
                sum += E[i] - E[i - K];
                max = Math.max(max, sum);
            }

            System.out.println(max);
        }
    }

}
