import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        String s = scanner.next();
        for (int i = 0; i < 4; i++) {
            boolean[] a = new boolean[n + 1];
            a[0] = a[n] = (i & 1) == 0;
            a[1] = (i & 2) == 0;
            for (int j = 2; j <= n; j++) {
                a[j] = a[j - 2] ^ a[j - 1] ^ s.charAt(j - 1) == 'o';
            }
            if (a[0] == a[n]) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j] ? "S" : "W");
                }
                System.out.println();
                return;
            }
        }
        System.out.println(-1);
    }
}