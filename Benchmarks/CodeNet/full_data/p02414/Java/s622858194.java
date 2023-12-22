import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    protected static String process(String data) {
        final String[] lines = splitForLines(data);
        final int[] split1 = split(lines[0]);
        final int n = split1[0];
        final int m = split1[1];
        final int l = split1[2];

        final Matrix matrix1 = new Matrix(n, m);
        populate(Arrays.copyOfRange(lines, 1, 1 + n), matrix1);

        final Matrix matrix2 = new Matrix(m, l);
        populate(Arrays.copyOfRange(lines, 1 + n, lines.length), matrix2);

        final Matrix result = multiply(matrix1, matrix2);

        return result.toString();
    }

    static Matrix multiply(Matrix m1, Matrix m2) {
        Matrix result = new Matrix(m1.getRows(), m2.getCols());

        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getCols(); j++) {
                result.setValue(i, j, multiply(m1, m2, i, j));
            }
        }

        return result;
    }

    static long multiply(Matrix m1, Matrix m2, int row, int col) {
        long sum = 0;
        for (int i = 0; i < m1.getCols(); i++) {
            final long val1 = m1.getValue(row, i);
            final long val2 = m2.getValue(i, col);
            sum += val1 * val2;
        }
        return sum;
    }

    static void populate(String[] lines, Matrix matrix) {
        for (int row = 0; row < lines.length; row++) {
            final int[] data0 = split(lines[row]);
            for (int col = 0; col < data0.length; col++) {
                matrix.setValue(row, col, data0[col]);
            }
        }
    }

    static class Matrix {
        long[][] data;
        int cols;

        public Matrix(int rows, int cols) {
            data = new long[rows][cols];
            this.cols = cols;
        }

        public void setValue(int row, int col, long value) {
            data[row][col] = value;
        }

        public long getValue(int row, int col) {
            return data[row][col];
        }

        public String dumpRow(int row) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < data[row].length; i++) {
                final long value = data[row][i];
                if (i > 0) {
                    sb.append(' ');
                }
                sb.append(value);
            }
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                sb.append(dumpRow(i)).append('\n');
            }
            return sb.toString();
        }

        int getCols() {
            return cols;
        }

        int getRows() {
            return data.length;
        }
    }

    private static String readAll(InputStream is) {
        InputStreamReader r = null;
        BufferedReader br = null;

        try {
            r = new InputStreamReader(is);
            br = new BufferedReader(r);
            StringBuilder sb = new StringBuilder();
            String s;

            while ((s = br.readLine()) != null) {
                sb.append(s).append('\n');
            }

            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private static String[] splitForLines(String lines) {
        return lines.split("\\n");
    }

    private static int[] split(String s) {
        final String[] s0 = s.split(" ");
        int[] ia = new int[s0.length];

        for (int i = 0; i < s0.length; i++) {
            ia[i] = Integer.parseInt(s0[i]);
        }

        return ia;
    }

    public static void main(String[] args) {
        System.out.print(process(readAll(System.in)));
    }
}