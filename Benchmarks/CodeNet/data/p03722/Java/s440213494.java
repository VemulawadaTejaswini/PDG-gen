
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
            for (int i = 0; i < n; i++) {
                tmp = es[node.current][i];
                if (tmp != Long.MIN_VALUE) {
                    if (node.path.contains(i) &&
                            checkInf(node.path, i, es)) {
                        infFlag = true;
                        break;
                    }
                    if (log[i] < node.score + tmp) {
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
            path.add(0, c);
        }

    }

    static boolean checkInf(ArrayList<Integer> path, int start, long[][] es) {
        int sum = 0;
        path.add(0, start);
        for (int i = 0; i < path.size()-1; i++) {
            int trg = path.get(i+1);
            long tmp = es[trg][path.get(i)];
            if (tmp != Long.MIN_VALUE) {
                sum += tmp;
            }
            if (trg == start)
                break;
        }
        path.remove(0);
        return sum > 0;
    }
}
