import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long n = sc.nextLong();
        // スペース区切りの整数の入力
        long a = sc.nextLong();
        long b = sc.nextLong();

        long count = 0;
        if ((b - a) % 2 == 0) {
            count = (b - a) / 2;
        } else {
            long absA = extAbs(a, n);
            long absB = extAbs(b, n);
            if (absA > absB) {
                // 入れ替える
                long tmp = a;
                a = n - b + 1;
                b = n - tmp + 1;
            }

            for (int i = 1; i < n; i++) {
                if ((b - a) % 2 == 0) {
                    break;
                }
                count++;
                a = a == 1 ? a : a - 1;
                b = b - 1;
            }
            count = (b - a) / 2 + count;
        }
        // 出力
        System.out.println(count);
    }

    private static long extAbs(long t, double n) {
        if (t < n / 2) {
            return t;
        }
        return (long) (n - t + 1);
    }
}