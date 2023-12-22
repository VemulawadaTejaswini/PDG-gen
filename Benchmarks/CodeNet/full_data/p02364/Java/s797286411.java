import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main{

	static int[] unionFind;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] first = s.nextLine().split(" ");
		int V = Integer.parseInt(first[0]);
		int E = Integer.parseInt(first[1]);
		unionFind = new int[V];
		for(int i=0 ; i<unionFind.length ; i++)
			unionFind[i] = i;
		ArrayList<Edge> edgeList = new ArrayList<Edge>();
		for(int i=0 ; i<E ; i++) {
			String[] line = s.nextLine().split(" ");
			Edge edge = new Edge(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			edgeList.add(edge);
		}
		Collections.sort(edgeList, new Comparator<Edge>() {
			public int compare(Edge e1, Edge e2) {
				return e1.weight - e2.weight;
			}
		});
		int result = 0;
		for(Edge e : edgeList) {
			if(getParent(e.start) == getParent(e.end))
				continue;
			unionFind[getParent(e.start)] = getParent(e.end);
			result += e.weight;
		}
		System.out.println(result);
	}

	public static int getParent(int index) {
		if(unionFind[index] == index)
			return index;
		return getParent(unionFind[index]);
	}

	public static class Edge{
		int start;
		int end;
		int weight;

		Edge(int start, int end, int weight) {
			this.start = start;
			this.end = end;
			this.weight = weight;
		}
	}

}