import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        execute();
    }

    private static void execute() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Squares squares = new Squares(br.readLine().split(" "));
        System.out.println(calcRouteNum(squares));
    }

    protected static BigInteger calcRouteNum(Squares squares) {
        BigInteger allNum = getCombination(squares.getAllMoveNumber(), squares.getDownNumber());
        BigInteger removeNum = BigInteger.ZERO;
        for (int i = 0; i <= squares.getRemovedDownNumber(); i++) {
            removeNum = removeNum.add(getCombination(squares.getMovableUpLeftNumber(), squares.getMovableDownNumber() + i).
                    multiply(getCombination(squares.getMovableDownRightNumber(), squares.getRemovedDownNumber() - i)));
        }
        return allNum.subtract(removeNum).remainder(BigInteger.valueOf(1_000_000_007));
    }

    protected static BigInteger getCombination(int n, int r) {
        if (n - r < r) {
            r = n - r;
        }
        if (r == 0) {
            return BigInteger.ONE;
        }
        if (r == 1) {
            return BigInteger.valueOf(n);
        }

        int[] numerator = new int[r];
        int[] denominator = new int[r];

        for (int k = 0; k < r; k++) {
            numerator[k] = n - r + k + 1;
            denominator[k] = k + 1;
        }

        for (int p = 2; p <= r; p++) {
            int pivot = denominator[p - 1];
            if (pivot > 1) {
                int offset = (n - r) % p;
                for (int k = p - 1; k < r; k += p) {
                    numerator[k - offset] /= pivot;
                    denominator[k] /= pivot;
                }
            }
        }

        BigInteger result = BigInteger.ONE;
        for (int k = 0; k < r; k++) {
            if (numerator[k] > 1) {
                result = result.multiply(BigInteger.valueOf(numerator[k]));
            }
        }

        return result;
    }

    public static class Squares {
        private int _height;
        private int _width;
        private int _removedHeight;
        private int _removedWidth;

        public Squares(String[] inputs) {
            this._height = Integer.parseInt(inputs[0]);
            this._width = Integer.parseInt(inputs[1]);
            this._removedHeight = Integer.parseInt(inputs[2]);
            this._removedWidth = Integer.parseInt(inputs[3]);
        }

        public int getAllMoveNumber() {
            return _height + _width - 2;
        }

        public int getDownNumber() {
            return _height - 1;
        }

        public int getMovableUpLeftNumber() {
            return _height - _removedHeight - 1 + _removedWidth;
        }

        public int getMovableDownNumber() {
            return _height - _removedHeight;
        }

        public int getMovableDownRightNumber() {
            return _width - _removedWidth - 1 + _removedHeight;
        }

        public int getRemovedDownNumber() {
            return _removedHeight - 1;
        }
    }
}