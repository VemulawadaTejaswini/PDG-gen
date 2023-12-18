import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> reds = new ArrayList<Point>();
		for (int i = 0; i < n; i++) {
			reds.add(new Point(sc.nextInt(), sc.nextInt()));
		}
		ArrayList<Point> blues = new ArrayList<Point>();
		for (int i = 0; i < n; i++) {
			blues.add(new Point(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(reds, new Comparator<Point>(){
		public int compare(Point p1, Point p2){
			return p2.y - p1.y;
		}
		});
		Collections.sort(blues, new Comparator<Point>(){
		public int compare(Point p1, Point p2) {
			return p1.x - p2.x;
		}
		});
		int count = 0;
		for (Point b : blues) {
			Point x = null;
			for (Point r : reds) {
				if (r.isMatch(b)) {
					x = r;
					count++;
					break;
				}
			}
			if (x != null) {
				reds.remove(reds.indexOf(x));
			}
		}
		System.out.println(count);
		
	}
	
	public static class Point {
		public int x;
		public int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Point() {
			this(0, 0);
		}
		
		public boolean isMatch(Point p) {
			return (x < p.x && y < p.y);
		}
		
	}
}
