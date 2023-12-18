import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int Q = scan.nextInt();
        Map<Integer, Node> map = new HashMap<>();
        Node root = new Node(1);
        map.put(1, root);
        for (int i = 1; i < N; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (!map.containsKey(a)) {
                Node a_n = new Node(a);
                map.put(a,a_n);
            }
            if (!map.containsKey(b)) {
                Node b_n = new Node(b);
                map.put(b,b_n);
            }
            Node a_n = map.get(a);
            Node b_n = map.get(b);
            a_n.add(b_n);
            b_n.parent(a_n);
        }
        for (int i = 0; i < Q; i++) {
            int p = scan.nextInt();
            long x = scan.nextLong();
            Node n = map.get(p);
            n.increment += x;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            Node x = map.get(i);
            sb.append(x.score());
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
    class Node {
        int x;
        long increment;
        long score;
        Node parent;
        List<Node> neibors;
        Node(int x) {
            this.x = x;
            this.parent = null;
            this.increment = 0;
            this.score = -1;
            this.neibors = new ArrayList<>();
        }
        void add(Node child) {
            neibors.add(child);
        }
        void parent(Node parent) {
            if (this.parent == null) {
                this.parent = parent;
            }
            if (this.parent.x != parent.x) {
                throw new Error();
            }
        }
        long score() {
            if (this.score != -1) {
                return this.score;
            }
            Node parent = this.parent;
            if (parent == null) {
                this.score = this.increment;
                return this.score;
            }
            this.score = this.increment + this.parent.score();
            return this.score;
        }
    }
}
