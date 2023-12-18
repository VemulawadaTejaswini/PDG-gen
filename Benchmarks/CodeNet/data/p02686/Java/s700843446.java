import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.AbstractCollection;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author iavanish
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FBracketSequencing solver = new FBracketSequencing();
        solver.solve(1, in, out);
        out.close();
    }

    static class FBracketSequencing {

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            PriorityQueue<FBracketSequencing.Data> priorityQueue = new PriorityQueue<>();

            for (int i = 0; i < n; i++) {
                int open = 0;
                int close = 0;
                int maxClose = 0;

                int c;
                while ((c = in.read()) != -1) {
                    if (c == '\n') {
                        break;
                    }
                    if (c == 40) {
                        open++;
                    } else if (c == 41) {
                        close++;
                    }
                    maxClose = Math.max(maxClose, close - open);
                }
                priorityQueue.offer(new FBracketSequencing.Data(open, close, maxClose));
            }

            boolean flag = true;
            int open = 0;
            int close = 0;
            while (!priorityQueue.isEmpty()) {
                FBracketSequencing.Data data = priorityQueue.poll();
                if ((open - close) < data.maxClose) {
                    flag = false;
                    break;
                }
                open += data.open;
                close += data.close;
                if (open < close) {
                    flag = false;
                    break;
                }
            }

            if (flag && open == close) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

        private static class Data implements Comparable<FBracketSequencing.Data> {

            public int open;
            public int close;
            public int maxClose;

            public Data(int open, int close, int maxClose) {
                this.open = open;
                this.close = close;
                this.maxClose = maxClose;
            }

            public int compareTo(FBracketSequencing.Data data) {
                if (this.maxClose == data.maxClose) {
                    return (data.open - data.close) - (this.open - this.close);
                } else if (this.maxClose == 0) {
                    return -1;
                } else if (data.maxClose == 0) {
                    return 1;
                }
                return this.maxClose - data.maxClose;
            }

        }

    }

    static class FastReader {

        private final int BUFFER_SIZE = 1 << 16;
        private final InputStream inputStream;
        private final byte[] buffer;
        private int bufferPointer;
        private int bytesRead;

        public FastReader() {
            this.inputStream = new DataInputStream(System.in);
            this.buffer = new byte[BUFFER_SIZE];
            this.bufferPointer = bytesRead = 0;
        }

        public FastReader(InputStream inputStream) {
            this.inputStream = inputStream;
            this.buffer = new byte[BUFFER_SIZE];
            this.bufferPointer = bytesRead = 0;
        }

        public FastReader(String fileName) {
            try {
                this.inputStream = new DataInputStream(new FileInputStream(fileName));
                this.buffer = new byte[BUFFER_SIZE];
                this.bufferPointer = bytesRead = 0;
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            int nextInt = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean negative = (c == '-');
            if (negative) {
                c = read();
            }
            do {
                nextInt = nextInt * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (negative) {
                return -nextInt;
            }
            return nextInt;
        }

        public void fillBuffer() {
            try {
                bytesRead = inputStream.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1) {
                    buffer[0] = -1;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public byte read() {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

    }

}

