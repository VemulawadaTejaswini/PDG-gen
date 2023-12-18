import java.util.*;

public class Main {
    static int n;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> nodes = new ArrayList<Integer>();
        while(sc.hasNext()) {
            nodes.add(sc.nextInt() - 1);
        }

        n = nodes.size();
        LinkedList<Integer>[] graph = new LinkedList[n];
        for (int i = 0; i < n ; i+=2) {
            graph[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < n ; i+=2) {
            int node1 = nodes.get(i);
            int node2 = nodes.get(i + 1);
            graph[node1].add(node2);
            graph[node2].add(node1);
        }
        Set<Integer> visited = new HashSet<Integer>();
        visited.add(1);
        helper(graph, 0, visited);
        System.out.println(count);

    }

    private static void helper(LinkedList<Integer>[] graph, int current, Set<Integer> visited) {
        if (visited.size() == n) {
            count++;
            return;
        }

        List<Integer> nexts = graph[current];
        for (int i =0; i < nexts.size(); i++) {
            int next = nexts.get(i);
            if(!visited.contains(next)) {
                visited.add(next);
                helper(graph, next, visited);
                visited.remove(next);
            }
        }
        return;
    }
}
