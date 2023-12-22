
import java.util.Scanner;

public class Main {

    private static int inf = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = Integer.parseInt(scan.next());
        int e = Integer.parseInt(scan.next());
        long[][] dist = new long[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (i == j) {
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = inf;
                }
            }
        }

        for (int k = 0; k < e; k++) {
            int i = Integer.parseInt(scan.next());
            int j = Integer.parseInt(scan.next());
            int d = Integer.parseInt(scan.next());
            dist[i][j] = d;
        }
        scan.close();

        for (int k = 0; k < v; k++) {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    if (dist[i][k] != inf && dist[k][j] != inf) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        for (int i = 0; i < v; i++) {
            if (dist[i][i] < 0) {
                System.out.println("NEGATIVE CYCLE");
                return;
            }
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (dist[i][j] == inf) {
                    System.out.print("INF");
                } else {
                    System.out.print(dist[i][j]);

                }

                if (j != v - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}

