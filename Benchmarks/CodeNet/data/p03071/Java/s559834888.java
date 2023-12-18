import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int X = Math.max(2 * A - 1, Math.max(A + B, 2 * B - 1));
        scanner.close();
        // output
        System.out.println(X);
        System.out.flush();
    }
}