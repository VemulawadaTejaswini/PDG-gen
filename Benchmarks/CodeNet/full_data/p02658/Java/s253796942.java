import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            if (a == 0L) {
                System.out.println(0);
                return;
            }
            if (i == 0) {
                ans = a;
            } else {
                ans = ans * a;
            }
        }
        if (ans > 1000000000000000000L) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}