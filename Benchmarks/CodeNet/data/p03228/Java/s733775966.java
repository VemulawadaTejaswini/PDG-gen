import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        int a = in.nextInt();
        int b = in.nextInt();
        int k = in.nextInt();
        boolean first = true;
        while (k-->0) {
            if(first) {
                if(a%2!=0) a--;
                a/=2;
                b+=a;
            }
            else {
                if(b%2!=0) b--;
                b/=2;
                a+=b;
            }
            first=!first;
        }
        out.println(a+ " " + b);
        out.flush();
    }
    static boolean inside(int a,int b,int c,int d) {
        if(a>=c && a<=d && b>c && b<=d) return true;
        return false;
    }
    static boolean check(int [] a,int []b) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]>b[i]) return false;
        }
        return true;
    }
    static int gcd (int a,int b) {
        return b == 0 ? a : gcd(b,a%b);
    }
    static int [] freq(String s) {
        int [] f = new int[26];
        for (char c : s.toCharArray()) {
            f[c-'a']++;
        }
        return f;
    }

    private static int [] mergeTwoArrays(int [] a, int [] b) {
        int [] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i<a.length && j<b.length) {
            if(a[i]<b[j]) {
                res[index++] = a[i++];
            }
            else {
                res[index++] = b[j++];
            }
        }
        System.out.println(i + " " + j);
        if(j == b.length - 1) {
            while (i<a.length) {
                res[index++] = a[i++];
            }
        }
        else {
            while (j<b.length) {
                res[index++] = b[j++];
            }
        }
        return res;
    }
}
class Point {
    private int type;
    private int left;
    private int right;

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
    public int getType() {
        return type;
    }
    public Point(int type,int left,int right) {
        this.type = type;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "type " + type + " left " + left + " right " + right;
    }
}

class InputReader extends BufferedReader {
    StringTokenizer tokenizer;

    public InputReader(InputStream inputStream) {
        super(new InputStreamReader(inputStream), 32768);
    }

    public InputReader(String filename) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(filename)));
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return tokenizer.nextToken();
    }

    public Integer nextInt() {
        return Integer.valueOf(next());
    }
    public Long nextLong() {return  Long.valueOf(next());}

    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream outputStream) {
            super(outputStream);
        }

        public OutputWriter(Writer writer) {
            super(writer);
        }

        public OutputWriter(String filename) throws FileNotFoundException {
            super(filename);
        }

        public void close() {
            super.close();
        }
    }
}