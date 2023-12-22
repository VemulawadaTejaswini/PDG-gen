import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                long[] A = new long[N];
                long[] Asum = new long[N];

                for (int i = 0; i < N; i++) {
                	A[i] = scan.nextLong();
                }

                Asum[N-1] = A[N-1];

                for (int i = N-2; i >= 0; i--) {
                	Asum[i] = Asum[i+1] + A[i];
                }

                long sum = 0;

                for (int i = 0; i < N -1; i++) {
                	sum += A[i]*Asum[i+1];
                	sum %= 1000000007;
                }

                System.out.println(sum);

                scan.close();

        }

}