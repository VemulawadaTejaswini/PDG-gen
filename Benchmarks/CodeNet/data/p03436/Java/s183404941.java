import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	Scanner sc;
	int H, W, ps;
	char grid[][][];
	Queue<Node> q;
	
	public static void main(String[] args) {
		new Main().run();
	}
	

	void run() {
		init();
		q.offer(new Node(0, 0, 0));
		bfs();
	}
	
	void init() {
		sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		q = new ArrayDeque<Node>();
		ps = 0;
		grid = new char[H][W][2];
		String s;
		char c;
		for(int i=0; i<H; i++) {
			s = sc.next();
			for(int j=0; j<W; j++) {
				c = s.charAt(j);
				if(c == '.') ps++;
				grid[i][j][0] = c;
				grid[i][j][1] = 'f';
			}
		}
		sc.close();
	}
	
	void bfs() {
		if(q.isEmpty()) {
			System.out.println(-1);
			return;
		}
		Node node = q.poll();
		int c = node.cost + 1;
		if(node.x == W-1 && node.y == H-1) {
			System.out.println(ps - c);
			return;
		} else {
			grid[node.y][node.x][1] = 't';
			int x = node.x;	int y = node.y;
			if(x+1 < W) 
				if(grid[y][x+1][0] != '#' && grid[y][x+1][1] == 'f') q.offer(new Node(x+1, y, c));
			if(x-1 >= 0)
				if(grid[y][x-1][0] != '#' && grid[y][x-1][1] == 'f') q.offer(new Node(x-1, y, c));
			if(y+1 < H)
				if(grid[y+1][x][0] != '#' && grid[y+1][x][1] == 'f') q.offer(new Node(x, y+1, c));
			if(y-1 >= 0)
				if(grid[y-1][x][0] != '#' && grid[y-1][x][1] == 'f') q.offer(new Node(x, y-1, c));
			bfs();
		}
	}
}

class Node {
	int x, y, cost;
	Node(int x, int y, int cost) {
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
}