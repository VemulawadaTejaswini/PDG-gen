import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int D = sc.nextInt();
        final int N = sc.nextInt();
        final int base = new int[]{1, 100, 10000}[D];
        System.out.println(base * N);
    }
}
public class Main {
    public static void main(String...args) {
        B.main();
    }
}