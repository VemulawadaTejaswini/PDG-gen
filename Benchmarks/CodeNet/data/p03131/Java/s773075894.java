import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final long K = sc.nextInt();
        final long A = sc.nextInt();
        final long B = sc.nextInt();
        System.out.println(B - A <= 2 || K <= A ? K + 1 : (K - A + 1) / 2 * (B - A) + A + (K - A + 1) % 2);
    }
}
public class Main {
    public static void main(String...args) {
        C.main();
    }
}
