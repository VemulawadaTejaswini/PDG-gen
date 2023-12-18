import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        execute();
    }

    private static void execute() {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int L[] = new int[N];
        int R[] = new int[N];

        for (int i = 0; i < N; i++) {
            L[i + 1] = gcd(A[i], L[i]);
            R[N - i - 1] = gcd(A[N - i - 1], R[N - i]);
        }

        Integer[] MAX = new Integer[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            MAX[i] = gcd(L[i], R[i + 1]);

            if (max < MAX[i]) {
                max = MAX[i];
            }
        }

        System.out.println(max);
    }

    private static int gcd(int i, int j) {
        if (j == 0) {
            // recursive divide complete
            return i;
        } else {
            return gcd(j, i % j);
        }
    }
}
