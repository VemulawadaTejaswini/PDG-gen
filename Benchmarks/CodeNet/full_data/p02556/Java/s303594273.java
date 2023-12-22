

/*
    AUTH -> krishna-3249
    DATE -> 9/13/20
    TIME -> 7:01 PM
*/

/*
    Simple can be harder than complex.
    Body, mind and spirit.
    Strive for progress, not perfection.
*/

import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {

    private static final long MOD = 1_000_000_000 + 7;

    private long power(long base, long exponent) {
        long res = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                res = (res * base) % MOD;
                exponent--;
            } else {
                base = (base * base) % MOD;
                exponent = exponent >> 1;
            }
        }
        return res;
    }

    private long inverseMod(long number) {
        return power(number, MOD - 2);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static class Node {
        public int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void solve(Read input, Write output) throws Exception {
        int N = input.readInt();
        List<Node> points = new ArrayList<>();
        for (int i=0;i<N;i++) {
            points.add(new Node(input.readInt(), input.readInt()));
        }
        Collections.sort(points, new Comparator<Node>() {
            @Override
            public int compare(Node node1, Node node2) {
                return Long.compare(node1.x+node1.y, node2.x+node2.y);
            }
        });
        int x1 = points.get(0).x;
        int y1 = points.get(0).y;
        int x2 = points.get(N-1).x;
        int y2 = points.get(N-1).y;
        Collections.sort(points, new Comparator<Node>() {
            @Override
            public int compare(Node node1, Node node2) {
                return Long.compare(node1.x-node1.y, node2.x-node2.y);
            }
        });
        int x3 = points.get(0).x;
        int y3 = points.get(0).y;
        int x4 = points.get(N-1).x;
        int y4 = points.get(N-1).y;

        int dist1 = Math.abs(x2-x1)+Math.abs(y2-y1);
        int dist2 = Math.abs(x3-x4)+Math.abs(y3-y4);

        output.printLine(Math.max(dist1, dist2));
    }

    public static void main(String[] args) throws Exception {
        Read input = new Read();
        Write output = new Write();
        Main D = new Main();
        D.solve(input, output);
        output.flush();
        output.close();
    }

    // java fast io reader and writer
    // taken from various sources and customized

    static class Read {

        private byte[] buffer = new byte[10 * 1024];
        private int index;
        private InputStream input_stream;
        private int total;

        public Read() {
            input_stream = System.in;
        }

        public int read() throws IOException {
            if (total < 0)
                throw new InputMismatchException();
            if (index >= total) {
                index = 0;
                total = input_stream.read(buffer);
                if (total <= 0)
                    return -1;
            }
            return buffer[index++];
        }

        public long readLong() throws IOException {
            long number = 0;
            int n = read();
            while (isWhiteSpace(n))
                n = read();
            long neg = 1l;
            if (n == '-') {
                neg = -1l;
                n = read();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    number *= 10l;
                    number += (long) (n - '0');
                    n = read();
                } else throw new InputMismatchException();
            }
            return neg * number;
        }

        public int readInt() throws IOException {
            int integer = 0;
            int n = read();
            while (isWhiteSpace(n))
                n = read();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = read();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = read();
                } else throw new InputMismatchException();
            }
            return neg * integer;
        }

        public double readDouble() throws IOException {
            double doub = 0;
            int n = read();
            while (isWhiteSpace(n))
                n = read();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = read();
            }
            while (!isWhiteSpace(n) && n != '.') {
                if (n >= '0' && n <= '9') {
                    doub *= 10;
                    doub += n - '0';
                    n = read();
                } else throw new InputMismatchException();
            }

            if (n == '.') {
                n = read();
                double temp = 1;
                while (!isWhiteSpace(n)) {
                    if (n >= '0' && n <= '9') {
                        temp /= 10;
                        doub += (n - '0') * temp;
                        n = read();
                    } else throw new InputMismatchException();
                }
            }
            return doub * neg;
        }

        public String readString() throws IOException {
            StringBuilder sb = new StringBuilder();
            int n = read();
            while (isWhiteSpace(n))
                n = read();
            while (!isWhiteSpace(n)) {
                sb.append((char) n);
                n = read();
            }
            return sb.toString();
        }

        public List<Double> readDoubleList(int size) throws IOException {
            List<Double> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                res.add(this.readDouble());
            }
            return res;
        }

        public double[] readDoubleArray(int size) throws IOException {
            double[] res = new double[size];
            for (int i = 0; i < size; i++) {
                res[i] = this.readDouble();
            }
            return res;
        }

        public List<String> readStringList(int size) throws IOException {
            List<String> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                res.add(this.readString());
            }
            return res;
        }

        public String[] readStringArray(int size) throws IOException {
            String[] res = new String[size];
            for (int i = 0; i < size; i++) {
                res[i] = this.readString();
            }
            return res;
        }

        public List<Integer> readIntList(int size) throws IOException {
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                res.add(this.readInt());
            }
            return res;
        }

        public List<Long> readLongList(int size) throws IOException {
            List<Long> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                res.add(this.readLong());
            }
            return res;
        }

        public int[] readIntArray(int size) throws IOException {
            int[] res = new int[size];
            for (int i = 0; i < size; i++) {
                res[i] = this.readInt();
            }
            return res;
        }

        public long[] readLongArray(int size) throws IOException {
            long[] res = new long[size];
            for (int i = 0; i < size; i++) {
                res[i] = this.readLong();
            }
            return res;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
                return true;
            return false;
        }
    }

    static class Write {

        private final BufferedWriter bw;

        public Write() {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object str) throws IOException {
            bw.append(str + "");
        }

        public void printLine(Object str) throws IOException {
            print(str);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }

        public void flush() throws IOException {
            bw.flush();
        }
    }
}