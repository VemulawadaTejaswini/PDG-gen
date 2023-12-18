import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final long H = sc.nextInt();
        final long W = sc.nextInt();
        final long ans = (H / 2 * 2) * (W / 2 * 2) / 2 + (H % 2) * (W / 2) + (W % 2) * (H / 2) + (H % 2) * (W % 2);
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String... args) {
        B.main();
    }
}
