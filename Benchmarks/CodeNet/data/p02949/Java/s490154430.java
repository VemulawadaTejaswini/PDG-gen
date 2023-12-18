import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N, M, P;
	int[][] edges;
	final static int START = 0, END = 1, SCORE = 2, TOTAL = 3, PREV = 4;
	
	Set<Integer> q, next;
	Map<Integer, List<Integer>> sp;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		M = sc.nextInt();
		P = sc.nextInt();
		edges = new int[M+1][5];
		for (int i = 1; i <= M; i++) {
			for (int j = 0; j < 3; j++) edges[i][j] = sc.nextInt();
			edges[i][SCORE] -= P;
			edges[i][TOTAL] = -Integer.MAX_VALUE;
			edges[i][PREV] = -1;
		}
		Map<Integer, List<Integer>> ep = new HashMap<>();
		for (int i = 1; i <= M; i++) {
			List<Integer> l = ep.getOrDefault(edges[i][END], new ArrayList<>());
			l.add(i);
			ep.put(edges[i][END], l);
		}
		Set<Integer> existingNodes = new HashSet<>();
		Set<Integer> existingEdges = new HashSet<>();
		Set<Integer> newNodes = new HashSet<>();
		Set<Integer> nextNodes = new HashSet<>();
		newNodes.add(N);

		while (newNodes.size() > 0) {
			nextNodes.clear();
			for (int end : newNodes) {
				List<Integer> l = ep.get(end);
				if (l == null) l = Collections.emptyList();
				for (int e : l)
					if (!existingEdges.contains(e)) {
						nextNodes.add(edges[e][START]);
						existingEdges.add(e);
					}
				existingNodes.addAll(nextNodes);
			}
			Set<Integer> tmp = nextNodes; nextNodes = newNodes; newNodes = tmp;
		}
		sp = new HashMap<>();
		for (int i : existingEdges) {
			List<Integer> l = sp.getOrDefault(edges[i][START], new ArrayList<>());
			l.add(i);
			sp.put(edges[i][START], l);
		}
		edges[0] = new int[] {0,1,0,0,0};
		q = new HashSet<>(existingEdges.size()+1);
		next = new HashSet<>(existingEdges.size()+1);
		q.add(0);
		sp.put(0, (List<Integer>)Arrays.asList(0));
		for (int i = 0; i < existingEdges.size()+1; i++) {
			update();
			Set<Integer> tmp = next; next = q; q = tmp;
		}
		int max = Integer.MIN_VALUE;
		for (int i : existingEdges) {
			if (edges[i][END] != N) continue;
			if (edges[i][TOTAL] > max) max = edges[i][TOTAL];
		}
		if (max < 0) max = 0;
		if (next.size() > 0) max = -1;
		
		System.out.println(max);
		System.out.flush();
	}
	private void update() {
		next.clear();
		for (int e : q) {
			int p = edges[e][TOTAL];
			List<Integer> list = sp.get(edges[e][END]);
			if (list == null) list = Collections.emptyList();
			for (int follow : list) {
				int v = edges[follow][SCORE]+ p;
				if (v > edges[follow][TOTAL]) {
					edges[follow][TOTAL] = v;
					edges[follow][PREV] = e;
					next.add(follow);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}

}