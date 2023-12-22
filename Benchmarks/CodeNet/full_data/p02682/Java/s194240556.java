import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long K = scanner.nextLong();
        scanner.close();

        long ans = 0l;

        if (A <= K) {
            System.out.println(A);
        } else if (A + B <= K) {
            System.out.println(A);
        } else {
            System.out.println(A - (K - A - B));
        }
    }
}