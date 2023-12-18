
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] tmpArray;
		Node nodes[] = new Node[n];
		for(int i = 0; i < n; i++) {
			nodes[i] = new Node();
		}
		
		Edge[] edges = new Edge[n - 1];
		for(int i = 0; i < n - 1; i++) {
			tmpArray = br.readLine().split(" ");
			int start = Integer.parseInt(tmpArray[0]) - 1;
			int end = Integer.parseInt(tmpArray[1]) - 1;
			
			edges[i] = new Edge(start, end);
			
			nodes[start].edges.add(edges[i]);
			nodes[end].edges.add(edges[i]);
		}
		
		Arrays.sort(nodes);
		
		int maxColors = nodes[0].edges.size();
		for(int i = 0; i < n; i++) {
//			System.out.println("i = "+i+" edges "+nodes[i].edges.size());
			HashSet<Integer> appears = new HashSet<Integer>();
			
			for(int j = 0; j < nodes[i].edges.size(); j++) {
				Edge target = nodes[i].edges.get(j);
				
//				System.out.println("color "+target.color+" is used");
				appears.add(target.color);
			}

			
			int currentColor = 1;
			for(int j = 0; j < nodes[i].edges.size(); j++) {
				Edge target = nodes[i].edges.get(j);
				
				if(target.color == -1) {
					while(appears.contains(currentColor)) {
//						System.out.println("color "+currentColor+" failed");
						currentColor++;
					}
					target.color = currentColor++;
				}
			}
		}
		
		System.out.println(maxColors);
		
		for(int i = 0; i < n - 1; i++) {
			System.out.println(edges[i].color);
		}
	}

}

class Node implements Comparable<Node>{
	Vector<Edge> edges = new Vector<Edge>();

	@Override
	public int compareTo(Node node) {
		// TODO Auto-generated method stub
		return node.edges.size() - this.edges.size();
	}

	
}
class Edge {
	int start;
	int end;
	int color;
	
	Edge(int start, int end){
		this.start = start;
		this.end = end;
		this.color = -1;
	}
}