import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        final long A = sc.nextLong();
        final long B = sc.nextLong();

        if (A + B == 0) {
            System.out.println(0);
        } else {
            System.out.println(N / (A + B) * A + (N % (A + B)));
        }
    }
}