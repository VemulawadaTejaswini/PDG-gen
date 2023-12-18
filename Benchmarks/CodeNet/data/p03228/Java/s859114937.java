import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                b += a / 2;
                a /= 2;
            } else {
                a += b / 2;
                b /= 2;
            }
        }
        System.out.println(a + " " + b);
    }
}