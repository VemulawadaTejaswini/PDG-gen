import java.util.Scanner;

class Main {

    private static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }

        calculate(A, N, 0);
        System.out.println(count);
    }

    private static void calculate(int[] A, int N, int i) {
        if (i == N) {
            int num = 1;
            for (int j = 0; j < N; j++) {
                num *= A[j];
            }
            if (num % 2 == 0) {
                count++;
            }
        } else {
            for (int j = 0; j < 3; j++) {
                int tmp = A[i];
                A[i] = tmp - 1 + j;
                calculate(A, N, i+1);
                A[i] = tmp;
            }
        }
    }
}