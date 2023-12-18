import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 0; i <= n / r; i++) {
            for (int j = 0; j <= n / g; j++) {
                for (int k = 0; k <= n / b; k++) {
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