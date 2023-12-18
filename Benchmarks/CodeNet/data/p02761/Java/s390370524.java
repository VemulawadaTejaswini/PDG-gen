
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] num = new int[N + 1];

        for (int i = 0 ; i < M ; i++) {
            int si = scanner.nextInt();
            int ci = scanner.nextInt();

            if (N > 1 && si == 1 && ci == 0) {
                System.out.println(-1);
                return;
            }
            if (num[si] != 0 && num[si] != ci) {
                System.out.println(-1);
                return;
            }
            num[si] = ci;
        }
        if (num[1] == 0) num[1] = 1;

        int ans = 0;
        int digit = 1;
        for (int i = N ; i > 0 ; i--) {
            ans += num[i] * digit;
            digit *= 10;
        }

        System.out.println(ans);
    }
}
