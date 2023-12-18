import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());

        long result = 0;

        // 素数の場合
        if (isPrime(n)) {
            result = n - 1;

        } else if (n % 2 == 0 && isPrime(n / 2)) {
            result = n / 2;

        } else {

            // 平方根が整数の場合
            double sqrt = Math.sqrt(n);
            if (sqrt - (int) sqrt == 0) {
                result = (int) sqrt * 2 - 2;

            } else {

                int preNum = 0;
                for (int i = 2; i <= n / 2 && result == 0; i++) {
                    if (n % i == 0) {
                        if (preNum * i == n) {
                            result = preNum + i - 2;
                        }
                        preNum = i;
                    }
                }
            }
        }

        System.out.println(result);
    }

    public static boolean isPrime(long num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

        double sqrtNum = Math.sqrt(num);
        for (long i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
