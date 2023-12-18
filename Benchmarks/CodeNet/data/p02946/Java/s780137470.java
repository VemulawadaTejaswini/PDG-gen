
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int x = scanner.nextInt();
        int start = Math.max(-1000000, x + 1 - k);
        int end = Math.min(1000000, x + k - 1);
        for (int i = start; i <= end; ++i) {
            System.out.print(i + " ");
        }
    }
}
