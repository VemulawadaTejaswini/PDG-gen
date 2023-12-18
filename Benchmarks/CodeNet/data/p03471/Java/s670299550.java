import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Y = scanner.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                int k = N - i - j;
                if (k >= 0) {
                    int sum = 10000 * i + 5000 * j + 1000 * k;
                    if (sum == Y) {
                        System.out.print(String.format("%d %d %d", i, j, k));
                        return;
                    }
                }
            }
        }
        System.out.print(String.format("%d %d %d", -1, -1, -1));
    }
}