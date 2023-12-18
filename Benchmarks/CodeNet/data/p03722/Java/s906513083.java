import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    private static final double ninf = -1e18;

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();

            int[] a = new int[M];
            int[] b = new int[M];
            int[] c = new int[M];
            for (int i = 0; i < M; i++) {
                a[i] = in.nextInt() - 1;
                b[i] = in.nextInt() - 1;
                c[i] = in.nextInt();
            }

            ArrayList<Edge>[] nextCity = new ArrayList[N];
            for (int i = 0; i < nextCity.length; i++) {
                nextCity[i] = new ArrayList<>();
            }
            for (int i = 0; i < M; i++) {
                nextCity[a[i]].add(new Edge(b[i], c[i]));
            }

            PriorityQueue<State> pq = new PriorityQueue<>();
            long[] max = new long[N];
            for (int i = 0; i < max.length; i++) {
                max[i] = (long) ninf;
            }
            {
                State e = new State();
                e.index = 0;
                e.score = 0;
                pq.add(e);
                max[e.index] = e.score;
            }

            int countPoll = 0;
            for (; !pq.isEmpty();) {
                State current = pq.poll();
                countPoll++;

                if (countPoll >= 2100) {
                    System.out.println("inf");
                    return;
                }

                for (Edge edge : nextCity[current.index]) {
                    State next = new State();
                    next.index = edge.index;
                    next.score = current.score + edge.score;

                    if (next.score <= max[next.index]) {
                        continue;
                    }

                    // if (max[next.index] > ninf) {
                    // System.out.println("inf");
                    // return;
                    // }

                    max[next.index] = next.score;
                    pq.add(next);
                }

            }

            System.out.println(max[N - 1]);

        }
    }
}

class State implements Comparable<State> {

    public int index;
    public long score;

    @Override
    public int compareTo(State o) {
        if (score > o.score) {
            return -1;
        }
        if (score < o.score) {
            return 1;
        }
        return 0;
    }

}

class Edge {
    int index;
    int score;

    public Edge(int index, int score) {
        super();
        this.index = index;
        this.score = score;
    }
}