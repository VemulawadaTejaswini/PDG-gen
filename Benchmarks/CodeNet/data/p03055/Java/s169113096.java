import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int n;
    static List<Node> nodes;
    static int[] l;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nodes = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            nodes.add(new Node(i));
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodes.get(a).next.add(nodes.get(b));
            nodes.get(b).next.add(nodes.get(a));
        }
        Deque<Integer> q = new ArrayDeque<>();
        q.add(1);
        l = new int[n + 1];
        l[1] = 1;
        while (q.size() > 0) {
            int next = q.poll();
            for (Node node : nodes.get(next).next) {
                if (l[node.num] != 0) continue;
                l[node.num] = l[next] + 1;
                q.add(node.num);
            }
        }
        int leaf = 0;
        int max = 0;
        for (int i = 0; i < n+1; i++) {
            if(max < l[i]) {
                max = l[i];
                leaf = i;
            }
        }
        l = new int[n + 1];
        l[leaf] = 1;
        q.add(leaf);
        while (q.size() > 0) {
            int next = q.poll();
            for (Node node : nodes.get(next).next) {
                if (l[node.num] != 0) continue;
                l[node.num] = l[next] + 1;
                q.add(node.num);
            }
        }
        int size = 0;
        for (int i = 0; i < n+1; i++) {
            size = Math.max(size, l[i]);
        }
        if ((size + 1) % 3 == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }

    static class Node {
        public int num;
        public List<Node> next;

        public Node(int num) {
            this.num = num;
            next = new ArrayList<>();
        }
    }
}
