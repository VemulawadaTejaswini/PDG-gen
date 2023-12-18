import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long mod = 1000000000 + 7;

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long inversion = 0L;
        long inA = 0;
        long cA = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[i]) {
                    inA++;
                }
            }

            for (int j = 0; j < N; j++) {
                if (A[j] > A[i]) {
                    cA++;
                }
            }
        }

        inversion = (((inA * K) % mod) + (cA % mod * ((K * (K - 1) / 2) % mod))) % mod;

        System.out.println(inversion);
    }
}