import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        // 100000
        System.out.println(getNextPrimeNumber(X));

    }

    public int getNextPrimeNumber(int num) {
        for (int i = num; i <= 200000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                return i;
            }
        }
        return 0;
    }
}
