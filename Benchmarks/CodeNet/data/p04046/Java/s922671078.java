import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		IrohaAndGrid iroha = new IrohaAndGrid();
		iroha.run();
	}
}

class IrohaAndGrid {
	
	int H;
	int W;
	int A;
	int B;
	
	long[][] dp;
	
	IrohaAndGrid() {
		Scanner cin = new Scanner(System.in);
		this.H = cin.nextInt();
		this.W = cin.nextInt();
		this.A = cin.nextInt();
		this.B = cin.nextInt();
		
		this.dp = new long[W][H];
	}
	
	void run() {
		Point start = new Point(0, 0);
		long count = bfs(start);
		System.out.println(count);
	}
	
	long bfs(Point point) {
		
		
		if (point.isGoal())
			return 1;
		
		if (dp[point.x][point.y] > 0) {
//			System.out.println("user it in memo");
			return dp[point.x][point.y]; 
		}
		
		long count = 0;
		int[] vx = {1, 0};
		int[] vy = {0, 1};
		for (int i = 0; i < 2; i++) {
			Point nextPoint = new Point(point.x + vx[i], point.y + vy[i]);
//			System.out.println("x: " + nextPoint.x + " y: " + nextPoint.y);
			if (nextPoint.inValidOutOfRect()) {
//				System.out.println("inValidOutOfRect");
				continue;
			}
			
			if (nextPoint.inValidFromAB()) {
//				System.out.println("inValidFromAB");
				continue;
			}
			
			count += bfs(nextPoint);
		}
		return dp[point.x][point.y] = count;
	}
	
	class Point {
		
		int x;
		int y;
	
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		boolean isGoal() {
			return x == W - 1 && y == H - 1;
		}
		
		boolean inValidFromAB() {
			return y >= H - A && x < B;
		}
		
		boolean inValidOutOfRect() {
			return y >= H || x >= W;
		}
	}
}
