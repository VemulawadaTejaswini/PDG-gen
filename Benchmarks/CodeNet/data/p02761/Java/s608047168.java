
import java.io.*;
import java.util.*;
public class Main {
final static long mod = 1000000007;
    static void debug(Object...args){System.out.println(Arrays.deepToString(args));}
    public static void main(String[] args) {
        InputReader sc = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Random gen = new Random();
        int t = 1;//sc.nextInt();
        while(t-- > 0) {
            StringBuilder sb = new StringBuilder();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [] ar = new int[n];
            Arrays.fill(ar,-1);
            boolean possible = true;
            for(int i=0; i<m;i++)
            {
                int pos = sc.nextInt();
                int val = sc.nextInt();
                if(ar[pos-1]!=-1 && ar[pos-1]!=val)
                {
                    possible = false;
                }
                else
                {
                    ar[pos-1] = val;
                }
            }

            if((ar[0]==0 || ar[0]==-1) && n!=1)
                possible = false;

            if(possible)
            {
                for(int i : ar)
                {
                    if(i==-1)
                        sb.append(0);
                    else
                        sb.append(i);
                }
            }
            pw.println(possible?sb:-1);


        }
        pw.flush();
        pw.close();

    }




















































































































































































        static class Data implements Comparable<Data>{
            int x;
            int y;

            public Data (int m, int n) {
                x = m;
                y = n;
            }
            @Override
            public int compareTo(Data o) {
                return y - o.y;
            }
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
            public long[] nextLongArray(int n) {
                long [] a = new long[n];
                for (int i = 0; i < n; i++) {
                    a[i] = nextLong();
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
            public static char[] shuffle(char[] a, Random gen)
            { for(int i = 0, n = a.length;i < n;i++)
            { int ind = gen.nextInt(n-i)+i;
                char d = a[i];
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
