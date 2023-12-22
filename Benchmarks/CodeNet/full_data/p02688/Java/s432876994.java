import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] count = new int[n+1];
        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                count[sc.nextInt()]++;
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) ans++;
        }
        System.out.println(ans);
    }
}
