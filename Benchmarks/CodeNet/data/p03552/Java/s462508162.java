import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int z = scanner.nextInt();
        int w = scanner.nextInt();
        int[] a = new int[n];
        Arrays.setAll(a, i -> scanner.nextInt());
        System.out.println(n == 1 ? Math.abs(a[0] - w) : Math.max(Math.abs(a[n - 1] - w), Math.abs(a[n - 2] - a[n - 1])));
    }
}