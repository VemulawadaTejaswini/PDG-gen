import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        int count = 0;
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(scanner.next());
            if (isPrime(p)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrime(int p) {
        if (p == 1) {
            return false;
        }

        if (p == 2) {
            return true;
        }

        if (p % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.ceil(Math.sqrt(p)); i += 2) {
            if (p % i == 0) {
                return false;
            }
        }

        return true;
    }
}