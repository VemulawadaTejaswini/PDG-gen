import java.util.*;

public class Main {
    static Scanner sc;
    static List<Node> nodes = new ArrayList<>();

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            nodes.add(new Node(i));
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt()-1;
            int v= sc.nextInt()-1;
            int w = sc.nextInt();
            nodes.get(u).next.put(nodes.get(v), w);
            nodes.get(v).next.put(nodes.get(u), w);
        }
        boolean[] done = new boolean[n];
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(nodes.get(0));
        while(!deque.isEmpty()) {
            Node a = deque.poll();
            done[a.num] = true;
            ans[a.num] = a.c;
            for(Node next : a.next.keySet()) {
                if(done[next.num]) {
                    continue;
                }
                next.c = (a.c + a.next.get(next)) % 2;
                deque.add(next);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }


    static class Node {
        int num;
        Map<Node, Integer> next;
        int c = 0;

        public Node(int num) {
            this.num = num;
            next = new HashMap<>();
        }
    }
}

