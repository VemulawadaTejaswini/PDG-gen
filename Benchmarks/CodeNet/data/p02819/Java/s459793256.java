import java.util.Scanner;

public class Next_Prime {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scanner.nextInt();
        while (!isPrime(x)) {
            ++x;
        }
        System.out.println(x);

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
