import java.util.*;

class Main {


    public static int longestPathInADAG(int N, Map<Integer, List<Integer> > graph, int[] indegree) {

        Queue<Integer> q = new LinkedList<>();
        int[] topoOrder = new int[N];
        int topIdx = 0;
        for(int i=1; i<=N; i++) {
            if(indegree[i] == 0)
                q.add(i);
        }

        while(!q.isEmpty()) {
            Integer node = q.poll();
            topoOrder[topIdx++] = node;

            for(Integer nei: graph.getOrDefault(node, new ArrayList<>())) {
                if(--indegree[nei] == 0) {
                    q.add(nei);
                }
            }
        }

        int[] longestPath = new int[N + 1];

        for(int i=0; i<N; i++) {
            int currNode = topoOrder[i];

            for(Integer nei: graph.getOrDefault(currNode, new ArrayList<>())) {
                longestPath[nei] = Math.max(longestPath[nei], longestPath[currNode] + 1);
            }
        }

        int answer = Integer.MIN_VALUE;

        for(int i=1; i<=N; i++) {
            answer = Math.max(answer, longestPath[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, List<Integer> > graph = new HashMap<>();

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] indegree = new int[N + 1];

        for(int i=0; i<M; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            List<Integer> edges = graph.getOrDefault(from, new ArrayList<>());
            edges.add(to);
            indegree[to]++;
            graph.put(from, edges);
        }

        System.out.println(longestPathInADAG(N, graph, indegree));
    }
}
