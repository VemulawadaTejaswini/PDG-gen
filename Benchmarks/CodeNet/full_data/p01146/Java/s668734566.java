import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			int l = in.nextInt();
			int k = in.nextInt();
			int a = in.nextInt();
			int h = in.nextInt();
			if(m==0) break;
			Node[] node = new Node[n];
			for(int i=0; i<n; i++) node[i] = new Node(i);
			node[a].isHos = true;
			node[h].isHos = true;
			for(int i=0; i<l; i++){
				node[in.nextInt()].isHos = true;
			}
			int[][] road = new int[n][n];
			for(int i=0; i<k; i++){
				int x = in.nextInt();
				int y = in.nextInt();
				int t = in.nextInt();
				node[x].createEdge(node[y]);
				node[y].createEdge(node[x]);
				road[x][y] = road[y][x] = t;
			}
			Queue<Pos> qu = new PriorityQueue<Pos>();
			boolean[][] used = new boolean[n][m+1];
			qu.add(new Pos(m, h, 0));
			int time = -1;
			while(!qu.isEmpty()){
				Pos p = qu.poll();
				if(used[p.city][p.bs]) continue;
				if(p.city == a){
					time = p.time;
					break;
				}
				used[p.city][p.bs] = true;
				int cold = node[p.city].isHos ? m-p.bs : 0;
				for(int i=0; i<=cold; i++){
					// cold : ????????????
					int sBS = p.bs + i;
					int sT = p.time+ i;
					for(Node v: node[p.city].edge){
						if(sBS-road[p.city][v.id] < 0) continue;
						qu.add(new Pos(sBS-road[p.city][v.id]
								, v.id
								, sT+road[p.city][v.id]));
					}
				}
			}
			System.out.println(time<0 ? "Help!": time);
		}
	}
}

class Node{
	int id;
	boolean isHos;
	ArrayList<Node> edge = new ArrayList<Node>();
	public Node(int id){
		this.id = id;
	}
	
	public void createEdge(Node nd){
		edge.add(nd);
	}
}

class Pos implements Comparable<Pos>{
	int bs;
	int city;
	int time;
	public Pos(int bs, int city, int time){
		this.bs = bs;
		this.city = city;
		this.time = time;
	}
	
	@Override
	public int compareTo(Pos o) {
		return time-o.time;
	}
}