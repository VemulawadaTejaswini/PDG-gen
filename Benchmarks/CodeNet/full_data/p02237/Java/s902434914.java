import java.util.Scanner;

class Node {
	public int[] adjacentNodes;
	public int id;
	
	public Node(int id, int[] adjNodes) {
		this.id = id;
		this.adjacentNodes = adjNodes;
	}
	
	public boolean hasEdge(int edge) {
		for (int i = 0; i < adjacentNodes.length; i++) {
			if (edge == adjacentNodes[i]) return true;
		}
		
		return false;
	}
}

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numNodes = scanner.nextInt();
		Node[] nodes = new Node[numNodes];
		
		for (int i = 0; i < nodes.length; i++) {
			int id = scanner.nextInt();
			int numVerts = scanner.nextInt();
			int[] verts = new int[numVerts];
			
			for (int j = 0; j < numVerts; j++) {
				verts[j] = scanner.nextInt();
			}
			
			nodes[i] = new Node(id, verts);
		}
		scanner.close();
		
		for (int i = 0; i < nodes.length; i++) {
			String adjacencies = "";
			for (int j = 0; j < nodes.length; j++) {
				if (nodes[i].hasEdge(nodes[j].id)) {
					adjacencies += "1";
				}
				else {
					adjacencies += "0";
				}
				if (j+1 < nodes.length) adjacencies += " "; 
			}
			System.out.println(adjacencies);
		}
	}
}

