
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] es = new long[n][n];
        for (int i = 0; i < es.length; i++)
            Arrays.fill(es[i], Long.MIN_VALUE);
        for (int i =0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int c = sc.nextInt();
            es[a][b] = c;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0l, new ArrayList<>()));
        long[] log = new long[n];
        Arrays.fill(log, Long.MIN_VALUE);
        log[0] = 0;
        boolean infFlag = false;
        long tmp;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            node.path.add(0, node.current);
            for (int i = 0; i < n; i++) {
                tmp = es[node.current][i];
                if (tmp != Long.MIN_VALUE) {
                    if (log[i] <= node.score + tmp) {
                        if (log[i] != node.score + tmp &&
                                node.path.contains(i)) {
                            infFlag = true;
                            break;
                        }
                        log[i] = node.score + tmp;
                        queue.add(new Node(i, node.score + tmp, node.path));
                    }
                }
            }
            if (infFlag)
                break;
        }
        if (infFlag)
            System.out.println("inf");
        else
            System.out.println(log[n-1]);
    }

    static class Node {
        int current;
        long score;
        ArrayList<Integer> path = new ArrayList<>();
        Node(int c, long s, ArrayList<Integer> p) {
            current = c;
            score = s;
            path.addAll(p);
        }

    }
}
