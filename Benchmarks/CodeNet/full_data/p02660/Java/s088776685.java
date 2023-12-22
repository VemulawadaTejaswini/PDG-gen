import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        long n = readLong();
        if (n == 1) {
            System.out.print(0);
            return;
        }

        if (n < 6) {
            System.out.print(1);
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> so = new ArrayList<>();
        int j = 0, count = 0;
        while (n % 2 == 0) {
            j++;
            n = n / 2;
        }
        if (j > 0) {
            count = count(j);
        }

        l: for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            for (int s : so) {
                if (i % s == 0) continue l;
            }

            so.add(i);
            j = 0;
            while (n % i == 0) {
                j++;
                n = n / i;
            }

            if (j > 0) {
                map.put(i, j);
            }
        }

        if (map.isEmpty() && count == 0) {
            System.out.print(1);
            return;
        }

        for (int key: map.keySet()) {
            count += count(map.get(key));
        }

        System.out.print(count);
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

    private static int count(int n) {
        switch (n) {
            case 1:
            case 2:
                return 1;
            case 3:
            case 4:
            case 5:
                return 2;
            case 6:
            case 7:
            case 8:
            case 9:
                return 3;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return 4;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return 5;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return 6;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                return 7;
            default:
                return 8;
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
