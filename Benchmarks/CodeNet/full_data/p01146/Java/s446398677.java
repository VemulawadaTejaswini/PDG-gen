import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Princess_In_Danger solver = new Princess_In_Danger();
        try {
            int testNumber = 1;
            while (true)
                solver.solve(testNumber++, in, out);
        } catch (UnknownError e) {
            out.close();
        }
    }

    static class Princess_In_Danger {
        ArrayList<Node>[] graph;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int L = in.nextInt();
            int K = in.nextInt();
            int A = in.nextInt();
            int H = in.nextInt();
            if (N == 0) {
                throw new UnknownError();
            }
            HashSet<Integer> reito = new HashSet<>();
            for (int i = 0; i < L; ++i) {
                reito.add(in.nextInt());
            }
            graph = new ArrayList[N];
            for (int i = 0; i < N; ++i) {
                graph[i] = new ArrayList<>();
            }
            for (int i = 0; i < K; ++i) {
                int X = in.nextInt();
                int Y = in.nextInt();
                int T = in.nextInt();
                graph[X].add(new Node(Y, T));
                graph[Y].add(new Node(X, T));
            }
            PriorityQueue<State> pq = new PriorityQueue<>();
            pq.add(new State(A, M, 0));
            int[][] dist = new int[N][M + 10];
            for (int i = 0; i < N; ++i) {
                Arrays.fill(dist[i], (int) 1e9);
            }
            while (!pq.isEmpty()) {
                State nowState = pq.poll();
                if (dist[nowState.nowPoint][nowState.nokori] < nowState.nowTime) {
                    continue;
                }
                dist[nowState.nowPoint][nowState.nokori] = nowState.nowTime;
                for (Node e : graph[nowState.nowPoint]) {
                    if (nowState.nokori - e.cost < 0) {
                        continue;
                    }
                    if (dist[e.to][nowState.nokori - e.cost] < nowState.nowTime + e.cost) {
                        continue;
                    }
                    if (reito.contains(e.to)) {
                        for (int i = 1; nowState.nokori - e.cost + i <= M; ++i) {
                            pq.add(new State(e.to, nowState.nokori - e.cost + i, nowState.nowTime + e.cost + i));
                        }
                    }
                    pq.add(new State(e.to, nowState.nokori - e.cost, nowState.nowTime + e.cost));
                }
            }
            int ans = (int) 1e9;
            for (int i = 0; i < +M; ++i) {
                ans = Math.min(ans, dist[H][i]);

            }
            if (ans == (int) 1e9) {
                out.println("Help!");
            } else {
                out.println(ans);
            }
        }

        @SuppressWarnings("unchecked")
        public class Node {
            int to;
            int cost;

            public Node(int to, int cost) {
                this.to = to;
                this.cost = cost;
            }

        }

        public class State implements Comparable<State> {
            int nokori;
            int nowPoint;
            int nowTime;

            public State(int nowPoint, int nokori, int nowTime) {
                this.nokori = nokori;
                this.nowPoint = nowPoint;
                this.nowTime = nowTime;
            }


            public int compareTo(State s2) {
                if (this.nowTime == s2.nowTime) {
                    if (this.nokori > s2.nokori) return 1;
                    else if (this.nokori < s2.nokori) return -1;
                    else return 0;
                } else {
                    if (this.nowTime > s2.nowTime) return 1;
                    else if (this.nowTime < s2.nowTime) return -1;
                    else return 0;
                }
            }

        }

    }
}