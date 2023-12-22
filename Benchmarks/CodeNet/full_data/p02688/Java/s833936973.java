import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] okashi = new int[N];

        for (int i = 0; i < K; i++) {
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                int A = scanner.nextInt();
                okashi[A-1]++;
            }
        }

        System.out.println(Arrays.stream(okashi).filter(i -> i == 0).count());
    }
}
