import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int r = in.nextInt();

        List<Integer> rs = new ArrayList<>();
        ;
        for (int i = 0; i < r; i++) {
            rs.add(in.nextInt() - 1);
        }

        int[][] d = new int[n][n];
        int INF = 1 << 29;
        for (int i = 0; i < n; i++) {
            Arrays.fill(d[i], INF);
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            int c = in.nextInt();

            d[a][b] = d[b][a] = c;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (d[j][k] > d[j][i] + d[i][k]) {
                        d[j][k] = d[j][i] + d[i][k];
                    }
                }
            }
        }

        Deque<Node> deque = new ArrayDeque<>();
        List<Integer> firstState = Collections.emptyList();
        deque.push(new Node(firstState, rs));
        int min = INF;
        while (!deque.isEmpty()) {
            Node node = deque.poll();

            if (node.state.size() == r) {
                int tmp = 0;
                for (int i = 0; i < r - 1; i++) {
                    int a = node.state.get(i);
                    int b = node.state.get(i + 1);
                    if (d[a][b] != INF) {
                        tmp += d[a][b];
                    }
                }
                min = (tmp != 0) ? Math.min(min, tmp) : min;
            }

            for (Integer element : node.candidate) {
                List<Integer> nextState = new ArrayList<>(node.state);
                nextState.add(element);

                List<Integer> candidate = new ArrayList<>(node.candidate);
                candidate.remove(element);

                deque.add(new Node(nextState, candidate));
            }
        }
        out.println(min);
    }
}

class Node {
    List<Integer> state;
    List<Integer> candidate;

    Node(List<Integer> state, List<Integer> candidate) {
        this.state = state;
        this.candidate = candidate;
    }
}

class InputReader implements AutoCloseable {
    private final Scanner sc = new Scanner(System.in);

    String next() {
        return this.sc.next();
    }

    int nextInt() {
        return Integer.parseInt(this.sc.next());
    }

    long nextLong() {
        return Long.parseLong(this.sc.next());
    }

    double nextDouble() {
        return Double.parseDouble(this.sc.next());
    }

    @Override
    public void close() {
        this.sc.close();
    }
}
