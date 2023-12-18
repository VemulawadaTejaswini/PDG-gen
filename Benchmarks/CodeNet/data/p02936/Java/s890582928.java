import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static ArrayList<Node> nodeList = new ArrayList<Node>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int Q = sc.nextInt();
        for (int i = 0; i < N; i++) {
            nodeList.add(new Node(i));
        }

        for (int i = 1; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodeList.get(b - 1).parent = nodeList.get(a - 1);
            // nodeList.get(a - 1).addEdge(nodeList.get(b - 1));
        }

        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            nodeList.get(p - 1).count += x;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(nodeList.get(i).checkParent() + " ");
        }
        System.out.println();
    }
}

class Node {
    final int number;
    int count = 0;
    Node parent;
    boolean isLeaf = true;
    ArrayList<Node> edge = new ArrayList<Node>();

    Node(int number) {
        this.number = number;
    }

    void addEdge(Node n) {
        edge.add(n);
    }

    long checkParent() {
        long sum = 0;
        sum+=count;
        Node tmp = parent;
        while (tmp != null) {
            sum += tmp.count;
            tmp = tmp.parent;
        }
        return sum;
    }
}