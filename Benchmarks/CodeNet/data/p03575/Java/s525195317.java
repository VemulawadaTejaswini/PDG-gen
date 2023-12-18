import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    Node[] nodes;

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        nodes = new Node[N];
        Point[] lines = new Point[M];
        for (int i = 0; i < N; i++) {
            nodes[i] = new Node(i);
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            lines[i] = new Point(a, b);
            nodes[a].linkeds.add(nodes[b]);
            nodes[b].linkeds.add(nodes[a]);
        }

        int bridge = 0;
        for (int i = 0; i < M; i++) {
            int a = lines[i].x;
            int b = lines[i].y;
            nodes[a].linkeds.remove(nodes[b]);
            nodes[b].linkeds.remove(nodes[a]);

            boolean[] through = new boolean[N];
            for (int j = 0; j < N; j++) {
                through[j] = false;
            }
            advance(0, through);
            for (int j = 0; j < N; j++) {
                if (!through[j]) {
                    bridge++;
                    break;
                }
            }
            nodes[a].linkeds.add(nodes[b]);
            nodes[b].linkeds.add(nodes[a]);
        }
        System.out.println(bridge);
    }

    void advance(int pos, boolean[] through) {
        if (through[pos]) {
            return;
        }
        through[pos] = true;
        for (Node node : nodes[pos].linkeds) {
            advance(node.num, through);
        }
    }

    class Node {

        int num;
        List<Node> linkeds = new ArrayList<>();

        Node(int num) {
            this.num = num;
        }
    }
}
