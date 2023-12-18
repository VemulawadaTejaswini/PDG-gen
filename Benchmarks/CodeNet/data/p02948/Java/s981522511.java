import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] list = new ArrayList[m+1];

        for (int i=0; i<m+1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a<=m) {
                list[a].add(b);
            }
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();

        long ans = 0;

        for (int i=1; i<=m; i++) {
            List<Integer> tmpL = list[i];
            for (int t: tmpL) {
                Node node = new Node(t);
                pq.add(node);
            }
            if (!pq.isEmpty()) {
                ans += pq.poll().money;
            }

        }

        System.out.println(ans);

    }

    class Node implements Comparable<Node> {
        int money;
        public Node(int m) {
            this.money = m;
        }

        public int compareTo(Node nd) {
            if (this.money<nd.money) return 1;
            if (nd.money<this.money) return -1;
            return 0;
        }
    }

}
