import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrH = new int[n];
		int[] arrA = new int[n];
		for (int i = 0; i < n; i++) {
			arrH[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrA[i] = sc.nextInt();
		}
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(new Point(0, 0));
		for (int i = 0; i < n; i++) {
			Point max = list.get(0);
			for (Point p : list) {
				if (p.h < arrH[i] && p.value > max.value) {
					max = p;
				}
			}
			list.add(new Point(arrH[i], max.value + arrA[i]));
		}
		
		long max = 0;
		for (Point p : list) {
			if (max < p.value) {
				max = p.value;
			}
		}
		
		System.out.println(max);
	}
	
	static class Point {
		int h;
		long value;
		public Point(int h, long value) {
			this.h = h;
			this.value = value;
		}
	}
}
