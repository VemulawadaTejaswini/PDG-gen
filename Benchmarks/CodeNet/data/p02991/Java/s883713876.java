import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Node[] nodes = new Node[n+1];
        for(int i = 1; i <= n; i++) {
            nodes[i] = new Node(i);
        }
        for(int i = 0; i < m; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            nodes[src].nexts.add(dest);
        }
        int s = sc.nextInt();
        int t = sc.nextInt();
        Node start = nodes[s];
        start.minCount = 0;
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.addLast(start);
        while(!queue.isEmpty()) {
            Node curr = queue.removeFirst();
            if(curr.num == t) {
                System.out.println(curr.minCount);
                return;
            }
            int prev = curr.minCount;
            for(int next1: curr.nexts) {
                if(nodes[next1].steps.contains(1)) continue;
                nodes[next1].steps.add(1);
                for(int next2: nodes[next1].nexts) {
                    if(nodes[next2].steps.contains(2)) continue;
                    nodes[next2].steps.add(2);
                    for(int next3: nodes[next2].nexts) {
                        if(nodes[next3].steps.contains(3)) continue;
                        nodes[next3].steps.add(3);
                        if(nodes[next3].minCount != -1) continue;
                        nodes[next3].minCount = prev + 1;
                        queue.addLast(nodes[next3]);
                    }
                }
            }
        }
        System.out.println(-1);
    }
    static class Node{
        int num;
        int minCount;
        ArrayList<Integer> nexts;
        HashSet<Integer> steps;
        Node(int num) {
            this.num = num;
            minCount = -1;
            nexts = new ArrayList<>();
            steps = new HashSet<>();
        }
    }
}
