import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += isPrimeNumber(sc.nextLong()) ? 1 : 0;
        }
        System.out.println(sum);
    }

    private static boolean isPrimeNumber(long a) {
        if (a == 2) {
            return true;
        } else if (a < 2 || a % 2 == 0) {
            return false;
        }

        long sqrt = (long) Math.sqrt(a);
        for (int i = 3; i <= sqrt; i += 2) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}