import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			boolean[][] visited = new boolean[n][n];
			Point[][] dist = new Point[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					dist[i][j] = new Point(sc.nextInt(), sc.nextInt());
				}
			}
			int loopCount = 0;
			Set<Point> currentLoopLocs = new HashSet<Point>();
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (visited[i][j]) {
						continue;
					}
					currentLoopLocs.clear();
					currentLoopLocs.add(new Point(j, i));
					Point nextPoint = dist[i][j];
					
					while (!visited[nextPoint.y][nextPoint.x]) {
						visited[nextPoint.y][nextPoint.x] = true;
						currentLoopLocs.add(nextPoint);
						nextPoint = dist[nextPoint.y][nextPoint.x];
						if(currentLoopLocs.contains(nextPoint)) {
							loopCount++;
							break;
						}
						
					}
					visited[i][j] = true;
				}
			}
			System.out.println(loopCount);

		}

	}

	static class Point {
		final int x;
		final int y;

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

	}

}