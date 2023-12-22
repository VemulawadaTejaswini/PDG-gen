import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        int n = readInt(builder);
        long x = readLong(builder, 2);

        for (int i = n - 1; i >= 0; i--) {
            long pow = (long) Math.pow(2, i);
            long xi = x ^ pow;
            if (xi == 0) {
                System.out.println(0);
                continue;
            }
            
            int count = 1;
            long f = xi;
            while ((f = f(f)) != 0) count++;
            System.out.println(count);
        }

    }

    private static long f(long num) {
        int popcount = Long.bitCount(num);
        return num % popcount;
    }



    private static StringBuilder read(StringBuilder builder) {
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

        return builder;
    }

    private static int readInt(StringBuilder builder) {
        read(builder);
        return Integer.parseInt(builder.toString());
    }

    private static int readInt(StringBuilder builder, int radix) {
        read(builder);
        return Integer.parseInt(builder.toString(), radix);
    }

    private static long readLong(StringBuilder builder) {
        read(builder);
        return Long.parseLong(builder.toString());
    }

    private static long readLong(StringBuilder builder, int radix) {
        read(builder);
        return Long.parseLong(builder.toString(), radix);
    }

    private static BigInteger readBigInteger(StringBuilder builder) {
        read(builder);
        return new BigInteger(builder.toString());
    }

    private static BigInteger readBigInteger(StringBuilder builder, int radix) {
        read(builder);
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
