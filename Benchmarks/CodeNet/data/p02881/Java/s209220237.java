import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());

        long result = 0;

        // 素数の場合
        if (isPrime(n)) {
            result = n - 1;

        } else {

            // 平方根が整数の場合
            double sqrt = Math.sqrt(n);
            if (sqrt - (int) sqrt == 0) {
                result = (int) sqrt * 2 - 2;

            } else {

                long preNum = 0;
                for (long i = 2; i <= n / 2 && result == 0; i++) {
                    if (n % i == 0) {
                        if (isPrime(n / i)) {
                            result = n / i + i - 2;

                        } else if (preNum * i == n) {
                            result = preNum + i - 2;
                        }
                        preNum = i;
                    }
                }
            }
        }

        System.out.println(result);
        sc.close();
    }

    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        }
        double sqrtNum = Math.sqrt(num);
        for (long i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
