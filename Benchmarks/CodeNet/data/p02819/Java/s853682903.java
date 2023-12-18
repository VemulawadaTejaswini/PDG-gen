import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = N; i < 1000001; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                return;
            }
        }


    }

    public static boolean isPrime(int n) {
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }
}