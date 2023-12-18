import java.util.Scanner;

class Main {
    static final long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];// 自分より小さい数の数

        for (int i = 0; i < n; i++) {
            int num = a[i];
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (num > a[j]) {
                    cnt++;
                }
            }
            b[i] = cnt;
        }
        long c[] = new long[n];
        for (int i = 0; i < n; i++) {
            int num = a[i];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (num > a[j]) {
                    cnt++;
                }
            }
            c[i] = cnt;
        }
        long ans = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            // System.out.print(b[i]);
            sum += b[i];
            sum %= mod;
        }
        for (int i = 0; i < k; i++) {
            ans += sum;
            ans %= mod;
        }
        /*
         * System.out.println(""); for (int i = 0; i < n; i++) {
         * 
         * long wa = c[i] * (k - 1); wa %= mod; ans += wa; ans %= mod; }
         */

        long kk = k - 1;
        long kkk = kk * (kk + 1) / 2;
        for (int i = 0; i < n; i++) {
            ans += kkk * c[i];
            ans %= mod;
        }
        System.out.println(ans);

        sc.close();
    }
}
