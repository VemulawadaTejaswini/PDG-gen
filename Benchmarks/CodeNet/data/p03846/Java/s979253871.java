import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[scanner.nextInt()]++;
        }
        if (N % 2 == 1 && A[0] != 1) {
            System.out.println(0);
            return;
        }
        for (int i = Math.abs(N % 2 - 1); i < N; i += 2) {
            if (i == 0) continue;
            if (A[i] != 2) {
                System.out.println(0);
                return;
            }
        }
        int result = 1;
        for (int i = 0; i < N / 2; i++) {
            result *= 2 % (Math.pow(10, 9) + 7);
        }

        System.out.println(result);
    }

}