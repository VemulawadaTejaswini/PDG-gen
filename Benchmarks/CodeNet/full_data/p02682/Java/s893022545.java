import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();

        int result = Math.min(a, k);
        k -= a + b;
        if (k > 0) {
            result -= k;
        }
        System.out.println(result);
    }
}