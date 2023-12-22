import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        int n = readInt(builder);
        builder.setLength(0);
        int buf;
        while ((buf = System.in.read()) != '\n') {
            builder.appendCodePoint(buf);
        }

        long x = Long.parseLong(builder.toString(), 2);

        for (int i = n - 1; i >= 0; i--) {
            long xi = x ^ ((long)Math.pow(2, i));
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

        return Integer.parseInt(builder.toString());
    }

    private static long readLong(StringBuilder builder) {
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

        return Long.parseLong(builder.toString());
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
