import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long K = sc.nextInt();

        if (N < K) {
            System.out.println(N);
            return;
        }

        while (N > 0) {
            N = N - K;
        }

        System.out.println(Math.abs(N));
    }
}