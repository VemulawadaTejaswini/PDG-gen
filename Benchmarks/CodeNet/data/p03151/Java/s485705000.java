import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        long sumA = 0;
        long sumB = 0;
        long[] D = new long[N];
        long shortage = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sumA += A[i];
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
            D[i] = A[i] - B[i];
            sumB += B[i];
            if (D[i] < 0)
                shortage += D[i];
        }
        if (sumA < sumB) {
            System.out.println("-1");
            sc.close();
            return;
        }
        Arrays.sort(D);
        long di = 0;
        int count = 0;
        int excessiveHead = N - 1;
        int shortageHead = 0;
        while (D[excessiveHead] > 0) {
            di = D[excessiveHead];
            if (D[shortageHead] >= 0)
                break;
            while (di > 0 && D[shortageHead] < 0) {
                if (di >= Math.abs(D[shortageHead])) {
                    di += D[shortageHead];
                    shortageHead++;
                    count++;
                } else {
                    D[shortageHead] += di;
                    di = 0;
                }
            }
            count++;
            excessiveHead--;
        }

        System.out.println(count);

        sc.close();
    }
}
