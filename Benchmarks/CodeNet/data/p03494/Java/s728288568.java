import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N+1];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int c = 0;
        while (true) {
            boolean done = false;
            for (int i = 0; i < N; i++) {
                if (A[i] % 2 != 0) done = true;
            }

            if (done) break;

            for (int i = 0; i < N; i++) {
                A[i] /= 2;
            }

            ++c;
        }

        System.out.println(c);
    }
}