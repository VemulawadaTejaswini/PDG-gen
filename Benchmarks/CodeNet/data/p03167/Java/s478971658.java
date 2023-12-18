import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    int rows, cols;
    
    private static final int MOD = (int) 1e9 + 7; 
    
    
    void solve(FastInput in) throws IOException {
        
        rows = in.readInt();
        cols = in.readInt();

        List<String> grid = new ArrayList<>(rows);
        
        int[][] costs = new int[rows + 1][cols + 1];

        for (int i = 0; i < rows; ++i) {
            String z = in.readString();
            grid.add(z);
        }
        
        costs[0][1] = 1;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= cols; ++j) {
                if (grid.get(i - 1).charAt(j - 1) == '#') continue;
                costs[i][j] = addMod(costs[i - 1][j], costs[i][j - 1]);
            }
        }
        int cost = costs[rows][cols];
        
        System.out.println(cost);
    }
    
    private int addMod(int a, int b) {
        return (a + b) % MOD;
    }

    public static void main(String[] args) throws IOException {
//        FastInput in = new FastInput(new FileInputStream("input/input_grid_1.txt"));
        FastInput in = new FastInput(System.in);
        
        Main m = new Main();
        m.solve(in);
        
        in.close();
        
    }
    ///////////////////////////////////////////////////////////////////////////
    // Fast Input start here.
    ///////////////////////////////////////////////////////////////////////////
    public static class FastInput implements AutoCloseable {

        private InputStream stream;
        int lastChar;

        public FastInput(InputStream stream) throws IOException {
            // Assert stream exists
            assert stream != null;
            this.stream = stream;
            lastChar = stream.read();
            // Assure non-empty stream
            assert lastChar != -1;
        }

        private boolean isWhiteSpace(int ch) {
            return (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r');
        }

        private int skipWhitespaces() throws IOException {
            while (lastChar != -1 && isWhiteSpace(lastChar))
                lastChar = stream.read();
            if (lastChar == -1)
                throw new IOException();
            return lastChar;
        }

        public int readInt() throws IOException {
            int ch = skipWhitespaces();
            int number = 0;
            int base = 10;
            boolean isNegative = false;
            switch (ch) {
            case '-':
                isNegative = true;
            case '+':
                ch = stream.read();
                if (ch < '0' || ch > '9')
                    throw new IOException("readInt() - data cannot be converted to an integer.");
            default:
                number = (ch - '0');
            }

            ch = stream.read();
            while (ch >= '0' && ch <= '9') {
                number *= base;
                number += (ch - '0');
                ch = stream.read();
            }
            lastChar = ch;
            if (isNegative)
                number = -number;

            return number;
        }

        public char readChar() throws IOException {
            int ch = skipWhitespaces();
            lastChar = stream.read();
            return (char)ch;
        }

        public String readString() throws IOException {
            StringBuilder builder = new StringBuilder();
            int ch = skipWhitespaces();
            while (ch != -1) {
                builder.append((char)ch);
                ch = stream.read();
                if (isWhiteSpace(ch))
                    break;
            }
            lastChar = ch;
            return builder.toString();
        }

        public double readDouble() throws IOException {
            StringBuilder builder = new StringBuilder();
            int ch = skipWhitespaces();
            boolean mantisDelimeterFound = false;
            if (ch == '-' || ch == '+') {
                builder.append((char)ch);
                ch = stream.read();
            } else if (ch == '.') {
                builder.append((char)ch);
                mantisDelimeterFound = true;
                ch = stream.read();
            }

            while (ch != -1) {
                if (ch >= '0' && ch <= '9')
                    builder.append((char)ch);
                else if (ch == '.') {
                    if (mantisDelimeterFound)
                        break;
                    mantisDelimeterFound = true;
                    builder.append((char)ch);
                } else {
                    break;
                }
                ch = stream.read();
            }
            lastChar = ch;

            return Double.parseDouble(builder.toString());
        }

        @Override
        public void close() throws IOException {
            if (stream != null)
                stream.close();
        }
    }    
}