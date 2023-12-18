import java.util.Scanner;

class Main {
    static final long mod = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        long[] ans = new long[w];
        for (int j = 0; j < w; j++) {
            ans[j] = 1;
            if (j < b) {

            }
        }
        for (int i = 1; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i >= h - a && j <= b - 1) {
                    ans[j] = 0;
                } else {

                    if (j == 0) {
                        ans[j] = ans[j];
                    } else {
                        ans[j] = (ans[j] + ans[j - 1]) % mod;
                    }
                }
            }
        }

        System.out.println(ans[w - 1]);
    }
}