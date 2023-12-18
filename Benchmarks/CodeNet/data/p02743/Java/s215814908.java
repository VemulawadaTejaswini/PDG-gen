import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final long a = sc.nextInt();
        final long b = sc.nextInt();
        final long c = sc.nextInt();
        System.out.println(a + b < c && 4 * a * b < (c - a - b) * (c - a - b) ? "Yes" : "No");
    }
}
public class Main {
    public static void main(String... args) {
        C.main();
    }
}
