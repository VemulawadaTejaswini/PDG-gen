import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] cnt = new int[n];

        for (int i = 0; i < q; i++) {
            cnt[sc.nextInt() - 1]++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(k - (q - cnt[i]) > 0 ? "Yes" : "No");
        }
    }
}

