import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (; x <= 100003; x++) {
            if (isPrime(x)) {
                System.out.println(x);
                break;
            }
        }
    }

    static boolean isPrime(long n) {
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        double sqrtNum = Math.sqrt(n);
        for (long i = 3; i <= sqrtNum; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
