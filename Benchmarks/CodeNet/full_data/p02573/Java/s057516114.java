import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    static class Node {
        int num;
        Set<Node> info = new HashSet<>();
        Node(int num) {
            this.num = num;
        }
    }

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();
        List<Node> nodes = new ArrayList<>();
        for (int n = 0; n < N; n++)
            nodes.add(new Node(n));
        for (int m = 0; m < M; m++) {
            int A = in.nextInt() - 1;
            int B = in.nextInt() - 1;
            nodes.get(A).info.add(nodes.get(B));
            nodes.get(B).info.add(nodes.get(A));
        }
        boolean[] b = new boolean[N];
        int ans = 0;
        for (int n = 0; n < N; n++) {
            if (b[n]) continue;
            int count = 0;
            Deque<Integer> deque = new ArrayDeque<>();
            deque.add(n);
            b[n] = true;
            count++;
            while (!deque.isEmpty()) {
                int i = deque.poll();
                for (Node j : nodes.get(i).info) if (!b[j.num]) {
                    deque.add(j.num);
                    b[j.num] = true;
                    count++;
                }
            }
            ans = Math.max(ans, count);
        }
        out.println(ans);

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
