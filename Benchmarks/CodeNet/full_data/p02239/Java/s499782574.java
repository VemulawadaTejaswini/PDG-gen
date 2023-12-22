import java.util.*;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private LinkedList<Boolean> visited;
	private ArrayList<Integer>dist;
	public Graph() {
		totalVertex = 0;
		visited = new LinkedList<Boolean>();
		dist = new ArrayList<Integer>();
	}
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			in.nextInt();
			int degree = in.nextInt();
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	public int nextUnvisited() {
        for(int i = 0; i < visited.size(); i ++) {
            if(visited.get(i) == false) {
            	return i;
            }
        }
        return -1;
    }
	public void preWalk() {
        visited.clear();
        dist.clear();
        for(int i = 0; i < totalVertex; i ++) {
        	visited.add(false);
        	dist.add(0);
        }
    }
	public void walk() {
        preWalk();
        BFS(0);
    }
	public boolean ifVisited(int v) {
		if (v >= 0 && v < totalVertex)
			return visited.get(v);
		else
			return true;
	}
	public void setVisited(int v) { visited.set(v, true); }
	
	public void BFS(int v) {
		int distance = 0;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		setVisited(v);
		queue.add(v);
		dist.set(v, distance);
		while (queue.size() != 0) {
			v = queue.poll();
			Iterator<Integer> i = adjList.get(v).listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited.get(n)) {
					visited.set(n, true);
					dist.set(n, dist.get(v) + 1);
					queue.add(n);
				}
			}
		}
	}
	
	public void displayEnum() {
		for (int i = 0; i < totalVertex; i++) {
			if (visited.get(i) == false) {
				System.out.print((i + 1) + " " + -1 + "\n");
			} else {
				System.out.print((i + 1) + " " + dist.get(i) + "\n");
			}
		}
    }
}

public class Main {
	public static void main(String[] args) {
		Graph g = new Graph();
		g.loadAdjList();
		g.walk();
		g.displayEnum();
	}
}
