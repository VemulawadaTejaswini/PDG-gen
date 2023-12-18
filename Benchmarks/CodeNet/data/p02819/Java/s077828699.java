import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = N; i*i <= 100000; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                break;
            }
        }

    }
    public static boolean isPrime(int N) {
        if(N == 1) return false;
        for(long i = 2; i * i <= N; i++) {
            if(N % i == 0) return false;
        }
        return true;
    }
}
