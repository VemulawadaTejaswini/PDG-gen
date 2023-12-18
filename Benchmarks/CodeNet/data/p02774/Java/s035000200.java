import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        long A[] = new long[N];
        long B[] = new long[(N * (N-1) ) / 2];
        int idx =0;
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
            if (i > 0) {
                for (int j=i-1;j>=0;j--) B[idx++] = A[i]*A[j];
            }
        }

        Arrays.sort(B);
        System.out.println(B[K-1]);
    }
}
