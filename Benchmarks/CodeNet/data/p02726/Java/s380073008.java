import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 1; i <= n; i++) {
        	graph.put(i, new ArrayList<>());
        }
        for(int i = 1; i < n; i++) {
        	graph.get(i).add(i + 1);
        	graph.get(i + 1).add(i);
        }
        graph.get(x).add(y);

        Map<Integer, Integer> cntMap = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        for(int i = 1; i < n; i++) {
	        queue.clear();
	        queue.offer(i);
	        visited.clear();
	        visited.add(i);
	        int dist = 0;
	        while(!queue.isEmpty()) {
	        	int size = queue.size();
	        	for(int j = 0; j < size; j++) {
	        		int node = queue.poll();
	        		if(node > i)
	        		    cntMap.put(dist, cntMap.getOrDefault(dist, 0) + 1);
	        		if(!graph.containsKey(node)) continue;
	        		for(int adj : graph.get(node)) {
	        			if(visited.contains(adj)) continue;
	        			queue.offer(adj);
	        			visited.add(adj);
	        		}
	        	}
	        	dist++;
	        }
        }
        for(int i = 1; i < n; i++)
        	System.out.println(cntMap.getOrDefault(i, 0));
    }
}
