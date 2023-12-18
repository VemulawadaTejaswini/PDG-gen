import java.awt.Point;
import java.util.*;

public class Main {
	int N;
	List<Point> redPoints;
	List<Point> bluePoints;
	boolean[] redUsed;
	Comparator<Point> compX = new Comparator<Point>() {
		@Override
		public int compare(Point o1, Point o2) {
			if (o1.x < o2.x) {
				return -1;
			} else if (o1.x > o2.x) {
				return 1;
			} else {
				return 0;
			}
		}
	};

	Comparator<Point> compY = new Comparator<Point>() {
		@Override
		public int compare(Point o1, Point o2) {
			if (o1.y < o2.y) {
				return -1;
			} else if (o1.y > o2.y) {
				return 1;
			} else {
				return 0;
			}
		}
	};

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		this.redPoints = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			this.redPoints.add(new Point(a, b));
		}
		this.bluePoints = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			int c = in.nextInt();
			int d = in.nextInt();
			this.bluePoints.add(new Point(c, d));
		}
		in.close();
		Collections.sort(this.redPoints, this.compX);
		Collections.sort(this.bluePoints, this.compX);
		this.redUsed = new boolean[N];
		Arrays.fill(this.redUsed, false);
	}

	int result = 0;

	void calc() {
		for (int i = 0; i < N; ++i) {
			Point bluePoint = this.bluePoints.get(i);
			int redPointIndex = findPair(bluePoint);
			if (redPointIndex >= 0) {
				result++;
				redUsed[redPointIndex] = true;
			}
		}
	}

	int findPair(Point bluePoint) {
		Set<Integer> redPointIndexes = new HashSet<>();
		for (int i = 0; i < N; ++i) {
			if (this.redPoints.get(i).getX() < bluePoint.getX()) {
				if (!this.redUsed[i]) {
					redPointIndexes.add(i);
				}
			} else {
				break;
			}
		}
		int result = -1;
		int yVal = Integer.MIN_VALUE;
		for (Integer i : redPointIndexes) {
			if (redPoints.get(i).y > yVal) {
				result = i;
				yVal = redPoints.get(i).y;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}
}