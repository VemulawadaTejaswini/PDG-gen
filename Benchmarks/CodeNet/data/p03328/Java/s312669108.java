import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((b - a) * (b - a + 1) / 2 - b);
    }
}