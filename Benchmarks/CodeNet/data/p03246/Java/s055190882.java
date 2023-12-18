
import java.io.*;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.*;
class Solu {
    static StringBuffer str = new StringBuffer();
    static InputReader in = new InputReader(System.in);
    static int mm = 1000000007;
    public static void main(String[] args) {
        int t, i, j, tt,it,k,op,n,m;
        n=in.nextInt();
        int a[]=new int[n];
        TreeMap<Integer,Integer> te=new TreeMap<>();
        TreeMap<Integer,Integer> to=new TreeMap<>();
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
            if(i%2==0)
            {
                if(te.containsKey(a[i]))
                    te.put(a[i], te.get(a[i])+1);
                else
                    te.put(a[i], 1);
            }else{
                if(to.containsKey(a[i]))
                    to.put(a[i], to.get(a[i])+1);
                else
                    to.put(a[i], 1);
            }
        }
        int me=-1;
        int mo=-1;
        int ce=-1;
        int co=-1;
        for(Integer It:te.keySet()){
            if(te.get(It)>ce){
                ce=te.get(It);
                me=It;
            }
        }
        for(Integer It:to.keySet()){
            if(to.get(It)>co){
                co=to.get(It);
                mo=It;
            }
        }
        int ff=0;
        for(i=0;i<n;i++){
            if(i%2==0){
                if(a[i]!=me)
                    ff++;
            }else{
                if(a[i]!=mo)
                    ff++;
            }
        }
        System.out.println(ff);
    }

    static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    static int gcdi(int a, int b) {
        return (b == 0) ? a : gcdi(b, a % b);
    }
    
    static long power(int x, int y, int m) {
        if (y == 0) {
            return 1;
        }
        long p = power(x, y / 2, m) % m;
        p = (p * p) % m;
        return (y % 2 == 0) ? p : (x * p) % m;
    }
    static long po(int x, int y) {
        if (y == 0) {
            return 1;
        }
        long p = po(x, y / 2);
        p = (p * p);
        return (y % 2 == 0) ? p : (x * p);
    }
    public static void ap(String st) {
        str.append(st);
    }

    public static void pn() {
        System.out.println(str);
    }
    public static void pnt(String st) {
        System.out.println(st);
    }
    static class InputReader {

        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new UnknownError();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int peek() {
            if (numChars == -1) {
                return -1;
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    return -1;
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar];
        }

        public void skip(int x) {
            while (x-- > 0) {
                read();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextString() {
            return next();
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        public String nextLine() {
            StringBuffer buf = new StringBuffer();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r') {
                    buf.appendCodePoint(c);
                }
                c = read();
            }
            return buf.toString();
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E') {
                    return res * Math.pow(10, nextInt());
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E') {
                        return res * Math.pow(10, nextInt());
                    }
                    if (c < '0' || c > '9') {
                        throw new InputMismatchException();
                    }
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public boolean hasNext() {
            int value;
            while (isSpaceChar(value = peek()) && value != -1) {
                read();
            }
            return value != -1;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}
