import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SplatterPainting sp = new SplatterPainting();
		sp.run();
	}

}

class SplatterPainting {
	
	class Vertex {
		
		int id;
		ArrayList<Vertex> neighbours;
		int color;
		
		public Vertex(int id) {
			neighbours = new ArrayList<>();
			color = 0;
			this.id = id;
		}
	}
	
	boolean[] isPainted; 
	Vertex[] vertices;
	
	public SplatterPainting() {
		
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		vertices = new Vertex[N + 1];
		int M = sc.nextInt();
		for(int i = 1; i < N + 1; i++)
			vertices[i] = new Vertex(i); 
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			vertices[a].neighbours.add(vertices[b]);
			vertices[b].neighbours.add(vertices[a]);
		}
		int Q = sc.nextInt();
		for(int i = 0; i < Q; i++) {
			int v = sc.nextInt();
			int d = sc.nextInt();
			int c = sc.nextInt();
			isPainted = new boolean[N + 1];
			paint(vertices[v], d, c);
		}
		sc.close();
		for(int i = 1; i < N + 1; i++)
			System.out.println(vertices[i].color);
	}
	
	public void paint(Vertex from, int distance, int color) {
		from.color = color;
		isPainted[from.id] = true;
		if(distance == 0)
			return;
		for(int i = 0; i < from.neighbours.size(); i++) {
			if(!isPainted[from.neighbours.get(i).id]) {
				paint(from.neighbours.get(i), distance - 1, color);
			}
		}
	}
}
