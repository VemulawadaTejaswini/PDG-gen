import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ABC057BSolve solve = new ABC057BSolve();
		solve.main();
	}
}

class ABC057BSolve {
	
	Point[] checkPoints;
	Point[] students;
	int N;
	int M;
	
	ABC057BSolve() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.M = cin.nextInt();
		this.students = new Point[N];
		this.checkPoints = new Point[M];
		for (int i = 0; i < N; i++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			students[i] = new Point(a, b);
		}
		for (int i = 0; i < M; i++) {
			int c = cin.nextInt();
			int d = cin.nextInt();
			checkPoints[i] = new Point(c, d);
		}
	}
	
	void main() {
		for (Point student : students) {
			int point = 0;
			int min = Integer.MAX_VALUE;
			for (int i = M - 1; i >= 0; i--) {
				int distance = distance(student, checkPoints[i]);
				if (min >= distance) {
					min = distance;
					point = i + 1;
				}
			}
			System.out.println(point);
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
