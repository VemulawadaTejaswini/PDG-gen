import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
    public static void main(String args[])
    {
        FastReader Reader=new FastReader(System.in);
        int N=Reader.nextInt();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=N-1;i++)
        {
            int sum=0;
            int A=i;
            int B=N-i;
            String s1=Integer.toString(A);
            String s2=Integer.toString(B);
            for(int j=0;j<s1.length();j++)
            {
                char x= s1.charAt(j);
                sum+=Character.getNumericValue(x);
            }
            for(int j=0;j<s2.length();j++)
            {
                char x= s2.charAt(j);
                sum+=Character.getNumericValue(x);
            }
            if(sum<min)
                min=sum;
        }
        System.out.println(min);
    }
}
class FastReader {
    private InputStream stream;
    private byte[] buf = new byte[8192];
    private int curChar;
    private int pnumChars;
    private FastReader.SpaceCharFilter filter;

    public FastReader(InputStream stream) {
        this.stream = stream;
    }

    public int read() {
        if (pnumChars == -1) {
            throw new InputMismatchException();
        }
        if (curChar >= pnumChars) {
            curChar = 0;
            try {
                pnumChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (pnumChars <= 0) {
                return -1;
            }
        }
        return buf[curChar++];
    }

    public String next() {
        return nextString();
    }

    public int nextInt() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c == ',') {
                c = read();
            }
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public long nextLong() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public String nextString() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String nextLine() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndOfLine(c));
        return res.toString();
    }


    public boolean isEndOfLine(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public boolean isSpaceChar(int c) {
        if (filter != null) {
            return filter.isSpaceChar(c);
        }
        return isWhitespace(c);
    }

    public static boolean isWhitespace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public interface SpaceCharFilter {
        public boolean isSpaceChar(int ch);

    }

}