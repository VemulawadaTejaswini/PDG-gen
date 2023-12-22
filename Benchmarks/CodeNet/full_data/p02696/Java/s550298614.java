import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long N = scanner.nextLong();

        long ans = 0;
        scanner.close();

        for (long i = 1l; i < N; i++) {
            if (A * i / B - A * (i / B) > ans) {
                ans = A * i / B - A * (i / B);
            }
        }

        System.out.println(ans);
    }
}
