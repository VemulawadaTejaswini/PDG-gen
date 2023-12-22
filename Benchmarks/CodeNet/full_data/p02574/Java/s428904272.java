import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] yakusu = new int[1000001];

        long gcd = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            int x = a[i];

            if (gcd == 0) {
                gcd = a[i];
            } else {
                gcd = gcd(a[i], gcd);
            }

            for (int j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) { // 最小の因数を求める
                    yakusu[j]++;
                    while (x % j == 0) {
                        x /= j; // 最小の因数で割った数を代入する
                    }
                }
            }

            if (x > 1) {
                yakusu[x]++;
            }
        }

        boolean isPairWise = true;

        parent : for (int i = 0; i < n; i++) {
            int x = a[i];

            for (int j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) { // 最小の因数を求める
                    int count = 0;
                    while (x % j == 0) {
                        x /= j; // 最小の因数で割った数を代入する
                        count++;
                    }
                    if (yakusu[j] > count) {
                        isPairWise = false;
                        break parent;
                    }
                }
            }

            if (x > 1) {
                yakusu[x]++;
            }
        }
        if (isPairWise) {
            System.out.println("pairwise coprime");
        } else if (gcd == 1) {
            System.out.println("setwise coprime");
        } else {
            System.out.println("not coprime");
        }
    }

    private static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}