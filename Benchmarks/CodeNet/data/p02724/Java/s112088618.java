import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int X = sc.nextInt();
        final int ans = X / 500 * 1000 + X % 500 / 5 * 5;
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String... args) {
        B.main();
    }
}
