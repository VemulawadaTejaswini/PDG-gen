import java.util.*;

public class Main {
    long data[][];

    public void main(Scanner sc) {
        int n = sc.nextInt();
        data = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = sc.nextInt();
            }
        }

        long e1, e2, e3;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    e1 = data[i][j];
                    e2 = data[i][k];
                    e3 = data[j][k];

                    if (e1 + e2 == e3) {
                        data[k][j] = 0;
                    } else if (e1 + e3 == e2) {
                        data[k][i] = 0;
                    } else if (e2 + e3 == e1) {
                        data[j][i] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            dijkstra(i, n);
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum += data[i][j];
            }
        }
        System.out.println(sum);
    }

    private void dijkstra(int start, int n) {
        long mins[] = new long[n];
        boolean fix[] = new boolean[n];

        Arrays.fill(mins, 1145141919);
        mins[start] = 0;

        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> Long.compare(mins[o1], mins[o2]));
        queue.add(start);
        while (!queue.isEmpty()) {
            int src = queue.poll();
            fix[src] = true;

            for (int dst = 0; dst < n; dst++) {
                if (!fix[dst]) {
                    mins[dst] =
                        Math.min(mins[dst], mins[src] + Math.max(data[src][dst], data[dst][src]));
                    queue.add(dst);
                }
            }
        }

        for (int i = start; i < n; i++) {
            if (data[start][i] != mins[i]) {
                System.out.println(-1);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
