import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int d = scanner.nextInt() - 1;
        int x = scanner.nextInt() + n;
        for (int i = 0; i < n; i++) {
            x += d / scanner.nextInt();
        }
        System.out.println(x);
    }
}