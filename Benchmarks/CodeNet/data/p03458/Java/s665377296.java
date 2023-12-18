import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] x = new int[N];
        int[] y = new int[N];
        char[] c = new char[N];
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
            c[i] = st.nextToken().charAt(0);
        }

        System.out.println(solve(x, y, c, K));

        br.close();
    }

    static int solve(int[] x, int[] y, char[] c, int K) {
        int result = 0;
        int[] deltas = new int[2 * K + 1];
        for (int minX = 0; minX < 2 * K; ++minX) {
            Arrays.fill(deltas, 0);

            for (int i = 0; i < x.length; ++i) {
                int blackMinY;
                int blackMaxY;
                if ((x[i] - minX + 2 * K) % (2 * K) < K) {
                    blackMinY = 0;
                    blackMaxY = K - 1;
                } else {
                    blackMinY = K;
                    blackMaxY = 2 * K - 1;
                }

                int unitY = y[i] % (2 * K);
                if (c[i] == 'B') {
                    if (unitY >= blackMinY && unitY <= blackMaxY) {
                        ++deltas[0];

                        if (blackMinY == 0) {
                            --deltas[unitY + 1];
                            ++deltas[unitY + 1 + K];
                        } else {
                            --deltas[unitY - K + 1];
                            ++deltas[unitY + 1];
                        }
                    } else {
                        if (blackMinY == 0) {
                            ++deltas[unitY - K + 1];
                            --deltas[unitY + 1];
                        } else {
                            ++deltas[unitY + 1];
                            --deltas[unitY + 1 + K];
                        }
                    }
                } else {
                    if (unitY >= blackMinY && unitY <= blackMaxY) {
                        if (blackMinY == 0) {
                            ++deltas[unitY + 1];
                            --deltas[unitY + 1 + K];
                        } else {
                            ++deltas[unitY - K + 1];
                            --deltas[unitY + 1];
                        }
                    } else {
                        ++deltas[0];

                        if (blackMinY == 0) {
                            --deltas[unitY - K + 1];
                            ++deltas[unitY + 1];
                        } else {
                            --deltas[unitY + 1];
                            ++deltas[unitY + 1 + K];
                        }
                    }
                }
            }

            int matchNum = 0;
            for (int i = 0; i < deltas.length; ++i) {
                matchNum += deltas[i];
                result = Math.max(result, matchNum);
            }
        }

        return result;
    }
}