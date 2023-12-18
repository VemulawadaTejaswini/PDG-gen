import java.io.IOException;
import java.io.InputStream;

public class Main {

    static int length;
    static byte[] bytes = new byte[20000];

    private static void put(int n) {
        System.out.println(n);
    }

    private static void readAllBytes(InputStream in) throws IOException {
        int ch;
        length = 0;
        while ((ch = in.read()) != -1 && Character.isDigit(ch)) {
            bytes[length++] = (byte) (ch - '0');
        }
    }

    public static void main(String[] args) throws IOException {
        readAllBytes(System.in);
        if (length <= 3) {
            put(0);
            return;
        }
        int result = 0;
        for (int i = 0; i < length - 3; i++) {
            int n = bytes[i] * 100 + bytes[i + 1] * 10 + bytes[i + 2];
            for (int j = i + 3; j < length; j++) {
                n = (n * 10 + bytes[j]) % 2019;
                if (n == 0) {
                    result++;
                }
            }
        }
        put(result);
    }
}
