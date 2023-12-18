import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int all = 0;
        for (int i = 2; N > 0; i++) {
            if (N == 1) {
                if (isPrime(i) == true) {
                    int ch = all + i;
                    if (isPrime(ch) == true) {
                        System.out.print(i + " ");
                        return;
                    }
                }
            }
            if (isPrime(i) == true) {
                System.out.print(i + " ");
                all += i;
                N--;
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