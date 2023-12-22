import java.util.*;

public class Main {
	final int MAX = Integer.MAX_VALUE;
	Scanner sc = new Scanner(System.in);
	void doIt() {
		new Cliff_Climbing().Main();
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

	class Cliff_Climbing{

		void Main() {
			while(true) {
				int w = sc.nextInt();
				int h = sc.nextInt();
				if(w == 0 && h == 0) return;
				int dx[] = {1, 1, 1, 1, 1, 2, 2, 2, 3};
				int dy[] = {2, 1, 0, -1, -2, 1, 0, -1, 0};
				int d[][][] = new int[h][w][2];
				int c[][][] = new int[h][w][2];
				List<Point> t = new ArrayList<>(); 
				PriorityQueue<Node> next = new PriorityQueue<>();
				for(int i = 0; i < h; i++) {
					for(int j = 0; j < w; j++) {
						String s = sc.next();
						if (s.equals("X")) {
							d[i][j][0] = -1;
							c[i][j][0] = -1;
							d[i][j][1] = -1;
							c[i][j][1] = -1;
						}
						else if(s.equals("S")) {
							d[i][j][0] = 0;
							c[i][j][0] = 0;
							next.add(new Node(0, i, j, 0));
							d[i][j][1] = 0;
							c[i][j][1] = 0;
							next.add(new Node(0, i, j, 1));
						}
						else if(s.equals("T")) {
							t.add(new Point(i, j));
							d[i][j][0] = MAX;
							c[i][j][0] = 0;
							d[i][j][1] = MAX;
							c[i][j][1] = 0;
						}
						else {
							d[i][j][0] = MAX;
							c[i][j][0] = Integer.parseInt(s);
							d[i][j][1] = MAX;
							c[i][j][1] = Integer.parseInt(s);
						}

					}
				}
				while(!next.isEmpty()) {
					Node v = next.poll();
					if(d[v.y][v.x][v.z] < v.d)continue;
					for(int i = 0; i < 9; i++) {
						int mx = 1;
						if(v.z == 1) mx = -1;
						int x = v.x + dx[i] * mx; 
						int y = v.y + dy[i];
						int z = v.z ^ 1;
						if(x >= 0 && x < w 
								&& y >= 0 && y < h) {
							if(c[y][x][z] < 0)continue;
							//System.out.println(d[y][x][z] + " "  +(c[y][x][z] + v.d));
							if(d[y][x][z] > c[y][x][z] + v.d) {
								d[y][x][z] = c[y][x][z] + v.d;
								next.add(new Node(d[y][x][z], y, x, z));
							}
						}
					}
				}

				//System.out.println("!");
				int min = MAX;
				for(Point p: t) {
					if(min > d[p.y][p.x][0]) {
						min = d[p.y][p.x][0];
					}
					if(min > d[p.y][p.x][1]) {
						min = d[p.y][p.x][1];
					}
				}
				System.out.println((min < MAX)?min:-1);

			}
		}
		class Point{
			int x, y; Point (int y, int x){this.x = x; this.y = y;}
		}
		class Node implements Comparable<Node>{
			int d, x, y, z;
			//d => 最短距離
			@Override
			public int compareTo(Node arg0) {
				if(this.d < arg0.d){
					return -1;
				}
				else if(this.d > arg0.d){
					return 1;
				}
				return 0;
			}

			Node(int d, int y, int x, int z){
				this.d = d; this.x = x; this.y = y; this.z = z;
			}

		}

	}
}

