import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        String s = scanner.next();
        for (int i = 0; i < 4; i++) {
            boolean[] a = new boolean[n + 2];
            a[0] = (i & 1) == 0;
            a[1] = (i & 2) == 0;
            for (int j = 0; j < n; j++) {
                a[j + 2] = a[j] ^ a[j + 1] ^ s.charAt(j) == 'o';
            }
            if (a[0] == a[n] && a[1] == a[n + 1]) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(a[j] ? "S" : "W");
                }
                System.out.println();
                return;
            }
        }
        System.out.println(-1);
    }
}