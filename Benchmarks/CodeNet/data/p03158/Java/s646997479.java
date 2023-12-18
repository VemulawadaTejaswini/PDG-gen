import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        int n = readInt(), q = readInt();
        ArrayList<Long> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(readLong());
        }

        list.sort(Comparator.reverseOrder());

        for (int i = 0; i < q; i++) {
            ArrayList<Long> tList = new ArrayList<>(list);
            ArrayList<Long> aList = new ArrayList<>(list);
            long x = readLong();
            aList.sort((o1, o2) -> {
                if (Math.abs(o1 - x) == Math.abs(o2 - x)) return o1.compareTo(o2);
                else return Long.compare(Math.abs(o1 - x), Math.abs(o2 - x));
            });

            long ret = 0;
            List<Long> getA = new ArrayList<>();

            l: while (!tList.isEmpty() && !aList.isEmpty()) {
                Long t = tList.remove(0);
                Long a = aList.remove(0);

                while (getA.contains(t)) {
                    if (tList.isEmpty()) break l;
                    getA.remove(t);
                    t = tList.remove(0);
                }

                ret += t;
                while (t <= a) {
                    if (aList.isEmpty()) break l;
                    a = aList.remove(0);
                }
                getA.add(a);
            }

            System.out.println(ret);
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

    private static double readDouble() {
        read();
        return Double.parseDouble(builder.toString());
    }

    private static BigDecimal readBigDecimal() {
        read();
        return new BigDecimal(builder.toString());
    }

    private static float readFloat() {
        read();
        return Float.parseFloat(builder.toString());
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
