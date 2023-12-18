import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

    class A {
        BigInteger start;
        int value;
        BigInteger end;

        public BigInteger getStart() {
            return start;
        }

        public void setStart(BigInteger start) {
            this.start = start;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public BigInteger getEnd() {
            return end;
        }

        public void setEnd(BigInteger end) {
            this.end = end;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a = (A) o;
            return value == a.value &&
                    Objects.equals(start, a.start) &&
                    Objects.equals(end, a.end);
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, value, end);
        }

        @Override
        public String toString() {
            return "A{" +
                    "start=" + start +
                    ", value=" + value +
                    ", end=" + end +
                    '}';
        }
    }

    private void solve(InputReader in, PrintWriter out) {
        String s = in.next();
        long k = in.nextLong();
        BigInteger res = BigInteger.ONE;
        List<A> list = new ArrayList<>();
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == 1) {
                A a = new A();
                a.setStart(res);
                res = res.add(BigInteger.ONE);
                a.setValue(1);
                a.setEnd(res);
                list.add(a);
            } else {
                A a = new A();
                a.setStart(res);
                res = res.add(BigInteger.valueOf(Integer.parseInt(arr[i]) * 2 * 5000000000000000L));
                a.setValue(Integer.parseInt(arr[i]));
                a.setEnd(res);
                list.add(a);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStart().compareTo(BigInteger.valueOf(k)) <= 0 && list.get(i).getEnd().compareTo(BigInteger.valueOf(k)) > 0) {
                out.println(list.get(i).getValue());
                return;
            }
        }
    }


    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try (
                InputReader in = new InputReader(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }


    static class InputReader implements AutoCloseable {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }


        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        @Override
        public void close() {

        }
    }


}
