import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        if (N % 10 == 7) {
            out.println("Yes");
        } else if ((N / 10) % 10 == 7) {
            out.println("Yes");
        } else if ((N / 100) % 10 == 7) {
            out.println("Yes");
        } else {
            out.println("No");
        }

        out.flush();
    }
}

class Input {
    private BufferedReader br;
    private String[] buff;
    private int index = 0;

    Input(InputStream is) {
        br = new BufferedReader(new InputStreamReader(is));
    }
    String nextLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    String next() {
        while (buff == null || index >= buff.length) {
            buff = nextLine().split(" ");
            index = 0;
        }
        return buff[index++];
    }
    byte nextByte() {
        return Byte.parseByte(next());
    }
    short nextShort() {
        return Short.parseShort(next());
    }
    int nextInt() {
        return Integer.parseInt(next());
    }
    long nextLong() {
        return Long.parseLong(next());
    }
    float nextFloat() {
        return Float.parseFloat(next());
    }
    double nextDouble() {
        return Double.parseDouble(next());
    }
    BigInteger nextBigInteger() {
        return new BigInteger(next());
    }
    BigDecimal nextBigDecimal() {
        return new BigDecimal(next());
    }
}