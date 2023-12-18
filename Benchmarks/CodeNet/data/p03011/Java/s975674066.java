import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(Math.min(Math.min(p + q, p + r), q + r));
    }
}