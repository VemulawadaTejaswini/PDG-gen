import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = scanner.nextInt();
        }
        long sum = 0;
        for (int j = 0; j < N - 1; j++) {
            for (int i = j + 1; i < N; i++) {
                sum += d[i] * d[j];
            }
        }

        System.out.println(sum);
    }
}