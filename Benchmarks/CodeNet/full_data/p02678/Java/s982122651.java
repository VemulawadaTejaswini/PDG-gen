import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();
        Map<Integer, List<Integer>> road = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            road.computeIfAbsent(A, k -> new ArrayList<>()).add(B);
            road.computeIfAbsent(B, k -> new ArrayList<>()).add(A);
        }
        int[] C = new int[N + 1];
        C[1] = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(1);
        while (!deque.isEmpty()) {
            int from = deque.removeFirst();
            for (int to : road.get(from)) if (C[to] == 0) {
                C[to] = from;
                deque.addLast(to);
            }
        }
        out.println("Yes");
        for (int i = 2; i <= N; i++)
            out.println(C[i]);

        out.flush();
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}

