import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        int h = readInt(), w = readInt();
        long m = readLong();
        HashMap<Integer, Integer> hMap = new HashMap<>();
        HashMap<Integer, Integer> wMap = new HashMap<>();
        boolean[][] barr = new boolean[h][w];
        for (long i = 0; i < m; i++) {
            int hi = readInt() - 1, wi = readInt() - 1;
            if (hMap.containsKey(hi)) hMap.put(hi, hMap.get(hi) + 1);
            else hMap.put(hi, 1);
            if (wMap.containsKey(wi)) wMap.put(wi, wMap.get(wi) + 1);
            else wMap.put(wi, 1);
            barr[hi][wi] = true;
        }

        ArrayList<Integer> hList = new ArrayList<>();
        long hMax = 0;
        for (int i : hMap.keySet()) {
            if (hMap.get(i) > hMax) {
                hMax = hMap.get(i);
                hList = new ArrayList<>();
                hList.add(i);
            } else if (hMap.get(i) == hMax) {
                hList.add(i);
            }
        }

        ArrayList<Integer> wList = new ArrayList<>();
        long wMax = 0;
        for (int i : wMap.keySet()) {
            if (wMap.get(i) > wMax) {
                wMax = wMap.get(i);
                wList = new ArrayList<>();
                wList.add(i);
            } else if (wMap.get(i) == wMax) {
                wList.add(i);
            }
        }

        for (int hh : hList) {
            for (int ww : wList) {
                if (!barr[hh][ww]) {
                    System.out.print(hMax + wMax);
                    return;
                }
            }
        }

        System.out.print(hMax + wMax - 1);
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
