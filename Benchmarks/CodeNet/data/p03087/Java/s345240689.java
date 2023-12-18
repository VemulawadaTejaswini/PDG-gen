
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        String s = sc.next();
        int[] cnt = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
                cnt[i + 1] += 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            cnt[i] += cnt[i - 1];
        }

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            int ans = cnt[r] - cnt[l - 1];
            if (s.charAt(l - 1) == 'C' && l > 2 && s.charAt(l - 2) == 'A') ans--;
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
