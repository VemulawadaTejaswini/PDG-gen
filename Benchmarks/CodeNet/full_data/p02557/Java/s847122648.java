import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.io.InputStream;

/*
 * Copyright (c) --> Arpit
 * Date Created : 13/9/2020
 * Have A Good Day !
 */

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Arpit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FContrast solver = new FContrast();
        solver.solve(1, in, out);
        out.close();
    }
    
    static class FContrast {
        public void solve(int testNumber, FastReader r, OutputWriter out) {
            int n = r.nextInt();
            int[] A = r.nextIntArray(n);
            int[] B = r.nextIntArray(n);
            int[] freq = new int[200001];
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                freq[B[i]]++;
                set.add(B[i]);
            }
//        for (int i = 1; i <= n; i++) {
//            out.print(freq[i] + " ");
//        }
//        out.println();
            boolean flag = true;
            int[] ans = new int[n];
            for (int i = 0; i < n && flag; i++) {
                if (A[i] == B[i]) {
                    Integer ele1 = set.higher(A[i]), ele2 = set.lower(A[i]);
                    if (ele1 != null) {
                        ans[i] = ele1;
                        freq[ele1]--;
                        if (freq[ele1] == 0) set.remove(ele1);
                    } else if (ele2 != null) {
                        ans[i] = ele2;
                        freq[ele2]--;
                        if (freq[ele2] == 0) set.remove(ele2);
                    } else {
                        flag = false;
                    }
                } else {
                    ans[i] = B[i];
                    freq[B[i]]--;
                    if (freq[B[i]] == 0) set.remove(B[i]);
                }
            }
            if (flag) {
                out.println("Yes");
                out.println(ans);
            } else {
                out.println("No");
            }
        }
        
    }
    
    static class OutputWriter {
        private final PrintWriter writer;
        
        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }
        
        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }
        
        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                writer.print(objects[i]);
                if (i != objects.length - 1) writer.print(" ");
            }
        }
        
        public void println(Object... objects) {
            print(objects);
            writer.println();
        }
        
        public void print(int[] array) {
            for (int i = 0; i < array.length; i++) {
                writer.print(array[i]);
                if (i != array.length - 1) writer.print(" ");
            }
        }
        
        public void println(int[] array) {
            print(array);
            writer.println();
        }
        
        public void close() {
            writer.close();
        }
        
    }
    
    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;
        
        public FastReader(InputStream stream) {
            this.stream = stream;
        }
        
        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
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
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
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
        
        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }
        
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
            
        }
        
    }
}

