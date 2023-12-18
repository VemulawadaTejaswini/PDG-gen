import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Node> al[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            al[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            al[u].add(new Node(v, w));
            al[v].add(new Node(u, w));
        }
        int dis[] = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        boolean[] visited = new boolean[n];
        visited[0] = true;
        dis[0] = 0;
        while (!stack.isEmpty()) {
            int pos = stack.pollFirst();
            for (Node node : al[pos]) {
                if (!visited[node.next]) {
                    dis[node.next] = dis[pos] + node.cost;
                    stack.push(node.next);
                    visited[node.next] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (dis[i] % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
        sc.close();
    }
}

class Node {
    int next;
    int cost;

    Node(int n, int c) {
        this.cost = c;
        this.next = n;
    }
}
