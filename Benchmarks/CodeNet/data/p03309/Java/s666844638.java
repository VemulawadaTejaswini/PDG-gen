import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        int[] A = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt() - (i + 1);
            sum += A[i];
        }

        int b1 = (int)Math.round(sum / (double)N);
        int b2 = b1 - 1;
        int b3 = b1 + 1;

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        for (int i = 0; i < N; i++) {
            result1 += Math.abs(A[i] - b1);
            result2 += Math.abs(A[i] - b2);
            result3 += Math.abs(A[i] - b3);
        }

        int result = Math.min(result1, Math.min(result2, result3));
        System.out.println(result);

        sc.close();
    }
}