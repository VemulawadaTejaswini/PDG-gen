

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);

		if(m % 2 == 1){
			System.out.println(-1);
			return;
		}

		Vertex verts[] = new Vertex[n];
		for(int i = 0; i < n; i++){
			verts[i] = new Vertex();
		}
		Edge edges[] = new Edge[m];

		for(int i = 0; i < m; i++){
			tmpArray = br.readLine().split(" ");

			int from = Integer.parseInt(tmpArray[0]) - 1;
			int to = Integer.parseInt(tmpArray[1]) - 1;
			edges[i] = new Edge(from, to);
//			verts[from].edges++;
//			verts[to].edges++;
			verts[from].edges.addElement(edges[i]);
			verts[to].edges.addElement(edges[i]);
		}

		for(int i = 0; i < n; i++){
//			System.out.println("current V "+(i + 1));
			boolean reverseFlag = false;
			if((verts[i].unusedEdges() + verts[i].from) % 2 == 1){
				reverseFlag = true;
			}

			for(int j = 0; j < verts[i].edges.size() ; j++){
				Edge tmpEdge = verts[i].edges.get(j);
				if(!tmpEdge.used){
					if(reverseFlag){
						tmpEdge.printEdge(tmpEdge.to);
						verts[tmpEdge.to].from++;
						reverseFlag = false;
					}
					else {
						tmpEdge.printEdge(i);
					}
				}

				tmpEdge.used = true;
			}
		}
	}

}

class Edge {
	int from;
	int to;
	boolean used = false;
//	boolean reverse = false;

	Edge(int from, int to){
		this.from = Math.min(from, to);
		this.to= Math.max(from, to);
	}

	void printEdge(int from){
		if(from != this.from){
			System.out.println((this.to+1)+" "+(this.from+1));
		}
		else {
			System.out.println((this.from+1)+" "+(this.to+1));
		}
	}
}
class Vertex{
//	int edges;
	int from;

	Vector<Edge> edges = new Vector<Edge>();

	int unusedEdges(){
		int count = 0;

		for(int i = 0; i < edges.size(); i++){
			if(!edges.get(i).used){
				count++;
			}
		}

		return count;
	}
}