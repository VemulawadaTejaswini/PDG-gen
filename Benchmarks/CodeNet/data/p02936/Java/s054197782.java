import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    List<Node> nodes = new ArrayList<>();

    void solve() {
        Scanner sc = new Scanner(System.in);
        int nodeNum = sc.nextInt(); // N
        int operationCount = sc.nextInt(); // Q
        int[] parentIndexes = new int[nodeNum - 1]; // a[i]
        int[] childIndexes  = new int[nodeNum - 1]; // b[i]
        for (int i = 0; i < nodeNum - 1; i++) {
            parentIndexes[i] = sc.nextInt();
            childIndexes[i]  = sc.nextInt();
        }
        int[] topIndexes = new int[operationCount]; // p[i]
        int[] counts = new int[operationCount];   // x[i]
        for (int i = 0; i < operationCount; i++) {
            topIndexes[i] = sc.nextInt();
            counts[i]  = sc.nextInt();
        }

        nodes = new ArrayList<>();
        for (int i = 0; i < nodeNum - 1; i++) {
            int parentIndex = parentIndexes[i];
            int childIndex  = childIndexes[i];

            // 親のNodeの取得または作成
            Node parent = null;
            for (Node node : nodes) {
                if (node.index == parentIndex) {
                    parent = node;
                    break;
                }
            }
            if (parent == null) {
                parent = new Node(parentIndex, 0);
                nodes.add(parent);
            }
            // 子Nodeの作成。
            Node child = new Node(childIndex, 0);
            nodes.add(child);

            // 親Nodeと子Nodeとの関連を作成
            parent.addChild(child);
        }

        // 各ノードにカウントを足す。
        for (int i = 0; i < operationCount; i++) {
            addCount(topIndexes[i], counts[i]);
        }

        for (Node node : nodes) {
            System.out.print(node.counter + " ");
        }


    }
    void addCount (int topIndex, int count) {
        Node node = nodes.get(topIndex - 1); // Listのindexと、問題文上のIndexはずれているので、ここで調整する。
        node.addCounter(count);
        for (Node child : node.children) {
            addCount(child.index, count);
        }
    }

    class Node {
        int index = 0;
        int counter = 0;
        List<Node> children = new ArrayList<>();

        Node (int index, int counter) {
            this.index = index;
            this.counter = counter;
        }
        void addCounter(int number) {
            counter += number;
        }
        void addChild(Node node) {
            children.add(node);
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}