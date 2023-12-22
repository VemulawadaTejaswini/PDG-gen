import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main {

public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
    PrintWriter pw = new PrintWriter(System.out);
    Random gen = new Random();
    int test = 1;//sc.nextInt();
    while(test-->0) {

        int k = sc.nextInt();
        int n = sc.nextInt();

        if(n==0)
            pw.println(k);
        else {
            ArrayList<Integer> l = new ArrayList<>();
            while(n-->0)
                l.add(sc.nextInt());
            int i =0;
            while(true)
            {
                int a = k-i;
                int b = k + i;
                if(!l.contains(a))
                {
                    pw.println(a);
                    break;
                }
                else if(!l.contains(b))
                {
                    pw.println(b);
                    break;
                }

                i++;
            }
        }
    }
    pw.close();

}



























































































































































































static class InputReader {

    private final InputStream stream;
    private final byte[] buf = new byte[8192];
    private int curChar, snumChars;

    public InputReader(InputStream st) {
        this.stream = st;
    }

    public int read() {
        if (snumChars == -1)
            throw new InputMismatchException();
        if (curChar >= snumChars) {
            curChar = 0;
            try {
                snumChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (snumChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public int nextInt() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public long nextLong() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public int[] nextIntArray(int n) {
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    public static int[] shuffle(int[] a, Random gen)
    { for(int i = 0, n = a.length;i < n;i++)
    { int ind = gen.nextInt(n-i)+i;
        int d = a[i];
        a[i] = a[ind];
        a[ind] = d;

    }
        return a;
    }


    public String readString() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
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

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private boolean isEndOfLine(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

}

}