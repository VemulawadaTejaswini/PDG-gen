import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);


        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int min = 0;
        HashSet<Integer> set = new HashSet<>();
        int last = -1;
        for (int i = 0; i < a.length - 2; i++) {
            if(a[i+2] != a[i]) {
                a[i+2] = a[i];
                min++;
            }
            set.add(a[i]);
            if(set.size() > 2) {
                a[i] = a[i-2];
                a[i+2] = a[i];
                min+=2;
            }
        }
        if(set.size() == 1) {
            out.println(n/2);
        }
        else {
            out.println(min);
        }

        out.flush();

    }
    static boolean check(char [] ca,char [] cb) {
        for (char c = 'a';c<='z';c++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < ca.length; i++) {
                if(ca[i] == c) {
                    set.add(cb[i]);
                }
                if(set.size() > 1) {
                    return false;
                }
            }
        }
        return  true;
    }
}

class Envelope {
    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Envelope(int width,int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return width + " " + height;
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

    public Integer nextInt() {return Integer.valueOf(next());}
    public Long nextLong() {return  Long.valueOf(next());}
    public Double nextDouble() {return Double.valueOf(next());}

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