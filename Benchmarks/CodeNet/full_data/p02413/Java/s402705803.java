import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    protected static String process(String data) {
        final String[] lines = splitForLines(data);
        final int[] split1 = split(lines[0]);
        int rows = split1[0];
        int cols = split1[1];

        final SpreadSheet sheet = new SpreadSheet(rows, cols);
        final StringBuilder sb = new StringBuilder();

        for (int i = 1; i < lines.length; i++) {
            final int[] split = split(lines[i]);

            final int row = i - 1;
            for (int col = 0; col < split.length; col++) {
                sheet.setValue(row, col, split[col]);
            }
        }

        sb.append(sheet);

        return sb.toString();
    }

    static class SpreadSheet {
        int[][] data;
        int cols;

        public SpreadSheet(int rows, int cols) {
            data = new int[rows][cols];
            this.cols = cols;
        }

        public void setValue(int row, int col, int value) {
            data[row][col] = value;
        }

        public int getColSum(int col) {
            int sum = 0;
            for (int[] aData : data) {
                sum += aData[col];
            }
            return sum;
        }

        public String dumpRow(int row) {
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (int i = 0; i < data[row].length; i++) {
                final int value = data[row][i];
                sum += value;
                sb.append(value).append(' ');
            }
            sb.append(sum);
            return sb.toString();
        }

        public String dumpColSum() {
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (int i = 0; i < cols; i++) {
                final int value = getColSum(i);
                sum += value;
                sb.append(value).append(' ');
            }
            sb.append(sum);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                sb.append(dumpRow(i)).append('\n');
            }
            sb.append(dumpColSum()).append('\n');
            return sb.toString();
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