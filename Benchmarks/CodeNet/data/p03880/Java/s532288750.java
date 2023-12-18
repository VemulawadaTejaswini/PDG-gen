import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(stdin.nextLine());

        int b = Arrays.stream(a).reduce((x, y) -> x ^ y).getAsInt();

        int max = Arrays.stream(a).max().getAsInt();
        int len = 0;
        while (max > 0L) {
            len++;
            max /= 2L;
        }

        int ans = 0;
        for (int i = len; i >= 0; i--) {
            if ((b & (1 << i)) == 0) continue;
            for (int j = 0; j < n; j++) {
                int k = a[j] ^ (a[j] - 1);
                if (k != (1 << (i + 1)) - 1) {
                    ans++;
                    b ^= k;
                }
            }
        }

        System.out.println(b == 0 ? ans : -1);
    }
}
