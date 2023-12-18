import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();

        int max = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            if (max > p) ans++;
            max = Math.max(p, max);
        }
        System.out.println(ans);
    }
}
