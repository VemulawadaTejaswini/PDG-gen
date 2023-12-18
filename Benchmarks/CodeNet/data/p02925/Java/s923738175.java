import java.util.*;

public class Main {
	static HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> starts = new HashSet<>();
		for (int i = 1; i <= n; i++) {
		    int prev = getCode(i, sc.nextInt(), n);
		    starts.add(prev);
		    for (int j = 1; j < n - 1; j++) {
		        int next = getCode(i, sc.nextInt(), n);
		        if (!graph.containsKey(prev)) {
		            graph.put(prev, new ArrayList<Integer>());
		        }
		        graph.get(prev).add(next);
		        prev = next;
		    }
		}
		int max = 0;
		HashMap<Integer, Integer> visitedMap = new HashMap<>();
		for (int x : starts) {
		    int y = search(visitedMap, x, 1, new HashSet<Integer>());
		    if (y == Integer.MAX_VALUE) {
		        System.out.println(-1);
		        return;
		    }
		    max = Math.max(max, y);
		}
		System.out.println(max);
	}
	
	static int search(HashMap<Integer, Integer> visited, int code, int day, HashSet<Integer> circuit) {

	    if (visited.containsKey(code)) {
	        int d = visited.get(code);
	        if (d > day) {
	            return day;
	        }
	    }
	    visited.put(code, day);
	    if (!graph.containsKey(code)) {
	        return day;
	    }
	    int max = 0;
	    for (int x : graph.get(code)) {
    	    if (circuit.contains(x)) {
    	        return Integer.MAX_VALUE;
    	    }
    	    circuit.add(x);
	        max = Math.max(search(visited, x, day + 1, circuit), max);
	        circuit.remove(x);
	    }
	    return max;
	}
	
	static int getCode(int x, int y, int base) {
	    return Math.min(x, y) * (base + 1) + Math.max(x, y);
	}
}
