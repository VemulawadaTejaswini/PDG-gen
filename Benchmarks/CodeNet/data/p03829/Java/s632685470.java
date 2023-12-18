import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long[] X = new long[N];
        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextInt();
        }
        long ans = 0;
        for (int i = 0; i < N - 1; i++) {
            if (A * (X[i + 1] - X[i]) < B) {
                ans += A * (X[i + 1] - X[i]);
            } else {
                ans += B;
            }
        }
        System.out.println(ans);
    }
}
