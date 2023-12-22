import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();

        long a = sc.nextLong();
        boolean over = false;
        for (int i = 1; i < n; i++) {
            long m = sc.nextLong();
            if (m == 0) {
                System.out.println(0);
                return;
            }

            if (Math.log10(a) + Math.log10(m) > 18) {
                over = true;
            }
            a *= m;
        }
        if (over || a > 1000000000000000000L) {
            System.out.println(-1);
            return;
        }
        System.out.println(a);
    }
}
