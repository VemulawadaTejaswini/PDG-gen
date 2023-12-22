import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int[] d;
	private int[] f;
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}
			adjList.add(tmp);
		}
		in.close();
	}
	
	public int DFS(int v, int t) {
		d[v] = t;
		LinkedList<Integer> nb = adjList.get(v);
		Iterator<Integer> it = nb.iterator();
		while(it.hasNext()) {
			int w = it.next();
			if(d[w] == -1) {
				t ++; 
				t = DFS(w, t);
			}
		}
		f[v] = t + 1;
		return t + 1;
	}
	
	
	
	public void timeStamp() {
		String out = "";
		d = new int[totalVertex];
		f = new int[totalVertex];
		for (int v = 0; v < totalVertex; v++) {
			d[v] = -1;
		}
		int t = 0;
		for(int v = 0; v < totalVertex; v++) {
			if (d[v] == -1) {
				t = DFS(v,t);
				t++;
			}
		}
		for(int v = 0; v < totalVertex; v++) {
			out += (v + 1) + " " + (d[v] + 1) + " " +( f[v] + 1);
			if (totalVertex-1 != v) {
				out += '\n';
			}
		}
		System.out.println(out);
	}
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.timeStamp();
	}
}
