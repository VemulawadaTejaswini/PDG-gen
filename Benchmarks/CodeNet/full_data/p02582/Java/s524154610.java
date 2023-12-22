import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
public class Main {
    final static long mod = (long)10e9+7;
    public static List<List<Integer>> combinations(int[] arr) {
        List<List<Integer>> c = new ArrayList<List<Integer>>();
        List<Integer> l;
        for (int i = 0; i < arr.length; i++) {
            int k = c.size();
            for (int j = 0; j < k; j++) {
                l = new ArrayList<Integer>(c.get(j));
                l.add(arr[i]);
                c.add(l);
            }
            l = new ArrayList<Integer>();
            l.add(arr[i]);
            c.add(l);
        }
        return c;
    }
    public static void main(String[] args) {
        InputReader sc = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Random gen = new Random();
        int test = 1;//sc.nextInt();
        while(test-->0) {
            StringBuffer sb = new StringBuffer();
          // int n  = sc.nextInt();
           String s = sc.nextLine();
           if(s.indexOf('R')==-1)
               pw.println(0);
           else
           {
               if((s.charAt(0)=='R' && s.charAt(1)=='R') || (s.charAt(1)=='R' && s.charAt(1)=='2'))
                   pw.println(2);
               else
                   pw.println(1);
           }

        }
        pw.close();

    }




















































































































































































    static class Data implements Comparable<Data>{
        int x;
        String y;

        public Data (int m, String n) {
            x = m;
            y = n;
        }
        @Override
        public int compareTo(Data o) {
            return x - o.x;
        }
    }
    static class Utilities {
        public static class Debug {
            public static final boolean LOCAL = System.getProperty("ONLINE_JUDGE") == null;

            private static <T> String ts(T t) {
                if (t == null) {
                    return "null";
                }
                try {
                    return ts((Iterable) t);
                } catch (ClassCastException e) {
                    if (t instanceof int[]) {
                        String s = Arrays.toString((int[]) t);
                        return "{" + s.substring(1, s.length() - 1) + "}";
                    } else if (t instanceof long[]) {
                        String s = Arrays.toString((long[]) t);
                        return "{" + s.substring(1, s.length() - 1) + "}";
                    } else if (t instanceof char[]) {
                        String s = Arrays.toString((char[]) t);
                        return "{" + s.substring(1, s.length() - 1) + "}";
                    } else if (t instanceof double[]) {
                        String s = Arrays.toString((double[]) t);
                        return "{" + s.substring(1, s.length() - 1) + "}";
                    } else if (t instanceof boolean[]) {
                        String s = Arrays.toString((boolean[]) t);
                        return "{" + s.substring(1, s.length() - 1) + "}";
                    }
                    try {
                        return ts((Object[]) t);
                    } catch (ClassCastException e1) {
                        return t.toString();
                    }
                }
            }

            private static <T> String ts(T[] arr) {
                StringBuilder ret = new StringBuilder();
                ret.append("{");
                boolean first = true;
                for (T t : arr) {
                    if (!first) {
                        ret.append(", ");
                    }
                    first = false;
                    ret.append(ts(t));
                }
                ret.append("}");
                return ret.toString();
            }

            private static <T> String ts(Iterable<T> iter) {
                StringBuilder ret = new StringBuilder();
                ret.append("{");
                boolean first = true;
                for (T t : iter) {
                    if (!first) {
                        ret.append(", ");
                    }
                    first = false;
                    ret.append(ts(t));
                }
                ret.append("}");
                return ret.toString();
            }

            public static void dbg(Object... o) {
                if (LOCAL) {
                    System.err.print("Line #" + Thread.currentThread().getStackTrace()[2].getLineNumber() + ": [");
                    for (int i = 0; i < o.length; i++) {
                        if (i != 0) {
                            System.err.print(", ");
                        }
                        System.err.print(ts(o[i]));
                    }
                    System.err.println("]");
                }
            }

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
