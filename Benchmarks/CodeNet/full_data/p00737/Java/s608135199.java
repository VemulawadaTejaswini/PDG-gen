import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static int[][] map;
	public static Node[] node;
	public static int w;
	public static int h;
	public static int[] c;
	public static HashMap<Integer, Integer> cost;
	public static final int[] dx = {1, 0, -1, 0};
	public static final int[] dy = {0, 1, 0, -1};
	public static final int mask = (1<<12)-1;
	public static final int diff = 12;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			w = in.nextInt();
			h = in.nextInt();
			if(w == 0) break;
			map = new int[h][w];
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					map[i][j] = in.nextInt();
				}
			}
			node = new Node[4*h*w];
			// id = dir*h*w + y*w + x
			// ID_MAX = 3600 < 2^12
			int size = 4*h*w;
			for(int i=0; i<size; i++){
				node[i] = new Node(i);
			}
			c = new int[4];
			for(int i=0; i<4; i++){
				c[i] = in.nextInt();
			}
			cost = new HashMap<Integer, Integer>();
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					edge(i, j, map[i][j]);
				}
			}
			int goal = h*w-1;
			int res = 0;
			Queue<Pos> qu = new PriorityQueue<Pos>();
			BitSet used = new BitSet(4*h*w);
			qu.add(new Pos(0, 0));
			while(!qu.isEmpty()){
				Pos p = qu.poll();
				if(used.get(p.id)) continue;
				if(p.id%(w*h) == goal){
					res = p.dist;
					break;
				}
				used.set(p.id);
				for(Node v: node[p.id].edge){
					int c = cost.containsKey(v.id)
							? Math.min(cost.get(v.id), p.dist+cost.get(p.id<<diff|v.id))
									: p.dist+cost.get(p.id<<diff|v.id);
					cost.put(v.id, c);
					qu.add(new Pos(v.id, c));
				}
			}
			System.out.println(res);
		}
	}
	
	public static void edge(int y, int x, int command){
		int base = h*w;
		for(int i=0; i<4; i++){
			// 命令iをつかう
			for(int j=0; j<4; j++){
				// 階層jから階層j+iへ、yからy+dy[j+i]へ、xからx+dx[j+i]へコストc[i]の辺を張る
				int ny = y+dy[(j+i)%4];
				int nx = x+dx[(j+i)%4];
				if(ny < 0 || ny >= h || nx < 0 || nx >= w) continue;
				int from = j*base + y*w + x;
				int to = ((j+i)%4)*base + ny*w + nx;
				node[from].createEdge(node[to]);
				cost.put(from<<diff|to, i==command?0:c[i]);
			}
		}
	}
}

class Pos implements Comparable<Pos>{
	int id;
	int dist;
	public Pos(int id, int dist){
		this.id = id;
		this.dist = dist;
	}
	
	@Override
	public int compareTo(Pos o) {
		return dist-o.dist;
	}
}

class Node{
	int id;
	List<Node> edge = new ArrayList<Node>();
	public Node(int id){
		this.id = id;
	}
	
	public void createEdge(Node nd){
		edge.add(nd);
	}
	
	public String toString(){
		return "(depth:"+(id/Main.w/Main.h)+", x:"+(id%Main.w)+", y:"+(id/Main.w)%Main.h+")";
	}
}