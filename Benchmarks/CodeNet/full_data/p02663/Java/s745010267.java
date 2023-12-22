import java.util.Scanner;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int H1 = sc.nextInt();
        final int M1 = sc.nextInt();
        final int H2 = sc.nextInt();
        final int M2 = sc.nextInt();
        final int K = sc.nextInt();
        final int d = H2 * 60 + M2 - H1 * 60 - M1;
        System.out.println(d - K);
    }
}
public class Main {
    public static void main(String... args) {
        A.main();
    }
}
