import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            int N = Integer.parseInt(array[0]);
            int M = Integer.parseInt(array[1]);

            array = reader.readLine().split(" ");

            long[][] A = new long[31][N];
            int[] C = new int[31];

            for (int i = 0; i < N; i++) {
                long a = Long.parseLong(array[i]);
                int b = -1;

                if (a < 1) {
                    b = 0;
                } else if (a < (1 << 1)) {
                    b = 1;
                } else if (a < (1 << 2)) {
                    b = 2;
                } else if (a < (1 << 3)) {
                    b = 3;
                } else if (a < (1 << 4)) {
                    b = 4;
                } else if (a < (1 << 5)) {
                    b = 5;
                } else if (a < (1 << 6)) {
                    b = 6;
                } else if (a < (1 << 7)) {
                    b = 7;
                } else if (a < (1 << 8)) {
                    b = 8;
                } else if (a < (1 << 9)) {
                    b = 9;
                } else if (a < (1 << 10)) {
                    b = 10;
                } else if (a < (1 << 11)) {
                    b = 11;
                } else if (a < (1 << 12)) {
                    b = 12;
                } else if (a < (1 << 13)) {
                    b = 13;
                } else if (a < (1 << 14)) {
                    b = 14;
                } else if (a < (1 << 15)) {
                    b = 15;
                } else if (a < (1 << 16)) {
                    b = 16;
                } else if (a < (1 << 17)) {
                    b = 17;
                } else if (a < (1 << 18)) {
                    b = 18;
                } else if (a < (1 << 19)) {
                    b = 19;
                } else if (a < (1 << 20)) {
                    b = 20;
                } else if (a < (1 << 21)) {
                    b = 21;
                } else if (a < (1 << 22)) {
                    b = 22;
                } else if (a < (1 << 23)) {
                    b = 23;
                } else if (a < (1 << 24)) {
                    b = 24;
                } else if (a < (1 << 25)) {
                    b = 25;
                } else if (a < (1 << 26)) {
                    b = 26;
                } else if (a < (1 << 27)) {
                    b = 27;
                } else if (a < (1 << 28)) {
                    b = 28;
                } else if (a < (1 << 29)) {
                    b = 29;
                } else if (a < (1 << 30)) {
                    b = 30;
                }

                b--;
                A[b][C[b]] = a;
                C[b]++;
            }

            while (M > 0) {
                for (int b = 30; b >= 0; b--) {
                    int c = C[b];
                    if (M >= c) {
                        if (b > 0) {
                            for (int i = 0; i < c; i++) {
                                A[b - 1][C[b - 1]] = A[b][i] / 2;
                                C[b - 1]++;
                            }
                        }
                        C[b] = 0;
                        M -= c;
                    } else {
                        long[] copyOf = Arrays.copyOf(A[b], c);
                        Arrays.sort(copyOf);
                        if (b > 0) {
                            for (int i = 0; i < M; i++) {
                                A[b - 1][C[b - 1]] = copyOf[c - 1 - i] / 2;
                                C[b - 1]++;
                            }
                        }
                        for (int i = 0; i < (c - M); i++) {
                            A[b][i] = copyOf[i];
                        }
                        C[b] -= M;
                        M = 0;
                    }

                    if (b == 0) {
                        M = 0;
                    }
                }
            }

            long sum = 0;
            for (int b = 0; b < 31; b++) {
                for (int i = 0; i < C[b]; i++) {
                    sum += A[b][i];
                }
            }

            System.out.println(sum);
        }
    }

}
