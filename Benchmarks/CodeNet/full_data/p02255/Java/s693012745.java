import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        final int N = in.nextInt();
        final int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;
            while (true) {
                if (j == -1 || key >= A[j]) {
                    A[j + 1] = key;
                    break;
                } else {
                    A[j + 1] = A[j];
                    j--;
                }
            }
            print(A);
        }
    }

    private static void print(int[] A) {
        if (A.length == 0)
            return;
        for (int i = 0; i < A.length - 1; i++)
            System.out.print(A[i] + " ");
        System.out.println(A[A.length - 1]);
    }
}