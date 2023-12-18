import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static class Node {

        int num;

        int dist;

        public Node(int num, int dist) {

            this.num = num;

            this.dist = dist;

        }
    }

    static boolean[][] edges;

    static int N;

    static int M;

    static int S;

    static int T;
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        N = s.nextInt();

        M = s.nextInt();

        edges = new boolean[N+1][N+1];

        for (int i = 0; i < M; i++) {

            int from = s.nextInt();

            int to = s.nextInt();

            edges[from][to] = true;
        }

        S = s.nextInt();

        T = s.nextInt();
        bfs();


    }

    public static void bfs() {


        boolean[][] flag = new boolean[N+1][3];


        Queue<Node> q = new LinkedList<>();

        flag[S][0] = true;

        Node n = new Node(S, 0);

        q.add(n);

            while (q.isEmpty() == false) {

                Node k = q.poll();

                int dist = k.dist;

            if (dist % 3 ==0 && k.num == T) {

                System.out.println(dist/3);

                return;
            }

            int newDist = dist + 1;


            boolean[] edge = edges[k.num];

            for (int i = 1; i <= N; i++) {

                if (edge[i] == false) continue;

                if (flag[i][newDist %3] == true) continue;

                flag[i][newDist%3] = true;

                q.add(new Node(i, newDist));

            }

        }

        System.out.println(-1);
    }


}
