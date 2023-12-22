import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<HashMap<Integer, Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new HashMap<>());
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    graph.get(a).put(b, c);
		}
		PriorityQueue<Path> queue = new PriorityQueue<>();
		int[][] costs = new int[n][n];
		for (int[] arr : costs) {
		    Arrays.fill(arr, Integer.MAX_VALUE);
		}
		for (int i = 0; i < n; i++) {
    		queue.add(new Path(i, 0));
 		    int[] counts = new int[n];
   		    while (queue.size() > 0) {
    		    Path p = queue.poll();
    		    if (costs[i][p.idx] <= p.value) {
    		        continue;
    		    }
    		    counts[p.idx]++;
    		    if (counts[p.idx] > n + 1) {
    		        System.out.println("NEGATIVE CYCLE");
    		        return;
    		    }
    		    costs[i][p.idx] = p.value;
    		    for (Map.Entry<Integer, Integer> entry : graph.get(p.idx).entrySet()) {
    		        queue.add(new Path(entry.getKey(), p.value + entry.getValue()));
    		    }
    		}
		}
		StringBuilder sb = new StringBuilder();
		for (int[] arr : costs) {
		    for (int i = 0; i < arr.length; i++) {
		        if (i > 0) {
		            sb.append(" ");
		        }
		        if (arr[i] == Integer.MAX_VALUE) {
		            sb.append("INF");
		        } else {
		            sb.append(arr[i]);
		        }
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
	
	static class Path implements Comparable<Path> {
	    int idx;
	    int value;
	    
	    public Path(int idx, int value) {
	        this.idx = idx;
	        this.value = value;
	    }
	    
	    public int compareTo(Path another) {
	        return value - another.value;
	    }
	}
}

