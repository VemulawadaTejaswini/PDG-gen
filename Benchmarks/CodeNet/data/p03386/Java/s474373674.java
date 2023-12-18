import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            set.add(Math.min(a + i, b));
            set.add(Math.max(b - i, a));
        }
        for (int i : set) {
            System.out.println(i);
        }
    }
}