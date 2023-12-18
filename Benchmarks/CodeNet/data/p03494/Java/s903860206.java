import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            int count = 0;
            for (;;) {
                if (isAllEven(A)) {
                    for (int i = 0; i < N; i++) {
                        A[i] /= 2;
                    }
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }
    }

    private static boolean isAllEven(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                return false;
            }
        }
        return true;
    }
}
