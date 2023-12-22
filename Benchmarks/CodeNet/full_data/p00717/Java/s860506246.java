import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();

			if(n == 0){
				break;
			}

//			System.out.println("n = "+n);
			PolygonalLine plines[] = new PolygonalLine[n + 1];

			for(int i = 0; i <= n; i++){
				int m = sc.nextInt();

				plines[i] = new PolygonalLine(m);
				for(int j = 0; j < m; j++){
					int x = sc.nextInt();
					int y = sc.nextInt();

					plines[i].addPoint(x, y);
				}
			}

			solve(plines);
			System.out.println("+++++");
		}
	}

	static void solve(PolygonalLine[] plines){
		int n = plines.length - 1;

		Point[] originalVectors = makeVectors(plines[0]);

//		printPoints(originalVectors);

		for(int i = 1; i <= n; i++){
//			System.out.println("i = "+i);
//			System.out.println("normal");
//			printPoints(makeVectors(plines[i]));
//			System.out.println("reverse");
//			printPoints(makeVectors(plines[i].reverseLine()));
			//順方向比較
			if(isSamePoints(originalVectors, makeVectors(plines[i]))){
				System.out.println(i);
			}

			//逆方向比較
			else if(isSamePoints(originalVectors, makeVectors(plines[i].reverseLine()))){
				System.out.println(i);
			}
		}
	}

	//debug
	static void printPoints(Point[] points){
		for(int i = 0; i < points.length; i++){
			System.out.print("("+points[i].x+", "+points[i].y+") ");
		}
		System.out.println();
	}
	static boolean isSamePoints(Point[] points1, Point[] points2){
		int n = points1.length;
		int m = points2.length;

		if(n != m){
			return false;
		}

		for(int i = 0; i < n; i++){
			if(!points1[i].equals(points2[i])){
				return false;
			}
		}

		return true;
	}

	static Point[] makeVectors(PolygonalLine pline){
		int n = pline.points.length;

		Point[] result = new Point[n - 1];

		int dx0 = pline.points[1].x - pline.points[0].x;
		int dy0 = pline.points[1].y - pline.points[0].y;
		for(int i = 0; i < n - 1; i++){
			int dx = pline.points[i + 1].x - pline.points[i].x;
			int dy = pline.points[i + 1].y - pline.points[i].y;

			result[i] = new Point(dx, dy);

			//初手は必ず右向きになるように回転
			if(dy0 > 0){
//				System.out.println("rotate -90");
				result[i].x = dy; result[i].y = -dx;
			}
			else if(dx0 < 0){
				result[i].x = -dx; result[i].y = -dy;
			}
			else if(dy0 < 0){
//				System.out.println("rotete -270");
				result[i].x = -dy; result[i].y = dx;
			}
		}

		return result;
	}

}

class PolygonalLine {
	private int m;
	private int index = 0;

	Point[] points;
	public PolygonalLine(int m) {
		this.m = m;
		points = new Point[m];
	}

	public void addPoint(int x, int y){
		points[index++] = new Point(x, y);
	}

	public PolygonalLine reverseLine(){
		PolygonalLine clone = new PolygonalLine(m);

		for(int i = 0; i < m; i++){
			clone.addPoint(this.points[m - i - 1].x, this.points[m - i - 1].y);
		}

		return clone;
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	public boolean equals(Point p){
		if(this.x == p.x && this.y == p.y){
			return true;
		}
		else {
			return false;
		}
	}
}
