import java.util.*;

import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();

        long ans = 0;
        for (int i = 1; i <= n; i++) {
            long last = (long)Math.floor(n / i) * i;
            ans += (i + last) * last / i / 2;
        }
        System.out.println(ans);

    }
}
