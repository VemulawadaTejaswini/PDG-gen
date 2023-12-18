import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Set;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author L_aka_ryuga
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FDivisionOrSubstraction solver = new FDivisionOrSubstraction();
        solver.solve(1, in, out);
        out.close();
    }

    static class FDivisionOrSubstraction {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

            long n = in.nl();
/*

        for(int i = 2;i <= 1000;i+=2){
            out.println("for "+i);
            _Ez_Int_ArrayList list = new _Ez_Int_ArrayList();
            for(int j = 2; j <= i ; j++){
                long ele = i;
                while(ele != 1){
                    if(ele%j == 0){
                        ele /= j;
                    }
                    else if(ele < 1) break;
                    else
                        ele -= j;
                }
                if(ele == 1){
//                    out.println("k = "+j);
                    list.add((int)j);
                }
            }
*/

            /*mY algo*/

            long i = n;
            int ele = 0;
            Set<Long> set = new HashSet<>();
            for (long j = 2; j * j <= i; j++) {

                if (i % j == 0) {
                    long rem = divide(i, j);
                    if (rem % j == 1) {
                        set.add(j);
                    }
                }

            }
            if ((i - 1) != 1) {
                for (long j = 2; j * j <= i - 1; j++) {
                    if ((i - 1) % j == 0) {
                        set.add(((i - 1) / j));
                        set.add(j);
                    }
                }
                set.add((i - 1));
            }
            set.add(i);
            /*
            _Ez_Int_Iterator itr = set.iterator();
            int index = 0;
            while(itr.hasNext()){
                out.println(itr.next()+"  "+list.get(index++));
                *//*if(itr.next() != list.get(index++)){
                    out.println("Wrong ans");
                    return;
                }*//*
            }*/

            /*for(int j = 0;j < set.size() ; j++){
                if(!set.contains(list.get(j))){
                    out.println("Worng ans");
                    return;
                }
            }
            out.println("right ans");*/

            out.println(set.size());
        }

        public long divide(long n, long ele) {
            while (n % ele == 0)
                n /= ele;
            return n;
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

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
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

        public long nl() {
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

