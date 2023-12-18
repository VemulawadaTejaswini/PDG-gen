import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            int op = 0;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i];
                if (i % 2 == 0) {
                    if (sum <= 0) {
                        op += 1 - sum;
                        sum = 1;
                    }
                } else {
                    if (sum >= 0) {
                        op += sum - -1;
                        sum = -1;
                    }
                }
            }
            int op2 = 0;
            sum = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i];
                if (i % 2 == 1) {
                    if (sum <= 0) {
                        op2 += 1 - sum;
                        sum = 1;
                    }
                } else {
                    if (sum >= 0) {
                        op2 += sum - -1;
                        sum = -1;
                    }
                }
            }

            System.out.println(Math.min(op, op2));
        }
    }
}
