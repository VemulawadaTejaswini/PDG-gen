import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = readIntArray(reader);
            int N = array[0];
            int M = array[1];
            int L = array[2];

            int[][] matrix = readIntMatrix(reader, M);
            int Q = readInt(reader);
            int[][] matrix2 = readIntMatrix(reader, Q);

            int[][] D = new int[N][N];
            {
                for (int i = 0; i < N; i++) {
                    D[i][i] = 0;
                    for (int j = i + 1; j < N; j++) {
                        D[i][j] = Integer.MAX_VALUE;
                        D[j][i] = Integer.MAX_VALUE;
                    }
                }

                for (int i = 0; i < M; i++) {
                    int A = matrix[i][0];
                    int B = matrix[i][1];
                    int C = matrix[i][2];

                    D[A - 1][B - 1] = C;
                    D[B - 1][A - 1] = C;
                }
            }

            for (int k = 0; k < N; k++) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (D[i][k] != Integer.MAX_VALUE && D[k][j] != Integer.MAX_VALUE) {
                            D[i][j] = Math.min(D[i][j], D[i][k] + D[k][j]);
                        }
                    }
                }
            }

            int[][] E = new int[N][N];
            {
                for (int i = 0; i < N; i++) {
                    for (int j = i + 1; j < N; j++) {
                        if (D[i][j] <= L) {
                            E[i][j] = 1;
                            E[j][i] = 1;
                        } else {
                            E[i][j] = Integer.MAX_VALUE;
                            E[j][i] = Integer.MAX_VALUE;
                        }
                    }
                }
            }

            for (int k = 0; k < N; k++) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (E[i][k] != Integer.MAX_VALUE && E[k][j] != Integer.MAX_VALUE) {
                            E[i][j] = Math.min(E[i][j], E[i][k] + E[k][j]);
                        }
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < Q; i++) {
                int s = matrix2[i][0];
                int t = matrix2[i][1];

                int z = E[s - 1][t - 1];
                if (z == Integer.MAX_VALUE) {
                    z = -1;
                } else {
                    z--;
                }

                sb.append(z).append("\n");
            }

            System.out.println(sb.toString());
        }
    }

    public static String readString(BufferedReader reader) throws Exception {
        return reader.readLine();
    }

    public static int readInt(BufferedReader reader) throws Exception {
        return Integer.parseInt(reader.readLine());
    }

    public static long readLong(BufferedReader reader) throws Exception {
        return Long.parseLong(reader.readLine());
    }

    public static double readDouble(BufferedReader reader) throws Exception {
        return Double.parseDouble(reader.readLine());
    }

    public static String[] readStringArray(BufferedReader reader) throws Exception {
        return reader.readLine().split(" ");
    }

    public static int[] readIntArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        return array;
    }

    public static long[] readLongArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        long[] array = new long[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Long.parseLong(str[i]);
        }
        return array;
    }

    public static double[] readDoubleArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        double[] array = new double[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Double.parseDouble(str[i]);
        }
        return array;
    }

    public static int[][] readIntMatrix(BufferedReader reader, int N) throws Exception {
        int[][] matrix = new int[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readIntArray(reader);
        }
        return matrix;
    }

    public static long[][] readLongMatrix(BufferedReader reader, int N) throws Exception {
        long[][] matrix = new long[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readLongArray(reader);
        }
        return matrix;
    }

    public static double[][] readDoubleMatrix(BufferedReader reader, int N) throws Exception {
        double[][] matrix = new double[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readDoubleArray(reader);
        }
        return matrix;
    }

    public static int[] extractArray(int[][] matrix, int index) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

    public static long[] extractArray(long[][] matrix, int index) {
        long[] array = new long[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

    public static double[] extractArray(double[][] matrix, int index) {
        double[] array = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

}
