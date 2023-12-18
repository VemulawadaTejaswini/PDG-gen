import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int[] T = new int[N];
        for (int i=0; i<N; i++) {
            T[i] = sc.nextInt();
        }

        System.out.println(solve(N, C, K, T));
    }

    private static int solve(int N, int C, int K, int[] T) {
        int count = 0;

        int idx = 0;
        int sum = 0;
        for (int i=0; i<N; i++) {
            if (T[i] - idx > K) {
                count++;
                idx = T[i];
                sum = 1;
            } else if (sum+1 > C) {
                count++;
                idx = T[i];
                sum = 1;
            } else {
                sum++;
            }
        }

        if (sum > 0) {
            count++;
        }

        return count;
    }
}