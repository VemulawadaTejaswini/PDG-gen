import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();

            double res = 0;
            for (int n = 0; n < N; n++) {
                res += (1.0 / N) * count(n + 1, K);
            }
            System.out.println(res);
        }
    }

    private static double count(int i, int k) {
        double prob = 1;
        for (int j = i; j < k; j *= 2) {
            prob *= 0.5;
        }
        return prob;
    }

}
