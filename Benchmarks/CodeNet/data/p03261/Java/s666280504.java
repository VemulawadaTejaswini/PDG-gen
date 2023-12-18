import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        int n = in.nextInt();
        HashSet<String> set = new HashSet<>();
        boolean first = false;
        char firstLetter = ' ';
        char lastLetter = ' ';
        while (n-->0) {
            String s = in.next();
            if(!first) {
                lastLetter = s.charAt(s.length() - 1);
                first = true;
            }
            else {
                firstLetter = s.charAt(0);
                if(firstLetter!=lastLetter) {
                    out.println("No");
                    out.flush();
                    return;
                }
                lastLetter = s.charAt(s.length() - 1);
            }
            if(set.contains(s)) {
                out.println("No");
                out.flush();
                return;
            }
            set.add(s);

        }

        out.println("Yes");
        out.flush();
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
    private int left;
    private int right;

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
    public Point(int left,int right) {
        this.left = left;
        this.right = right;
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