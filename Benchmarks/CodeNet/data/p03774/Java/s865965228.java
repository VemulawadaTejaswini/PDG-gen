import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ABV057BBSolve solve = new ABV057BBSolve();
		solve.main();
	}
}

class ABV057BBSolve {
	
	int N;
	int M;
	Point[] checkPoints;
	Point[] studentPoints;
	
	ABV057BBSolve() {
		Scanner cin = new Scanner(System.in);
		
		this.N = cin.nextInt();
		this.M = cin.nextInt();
		
		this.studentPoints = new Point[N];
		this.checkPoints = new Point[M];
		
		for (int i = 0; i < N; i++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			studentPoints[i] = new Point(a, b);
		}
		for (int i = 0; i < M; i++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			checkPoints[i] = new Point(a, b);
		}
	}
	
	void main() {
		for (Point studentPoint : studentPoints) {
			
			int min = Integer.MAX_VALUE / 2;
			int minPointId = -1;
			
			for (int i = M - 1; i >= 0; i--) {
				Point checkPoint = checkPoints[i];
				int distance = distance(studentPoint, checkPoint);
				if (distance <= min) {
					min = distance;
					minPointId = i;
				}
			}
			
			System.out.println(minPointId + 1);
		}
	}
	
	int distance(Point a, Point b) {
		return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
	}
	
	class Point {
		int x;
		int y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
