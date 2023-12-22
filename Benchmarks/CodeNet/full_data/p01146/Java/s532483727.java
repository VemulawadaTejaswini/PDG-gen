import java.util.ArrayList;
import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		final int INF = 1000000;
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			int l = in.nextInt();
			int k = in.nextInt();
			int a = in.nextInt();
			int h = in.nextInt();
			if(m==0) break;
			BitSet hos = new BitSet(n);
			for(int i=0; i<l; i++){
				hos.set(in.nextInt());
			}
			int[][] road = new int[n][n];
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(i==j) continue;
					road[i][j] = INF;
				}
			}
			for(int i=0; i<k; i++){
				int x = in.nextInt();
				int y = in.nextInt();
				int t = in.nextInt();
				road[x][y] = road[y][x] = t;
			}
			for(int p=0; p<n; p++){
				for(int i=0; i<n; i++){
					for(int j=0; j<n; j++){
						if(road[i][j]>road[i][p]+road[p][j])
							road[i][j] = road[i][p] + road[p][j];
					}
				}
			}
			ArrayList<Node> node = new ArrayList<Node>();
			node.add(new Node(h));
			node.add(new Node(a));
			for(int i=hos.nextSetBit(0); i!=-1; i=hos.nextSetBit(i+1)){
				node.add(new Node(i));
			}
			for(int i=0; i<l+1; i++){
				Node v1 = node.get(i);
				for(int j=i+1; j<l+2; j++){
					Node v2 = node.get(j);
					if(road[v1.id][v2.id] > m) continue;
					v1.createEdge(v2);
					v2.createEdge(v1);
				}
			}
			Queue<Pos> pos = new PriorityQueue<Pos>();
			int time = INF;
			BitSet used = new BitSet(n);
			pos.add(new Pos(node.get(0), 0));
			while(!pos.isEmpty()){
				Pos p = pos.poll();
				if(used.get(p.id)) continue;
				if(p.id == a){
					time = p.time;
					break;
				}
				used.set(p.id);
				for(Node v: p.v.edge){
					pos.add(new Pos(v, p.time + road[p.id][v.id]));
				}
			}
			if(time<INF && time > m){
				time += (time-m);
			}
			System.out.println(time==INF?"Help!":time);
		}
	}
}

class Node{
	int id;
	ArrayList<Node> edge = new ArrayList<Node>();
	public Node(int id){
		this.id = id;
	}
	
	public void createEdge(Node nd){
		edge.add(nd);
	}
}

class Pos implements Comparable<Pos>{
	Node v;
	int id;
	int time;
	public Pos(Node v, int time){
		this.v = v;
		this.time = time;
		id = v.id;
	}
	
	@Override
	public int compareTo(Pos o) {
		return time-o.time;
	}
}