import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] B = new int[N];

        for (int i = 0; i < N - 1; i++) {
            int An = scanner.nextInt();
            B[An - 1]++;
        }

        for (int b: B) {
            System.out.println(b);
        }
    }
}
