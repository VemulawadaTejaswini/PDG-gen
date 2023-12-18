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
        LinkedList<Long> getList = new LinkedList<>();

        for (int i = 0; i < q; i++) {
            long ret = 0;
            long x = readLong();

            getList.addAll(list);

            l: while (!getList.isEmpty()) {
                ret += getList.poll();

                if (getList.isEmpty()) break;

                int j = 0;
                while (j < getList.size()) {
                    if (getList.get(j) <= x) break;
                    j++;
                }
                
                Long l = 0L;

                if (j == 0) {
                    while (true) {
                        l = getList.poll();
                        if (l == null) break l;
                        l = getList.poll();
                        if (l == null) break l;
                        ret += l;
                    }
                }
                else if (j == getList.size()) {
                    while (true) {
                        l = getList.pollLast();
                        if (l == null) break l;
                        l = getList.poll();
                        if (l == null) break l;
                        ret += l;
                    }
                }
                else if (getList.get(j) == x) getList.remove(j);
                else {
                    Long l1 = getList.get(j - 1);
                    Long l2 = getList.get(j);
                    if (l1 - x < -1 * (l2 - x)) getList.remove(j - 1);
                    else getList.remove(j);
                }
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
