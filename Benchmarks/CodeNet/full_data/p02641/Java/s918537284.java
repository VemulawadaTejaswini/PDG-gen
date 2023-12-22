import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    private static StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        int x = readInt();
        int n = readInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(readInt());
        }

        int i = 0;
        while (true) {
            if (!list.contains(x - i)) {
                System.out.print(x - i);
                break;
            }

            if (!list.contains(x + i)) {
                System.out.print(x + i);
                break;
            }

            list.remove(Integer.valueOf(x - i));
            list.remove(Integer.valueOf(x + i));
            if (x + i == Integer.MAX_VALUE || x - i == Integer.MIN_VALUE) {
                break;
            }

            i++;
        }
    }

    private static void read() {
        builder.setLength(0);
        while (true) {
            try {
                int b = System.in.read();
                if (b == ' ' || b == '\n' || b == -1) {
                    break;
                } else {
                    builder.appendCodePoint(b);
                }
            } catch (IOException e) {
                break;
            }
        }
    }

    private static int readInt() {
        read();
        return Integer.parseInt(builder.toString());
    }

    private static int readInt(int radix) {
        read();
        return Integer.parseInt(builder.toString(), radix);
    }

    private static long readLong() {
        read();
        return Long.parseLong(builder.toString());
    }

    private static long readLong(int radix) {
        read();
        return Long.parseLong(builder.toString(), radix);
    }

    private static BigInteger readBigInteger() {
        read();
        return new BigInteger(builder.toString());
    }

    private static BigInteger readBigInteger(int radix) {
        read();
        return new BigInteger(builder.toString(), radix);
    }

    private static void skipLine() {
        while (true) {
            try {
                int b = System.in.read();
                if (b == '\n' || b == -1) {
                    break;
                }
            } catch (IOException e) {
                break;
            }
        }
    }

    private static void skip() {
        while (true) {
            try {
                int b = System.in.read();
                if (b == ' ' || b == '\n' || b == -1) break;
            } catch (IOException e) {
                break;
            }
        }
    }

}
