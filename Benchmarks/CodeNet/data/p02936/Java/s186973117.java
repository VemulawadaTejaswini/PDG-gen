import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Map<Integer, Node> maps = new HashMap<>();
        List<Integer> keyList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        for (int i = 0; i < N - 1; i++) {
            int parent = scanner.nextInt();
            int child = scanner.nextInt();
            Node p, c;
            if (!maps.containsKey(parent)) {
                p = new Node();
                maps.put(parent, p);
                keyList.add(parent);
            } else {
                p = maps.get(parent);
            }
            c = new Node();
            maps.put(child, c);
            keyList.add(child);
            c.setParent(p);
        }
        Map<Integer, Integer> ope = new HashMap<>();
        for (int i = 0; i < Q; i++) {
            int point = scanner.nextInt();
            int val = scanner.nextInt();
            Node node = maps.get(point);
            node.data += val;
        }
        keyList.sort(Integer::compareTo);
        HashMap<Node, Integer> par = new HashMap<>();
        for (Integer key : keyList) {
            Node node = maps.get(key);
            Integer tmp = 0;
            if( node.parent != null && par.containsKey(node.parent)) {
                tmp = par.get(node.parent);
            }
            par.put(node, tmp + node.data);

            System.out.print((node.data + tmp) + " ");
        }

    }

    private int getAll(Node a) {
        if (a == null) return 0;
        return a.data + getAll(a.parent);
    }

    private void plus(Node node, int val) {
        node.data += val;
    }

    public class Node {
        public Node parent;
        public int data;

        Node() {
            this.data = 0;
        }
        public void setParent(Node c) {
            this.parent = c;
        }

    }
}