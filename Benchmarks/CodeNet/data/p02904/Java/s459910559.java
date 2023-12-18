import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            int N = Integer.parseInt(array[0]);
            int K = Integer.parseInt(array[1]);
            array = reader.readLine().split(" ");
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = Integer.parseInt(array[i]);
            }

            int kind = 0;
            int[] partial = new int[K];

            boolean unsort = false;
            int[] sorted = new int[K];

            for (int i = 0; i < N - K + 1; i++) {
                if (i > 0) {
                    if (P[i - 1] == partial[0]) {
                        if (P[i + K - 1] > partial[K - 1]) {
                            for (int j = i; j < K; j++) {
                                partial[j - 1] = partial[j];
                            }
                            partial[K - 1] = P[i + K - 1];
                            continue;
                        }
                    }
                }

                System.arraycopy(P, i, partial, 0, K);
                System.arraycopy(partial, 0, sorted, 0, K);
                Arrays.sort(partial);

                if (Arrays.equals(partial, sorted)) {
                    if (!unsort) {
                        unsort = true;
                    } else {
                        continue;
                    }
                }

                kind++;
            }

            System.out.println(kind);
        }
    }

}
