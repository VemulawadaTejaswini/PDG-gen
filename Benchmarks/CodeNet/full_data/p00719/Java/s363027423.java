import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Solve{
	final Scanner in = new Scanner(System.in);
	
	int n, m, p, a, b;
	boolean solve(){
		n = in.nextInt();
		m = in.nextInt();
		p = in.nextInt();
		a = in.nextInt()-1;
		b = in.nextInt()-1;
		if(n == 0) return false;
		int[] h = new int[n];
		for(int i=0; i<n; i++) h[i] = in.nextInt();
		Node[] node = new Node[m];
		int[][] dist = new int[m][m];
		for(int i=0; i<m; i++){
			node[i] = new Node(i);
		}
//		
//		for(int i=0; i<p; i++){
//			for(int j=0; j<p; j++){
//				
//			}
//		}
		for(int i=0; i<p; i++){
			int x = in.nextInt()-1;
			int y = in.nextInt()-1;
			int z = in.nextInt();
			node[x].createEdge(node[y]);
			node[y].createEdge(node[x]);
			dist[y][x] = dist[x][y] = z;
		}
		Queue<Pos> qu = new PriorityQueue<Pos>();
		BitSet used = new BitSet();
		qu.add(new Pos(a, (1<<n)-1, 0));
		double res = -1;
		while(!qu.isEmpty()){
			Pos p = qu.poll();
			if(used.get(p.id)) continue;
			if(p.p == b){
				res = p.time;
				break;
			}
			used.set(p.id);
			for(Node v: node[p.p].edge){
				for(int i=0; i<n; i++){
					if((p.tic&1<<i)==0) continue;
					qu.add(new Pos(v.id, p.tic&~(1<<i)
							, p.time+(double)dist[p.p][v.id]/h[i]));
				}
			}
		}
		System.out.println(res < 0 ? "Impossible" : res);
		return true;
	}
}

class Pos implements Comparable<Pos>{
	int p;
	int tic;
	int id;
	double time;
	Pos(int p, int tic, double time){
		this.p = p;
		this.tic = tic;
		id = p|(tic<<5);
		this.time = time;
	}
	
	@Override
	public int compareTo(Pos o) {
		return Double.compare(time, o.time);
	}
}

class Node{
	int id;
	ArrayList<Node> edge = new ArrayList<Node>();
	Node(int id){
		this.id = id;
	}
	
	void createEdge(Node nd){
		edge.add(nd);
	}
}

public class Main{
	public static void main(String[] args) throws IOException{
		Solve solve = new Solve();
		while(solve.solve());
	}
}