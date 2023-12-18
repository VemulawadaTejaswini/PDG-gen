import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int min = 10;
        for (int i = 0; i < 5; i++) {
            int b = a[i] % 10;
            if (b != 0) {
                if (min > b) {
                    min = b;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            if (a[i] % 10 == 0) {
                ans += a[i];
            } else {
                int c = a[i] / 10;
                int d = c * 10 + 10;
                ans += d;
            }
        }
        if (min != 10) {
            ans -= 10;
            ans += min;
        }
        System.out.println(ans);

    }
}