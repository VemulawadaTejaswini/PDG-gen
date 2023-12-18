import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] values = new int[N];

        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }

        long m = 1;
        for (int i = 0; i < N; i++) {
            m = (m * values[i]);
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += (m - 1) % (long)values[i];
        }
        System.out.println(ans);
    }

    static int gcd(int x, int y) {
        while (true) {
            int tmp = x % y;
            if (tmp == 0) {
                return y;
            }
            x = y;
            y = tmp;
        }
    }
}
