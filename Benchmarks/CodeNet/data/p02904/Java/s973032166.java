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

            boolean same = false;

            for (int i = 0; i < N - K + 1; i++) {
                if (i == 0) {
                    System.arraycopy(P, i, partial, 0, K);
                    Arrays.sort(partial);
                } else {
                    if (P[i - 1] == partial[0]) {
                        if (P[i + K - 1] > partial[K - 1]) {
                            System.arraycopy(partial, 1, partial, 0, K - 1);
                            partial[K - 1] = P[i + K - 1];
                            continue;
                        }
                    }

                    int from = Arrays.binarySearch(partial, P[i - 1]);
                    int to = K - 1;
                    for (int j = 0; j < K; j++) {
                        if (partial[j] > P[i + K - 1]) {
                            to = j;
                            if (from < to) {
                                to--;
                            }
                            break;
                        }
                    }

                    if (from < to) {
                        System.arraycopy(partial, from + 1, partial, from, to - from);
                    } else if (from > to) {
                        System.arraycopy(partial, to, partial, to + 1, from - to);
                    }
                    partial[to] = P[i + K - 1];
                }

                if (Arrays.equals(partial, Arrays.copyOfRange(P, i, i + K))) {
                    if (same) {
                        continue;
                    }
                    same = true;
                }

                kind++;
            }

            System.out.println(kind);
        }
    }

}
