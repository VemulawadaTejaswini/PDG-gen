import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;

        for (int i = 1; i <= n; i++) {
            // bの値を動かす
            if (i - 1 < k) {
                continue;
            }
            int setCount = n / i;
            int canUse = i - k;
            ans += setCount * canUse;
            if (n % i - k >= 0) {
                ans += (n % i) - k + 1;
            }
        }
        if (k == 0) {
            ans = n * n;
        }
        System.out.println(ans);
        sc.close();
    }
}
