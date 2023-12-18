import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 5; N > 0; i++) {
            if (i % 5 == 1) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                    N--;
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false; // 偶数はあらかじめ除く
        }
        double sqrtNum = Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                // 素数ではない
                return false;
            }
        }

        // 素数である
        return true;
    }
}