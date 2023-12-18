import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            int ans = 1;
            for (int i = x; i > 0; i--) {
                boolean ok = false;
                for (int b = 1; b <= 40; b++) {
                    for (int p = 2; p <= 10; p++) {
                        if (i == pow(b, p)) {
                            ans = i;
                            ok = true;
                            break;
                        }
                    }
                    if (ok) {
                        break;
                    }
                }
                if (ok) {
                    break;
                }
            }

            System.out.println(ans);
        }
    }

    // baseのn乗を計算を返す
    static int pow(int base, int n) {
        int ret = 1;
        for (int i = 0; i < n; i++) {
            ret *= base;
        }
        return ret;
    }

}
