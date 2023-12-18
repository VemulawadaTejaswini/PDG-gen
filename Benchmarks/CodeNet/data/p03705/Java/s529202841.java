import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, A, B;
        N = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();
        if (B - A + 1 > N || B - A < 0) {
            System.out.println("0");
            return;
        }
        if (B - A + 1 == N) {
            System.out.println("1");
            return;
        }
        int min = 0, max = 0;
        for (int i = 0; i < N - 1; i++) {
            min += A;
            max += B;
        }
        min += B;
        max += A;
        System.out.println(max - min + 1);
    }
}