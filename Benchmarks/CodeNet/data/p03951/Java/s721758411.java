import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt(), ans = 0;
        String s = scanner.next(), t = scanner.next();
        for (int i = 0; i <= n; i++)
            if (s.substring(n - i).equals(t.substring(0, i)))
                ans = 2 * n - i;
        System.out.println(ans);
    }
}