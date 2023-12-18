import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(solve(N, K));
    }

    private static long solve(int N, int K) {
        long count = 0;


        for (int k=K; k<=N; k++) {
            if (k==0) {
                for (int b=1; b<=N; b++) {
                    // a%b == 0
//                    System.err.println("k=" + k + ", b=" + b + ", count=" + count + " + " + (N/b));
                    count += N/b;
                }
                continue;
            }

            for (int b=k+1; b<=N; b++) {
                // a%b == k
//                System.err.println("k=" + k + ", b=" + b + ", count=" + count + " +" + ((N-k)/b + 1));

                count += (N-k)/b + 1;
            }
        }

        return count;
    }
}