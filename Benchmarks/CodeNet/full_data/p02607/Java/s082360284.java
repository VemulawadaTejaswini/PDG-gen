import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        int num = readInt(builder);
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                if (readInt(builder) % 2 == 1) count++;
            } else {
                skip();
            }
        }

        System.out.print(count);
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
