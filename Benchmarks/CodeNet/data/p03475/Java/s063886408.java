import java.util.*;

public class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int[] C = new int[N];
                int[] S = new int[N];
                int[] F = new int[N];
                for (int i = 1; i < N; i++) {
                        C[i] = sc.nextInt();
                        S[i] = sc.nextInt();
                        F[i] = sc.nextInt();
                }
                int[] output = new int[N+1];

                for (int i = 1; i < N; i++) {
                        for (int j = i; j < N; j++) {
                                if (output[i] < S[j]) {
                                        output[i] = S[j] + C[j];
                                } else if (output[i] % F[j] == 0) {
                                        output[i] += C[j];
                                } else {
                                        output[i] += F[j] - output[i] % F[j] + C[j];
                                }
                        }
                }

                for (int i = 1; i <= N; i++) {
                        System.out.println(output[i]);
                }
        }
}
