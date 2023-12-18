import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private class Point {
		int x, y;
		int dist = 0;
		public Point(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
		
		public int getDist(Point p) {
			return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
		}
	}
	
	int H;
	int W;
	int[] map;

	
	public int get(int x, int y) {
		if (x<0||y<0||x>=W||y>=H) {
			return 0;
		} else {
			return map[y*H+x];
		}
	}
	
	public void set(int x, int y, int d) {
		map[y*H+x] = d;
	}
	
	public void solve() {
		LinkedList<Point> around = new LinkedList<Point>();
		around.add(new Point(-1, 0, 0));
		around.add(new Point( 1, 0, 0));
		around.add(new Point( 0,-1, 0));
		around.add(new Point( 0, 1, 0));
		LinkedList<Point> next = new LinkedList<Main.Point>();
		Scanner in = new Scanner(System.in);
		H = in.nextInt();
		W = in.nextInt();
		
		map = new int[H*W];
		Arrays.fill(map, -1);
		
		for (int y=0; y<H; y++) {
			String line = in.next();
			for (int x=0; x<W; x++) {
				if (line.charAt(x) == '#') {
					// black
					next.add(new Point(x, y, 0));
					map[y*H+x] = 0;
				}
			}
		}
		in.close();
		
		int max = 0;
		while (next.isEmpty() == false) {
			Point p = next.removeLast();
			for (Point d : around) {
				int dx = p.x + d.x;
				int dy = p.y + d.y;
				
				if (get(dx, dy) == -1) {
					set(dx, dy, p.dist+1);
					next.addFirst(new Point(dx, dy, p.dist+1));
					max = p.dist+1;
				}
			}
		}
		
		System.out.println(max);
	}
		
	
	/*
	public void solve() {
		LinkedList<Point> wPoints = new LinkedList<Main.Point>();
		LinkedList<Point> bPoints = new LinkedList<Main.Point>();
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		
		for (int y=0; y<H; y++) {
			String line = in.next();
			for (int x=0; x<W; x++) {
				if (line.charAt(x) == '#') {
					// black
					bPoints.add(new Point(x, y));
				} else {
					// white
					wPoints.add(new Point(x, y));
				}
			}
		}
		
		in.close();
		int max = 0;
		for (Point wp : wPoints) {
			int min = Integer.MAX_VALUE;
			for (Point bp : bPoints) {
				int dist = wp.getDist(bp);
				if (min > dist) {
					if (min <= max) {
						break;
					}
					min = dist;
				}
			}
			if (max < min) {
				max = min;
			}
		}
		
		System.out.println(max);
	}
	*/
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

}
