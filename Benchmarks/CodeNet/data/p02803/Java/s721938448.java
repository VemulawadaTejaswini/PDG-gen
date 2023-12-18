import java.util.*;
import java.io.*;

class Main {

	void solve() {
		
		int h = inint(), w = inint();

		char[][] map = new char[h][w];
		for (int i=0; i<h; i++) {
			String temp = instr();
			for (int j=0; j<w; j++) {
				map[i][j] = temp.charAt(j);
			}
		}
		
		
		int maxNum = 0;
		
		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				if (map[i][j] == '.') { //幅優先探索開始
					
					int[][] memo = new int[h][w];
					Point s = new Point(j, i);
					
					memo[i][j] = 1;
					
					ArrayDeque<Point> dq = new ArrayDeque<>();
					dq.add(s);
					
					int num = 0;
					
					while (dq.size() > 0) {
						Point p = dq.removeFirst();
						for (int k=0; k<4; k++) {
							int x = p.x + dx[k];
							int y = p.y + dy[k];
							if (x >= 0 && x < w && y >= 0 && y < h) {
								if (map[y][x] == '.' && memo[y][x] == 0) {
									dq.addLast(new Point(x, y));
									memo[y][x] = memo[p.y][p.x] + 1;
									num = memo[p.y][p.x] + 1;
								}
							}
						}
					}
					
					maxNum = Math.max(maxNum, num);
					
					//out.println(num);
					//print(memo);
					
				}
			}
		}
		
		out.println(maxNum - 1);
		
	}
	
	public void print(int[][] a) {
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				out.print(a[i][j]);
			}
			out.println();
			out.println();
		}
	}
	
	int[] dx = {0, 1, 0, -1};
	int[] dy = {-1, 0, 1, 0};
	
	public double calc(int[] a, int b) {
		double d = 0;
		for (int i=0; i<a.length; i++) d += a[i];
		d += b;
		return d / (double)(a.length + 1);
	}

	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

	public int inint() {
		return in.nextInt();
	}

	public long inlong() {
		return in.nextLong();
	}

	public String instr() {
		return in.next();
	}

	public char inchar() {
		return in.next().charAt(0);
	}

	public int[] inintar(int num) {
		int[] a = new int[num];
		for (int i=0; i<num; i++) {
			a[i] = in.nextInt();
		}
		return a;
	}

	public char[] incharar() {
		return in.next().toCharArray();
	}

}

class Point {
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}