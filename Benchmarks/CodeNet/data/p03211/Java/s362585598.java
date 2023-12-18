
//提出は以下
import java.io.*;
import java.io.IOException;
import java.util.*;


public class Main {


    void submit() {

        String s = nextString();
        System.out.println(s);
        int min = 1000;
        int ans = 0;
        for(int i = 0;i < s.length()-2;i++){
            int temp = ctoi(s.charAt(i))*100 +ctoi(s.charAt(i+1))*10 + ctoi(s.charAt(i+2));
//            System.out.println(temp);
            if(Math.abs(753 - temp) < min){
                min = Math.abs(753-temp);
                ans = temp;
            }
        }
        out.println(min);
    }

    void test() {

    }

    public static int ctoi(char c) {
        switch (c) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            default: return 0;
        }
    }

    Main() throws IOException {
        is = System.in;
        out = new PrintWriter(System.out);
        submit();
        // stress();
        // test();
        out.close();
    }


    public static void main(String[] args) throws IOException {
        new Main();
    }

    private InputStream is;
    PrintWriter out;

    private byte[] buf = new byte[1 << 14];
    private int bufSz = 0, bufPtr = 0;

    private int readByte() {
        if (bufSz == -1)
            throw new RuntimeException("Reading past EOF");
        if (bufPtr >= bufSz) {
            bufPtr = 0;
            try {
                bufSz = is.read(buf);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (bufSz <= 0)
                return -1;
        }
        return buf[bufPtr++];
    }

    private boolean isTrash(int c) {
        return c < 33 || c > 126;
    }

    private int skip() {
        int b;
        while ((b = readByte()) != -1 && isTrash(b))
            ;
        return b;
    }

    String nextToken() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!isTrash(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    String nextString() {
        int b = readByte();
        StringBuilder sb = new StringBuilder();
        while (!isTrash(b) || b == ' ') {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    double nextDouble() {
        return Double.parseDouble(nextToken());
    }

    char nextChar() {
        return (char) skip();
    }

    int nextInt() {
        int ret = 0;
        int b = skip();
        if (b != '-' && (b < '0' || b > '9')) {
            throw new InputMismatchException();
        }
        boolean neg = false;
        if (b == '-') {
            neg = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                ret = ret * 10 + (b - '0');
            } else {
                if (b != -1 && !isTrash(b)) {
                    throw new InputMismatchException();
                }
                return neg ? -ret : ret;
            }
            b = readByte();
        }
    }

    long nextLong() {
        long ret = 0;
        int b = skip();
        if (b != '-' && (b < '0' || b > '9')) {
            throw new InputMismatchException();
        }
        boolean neg = false;
        if (b == '-') {
            neg = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                ret = ret * 10 + (b - '0');
            } else {
                if (b != -1 && !isTrash(b)) {
                    throw new InputMismatchException();
                }
                return neg ? -ret : ret;
            }
            b = readByte();
        }
    }
}
//ここまで