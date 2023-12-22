import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private int n;
    private int[] a;

    private void run() {
        n = sc.nextInt();
        a = new int[n+1];
        a[n] = 1000001;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean[] check = new boolean[1000001];
        Arrays.sort(a);
        Arrays.fill(check, true);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i + 1] != a[i] && check[a[i]]) {
                ans++;
            }

            for (int j = a[i]; j <= a[n - 1]; j += a[i]) {
                check[j] = false;
            }
        }

        System.out.println(ans);
    }
}
