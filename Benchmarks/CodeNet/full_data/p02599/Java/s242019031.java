import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        int n = readInt(), q = readInt();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            int c = readInt();
            if (map.containsKey(c)) map.get(c).add(i);
            else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(c, list);
            }
        }

        for (int i = 0; i < q; i++) {
            int count = 0, l = readInt() - 1, r = readInt() - 1;
            if (l == r) {
                System.out.println(1);
                continue;
            }
            
            for (int j :
                    map.keySet()) {
                ArrayList<Integer> list = map.get(j);
                int min = list.get(0), max = list.get(list.size() - 1);
                if (max < l || r < min) {
                    continue;
                }
                
                if ((l <= min && min <= r) || (l <= max && max <= r)) {
                    count++;
                    continue;
                }

                for (int k = 1; k < list.size() - 1; k++) {
                    if (l <= list.get(k) && list.get(k) <= r) {
                        count++;
                    }
                }
            }
            System.out.println(count);
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
