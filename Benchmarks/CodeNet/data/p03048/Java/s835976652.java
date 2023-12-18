import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        if (g > r) {
            int x = r;
            r = g;
            g = x;
        }
        if (b > g) {
            int x = g;
            g = b;
            b = x;
        }
        if (g > r) {
            int x = r;
            r = g;
            g = x;
        }


        for (int i = 0; i <= n / r; i++) {
            for (int j = 0; j <= (n - r * i) / g; j++) {
                for (int k = 0; k <= (n - r * i - g * j) / b; k++) {
                    if (r * i + g * j + b * k == n) {
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }
}