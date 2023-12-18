import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrays = new int[N];

        for (int i = 0; i < N; i++) {
            arrays[i] = scanner.nextInt();
        }

        int result = 0;
        out: for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arrays[j] < arrays[i]) {
                    continue out;
                }
            }
            result++;
        }

        System.out.println(result);
    }
}
