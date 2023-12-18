import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt(), b = scanner.nextInt(), x = scanner.nextInt();
        System.out.println(a <= x && x <= a + b ? "YES" : "NO");
    }
}