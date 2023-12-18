import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println(a == b ? 1 : n == 1 || a > b ? 0 : (n - 2) * Math.abs(a - b) + 1);
    }
}