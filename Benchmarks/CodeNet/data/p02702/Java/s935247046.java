import java.io.IOException;
import java.io.InputStream;

public class D {

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

        //        System.err.print("[");
        //        for (int i = 0; i < length; i++) {
        //            System.err.print(bytes[i]);
        //        }
        //        System.err.println("]");
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
            //System.err.println();
            //System.err.printf("[%d] %d%n", i, n);
            for (int j = i + 3; j < length; j++) {
                n = (n * 10 + bytes[j]) % 2019;
                //System.err.printf("[%d][%d] %d %d%n", i, j, bytes[j], n);
                if (n == 0) {
                    result++;
                    //System.err.printf("* count: %d%n", result);
                }
            }
        }
        put(result);
    }
}
