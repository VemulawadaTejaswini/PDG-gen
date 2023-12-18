
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        long sum = 0;
        long half = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
            sum += A[i];
            B[i] = sum;
        }
        half = sum / 2;

        long ans = 0;
        for (int i = N-1; i >= 0; i--) {
            if(B[i] == half) {
                break;
            }
            if(B[i] < half) {
                ans = A[i+1] -1;
            }
        }

        System.out.println(ans);
    }

}
