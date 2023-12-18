import java.util.Scanner;

public class Main {

    private static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        } else if (x == 2) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (true) {
            if (isPrime(x)) {
                System.out.println(x);
                return;
            }
            x++;
        }
    }

}
