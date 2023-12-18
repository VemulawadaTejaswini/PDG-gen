import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                int val = i * (m - j) + j * (n - i);
                set.add(val);
            }
        }

        if (set.contains(k)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}