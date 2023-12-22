import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static int map[][];
	public static boolean used[][];
	public static int h, w;
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		while(true){
			w = in.nextInt();
			h = in.nextInt();
			if(w == 0) break;
			map = new int[h][w];
			used = new boolean[h][w];
			for(int i=0; i<h; i++){
				char[] s = in.next().toCharArray();
				for(int j=0; j<w; j++){
					map[i][j] = s[j]=='.'?0:s[j]-'0';
				}
			}
			Node res = null;
			for(int i=0; i<w; i++){
				if(map[h-1][i] == 0) continue;
				res = tree(map[h-1][i], h-1, i);
				break;
			}
			System.out.println(res==null?"UNSTABLE":"STABLE");
		}
	}
	public static int[] dx = {1, 0, -1, 0};
	public static int[] dy = {0, 1, 0, -1};
	public static Node tree(int id, int y, int x){
		Node node = new Node();
		Queue<Pos> qu = new LinkedList<Pos>();
		qu.add(new Pos(y, x));
		int lx = 200000;
		int rx = 0;
		int by = 0;
		double gx = 0;
		double gy = 0;
		while(!qu.isEmpty()){
			Pos p = qu.poll();
			if(used[p.y][p.x]) continue;
			int ux = p.x+dx[1];
			int uy = p.y+dy[1];
			if(uy == h || !out(uy, ux) && map[uy][ux]!=id){
				by = p.y;
				lx = Math.min(p.x, lx);
				rx = Math.max(rx, p.x);
			}
			gx += p.x+0.5;
			gy += p.y+0.5;
			used[p.y][p.x] = true;
			for(int i=0; i<4; i++){
				int ny = p.y+dy[i];
				int nx = p.x+dx[i];
				if(out(ny, nx)) continue;
//				if(map[ny][nx] == 0) continue;
				if(i==3 && map[ny][nx]!=id && !used[ny][nx]){
					Node v = tree(map[ny][nx], ny, nx);
					if(v == null) return null;
					node.createEdge(v);
					continue;
				}
				if(map[ny][nx] == id) qu.add(new Pos(ny, nx));
			}
		}
		node.x = gx/4.0;
		node.y = gy/4.0;
		if(isStable(node, lx, rx+1)) return node;
		return null;
	}
	
	public static boolean isStable(Node node, int lx, int rx){
		int block = 0;
		double gx = 0;
		double gy = 0;
		for(Node v: node.edge){
			block += v.block;
			gx += v.block*v.x;
			gy += v.block*v.y;
		}
		node.block += block;
		node.x = (node.x*4 + gx)/node.block;
		node.y = (node.y*4 + gy)/node.block;
		return lx < node.x && node.x < rx;
	}
	
	public static boolean out(int y, int x){
		return y < 0 || y >= h || x < 0 || x >= w || map[y][x] == 0;
	}
}

class Pos{
	int x, y;
	public Pos(int y, int x){
		this.x = x;
		this.y = y;
	}
}

class Node{
	double x, y;
	int block = 4;
	ArrayList<Node> edge = new ArrayList<Node>();
//	public Node(double y, double x){
//		this.x = x;
//		this.y = y;
//	}
	public void createEdge(Node nd){
		edge.add(nd);
	}
}