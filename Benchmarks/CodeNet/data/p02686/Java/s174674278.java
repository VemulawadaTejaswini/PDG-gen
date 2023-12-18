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
            int open = 0;
            int close = 0;

            for (int i = 0; i < n; i++) {
                int temp = 0;
                int tempOpen = 0;
                int tempClose = 0;

                int c;
                while ((c = in.read()) != -1) {
                    if (c == '\n') {
                        break;
                    }
                    if (c == 40) {
                        tempOpen++;
                    } else {
                        tempClose++;
                        temp = Math.max(temp, tempClose - tempOpen);
                    }
                }
                open += tempOpen;
                close += tempClose;
                priorityQueue.offer(new FBracketSequencing.Data(tempOpen - tempClose, temp));
            }

            if (open != close) {
                out.println("No");
            } else {
                boolean flag = true;
                int currOpen = 0;
                while (!priorityQueue.isEmpty()) {
                    FBracketSequencing.Data data = priorityQueue.poll();
                    if (data.maxClose > 0 && currOpen < data.maxClose) {
                        flag = false;
                        break;
                    }
                    currOpen += data.finalOpen;
                }
                if (flag) {
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            }
        }

        private static class Data implements Comparable<FBracketSequencing.Data> {

            public int finalOpen;
            public int maxClose;

            public Data(int finalOpen, int maxClose) {
                this.finalOpen = finalOpen;
                this.maxClose = maxClose;
            }

            public int compareTo(FBracketSequencing.Data data) {
                if (this.maxClose >= 0 && data.maxClose >= 0) {
                    return data.finalOpen - this.finalOpen;
                } else if (this.maxClose >= 0) {
                    return -1;
                } else if (data.maxClose >= 0) {
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

        private void fillBuffer() {
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

