import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        new Main().solve();
    }

    private void solve() {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = in.nextInt();
            }

            long sum = 0;
            for (int i = 1; i < N; i++) {
                sum += Math.min(A * (X[i] - X[i - 1]), B);
            }

            System.out.println(sum);
        }
    }

}
