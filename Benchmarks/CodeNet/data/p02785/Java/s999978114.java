import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = scanner.nextInt();
        }
        Arrays.sort(H);
        long sum = 0;
        for (int i = 0; i < N - K; i++) {
            sum += H[i];
        }

        System.out.println(sum);

    }
}
