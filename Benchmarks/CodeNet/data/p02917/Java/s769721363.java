import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        final int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = b[0];
        for (int i = 0; i < n - 2; i++) {
            sum += Math.min(b[i], b[i + 1]);
        }
        sum += b[b.length - 1];

        System.out.println(sum);
    }
}