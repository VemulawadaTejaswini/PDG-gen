import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	class Vertex {
		int id;
		int color = -1;
		List<Integer> vertices = new ArrayList<>();
		public Vertex(int id) {
			this.id = id;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Vertex[] vertices = new Vertex[n];
		for (int i = 0; i < n; i++) {
			vertices[i] = new Vertex(i);
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			int id1 = Integer.parseInt(st.nextToken());
			int id2 = Integer.parseInt(st.nextToken());
			vertices[id1].vertices.add(id2);
			vertices[id2].vertices.add(id1);
		}
		
		assignColor(vertices);
		
		int q = Integer.parseInt(reader.readLine());
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(reader.readLine());
			int id1 = Integer.parseInt(st.nextToken());
			int id2 = Integer.parseInt(st.nextToken());
			int c1 = vertices[id1].color;
			int c2 = vertices[id2].color;
			if (c1 == c2 && c1 != -1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		reader.close();
	}

	private void assignColor(Vertex[] vertices) {
		int color = 0;
		for (Vertex vertex : vertices) {
			if (vertex.color == -1) {
				assignColor(vertex, vertices, color);
				color++;
			}
		}
	}

	private void assignColor(Vertex vertex, Vertex[] vertices, int color) {
		Stack<Integer> stack = new Stack<>();
		stack.push(vertex.id);
		while(!stack.empty()) {
			int id = stack.pop();
			if (vertices[id].color != -1) {
				continue;
			}
			vertices[id].color = color;
			for (int nId : vertices[id].vertices) {
				if (vertices[nId].color == -1) {
					stack.push(nId);
				}
			}
		}
	}
}
