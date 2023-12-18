import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Point> list = new ArrayList<Point>();
		for (int i = 0; i < m; i++) {
			list.add(new Point(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		
		long[] arr = new long[n];
		Arrays.fill(arr, Long.MIN_VALUE);
		boolean flag = true;
		while (list.size() > 0) {
			Point p = list.get(0);
			flag = setPoint(p, arr);
			if (!flag) {
				break;
			}
			list.remove(0);
			flag = searchList(p, list, arr);
			if (!flag) {
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static boolean searchList(Point p, ArrayList<Point> list, long[] arr) {
		boolean flag = true;
		while (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				Point x = list.get(i);
				if (x.l == p.l || x.r == p.r) {
					flag = setPoint(x, arr);
					if (!flag) {
						return false;
					}
					list.remove(i);
					flag = searchList(x, list, arr);
					if (!flag) {
						return false;
					}
					break;
				}
			}
			return true;
		}
		return true;
	}
		
	
	public static boolean setPoint(Point p, long[] arr) {
		if (arr[p.l - 1] == Long.MIN_VALUE && arr[p.r - 1] == Long.MIN_VALUE) {
			arr[p.l - 1] = 0;
			arr[p.r - 1] = p.d;
		} else if (arr[p.r - 1] == Long.MIN_VALUE) {
			arr[p.r - 1] = arr[p.l - 1] + p.d;
		} else if (arr[p.l - 1] == Long.MIN_VALUE ){
			arr[p.l - 1] = arr[p.r - 1] - p.d;
		} else {
			return (arr[p.l - 1] + p.d == arr[p.r - 1]);
		}
		return true;
	}
	
	public static class Point {
		int l;
		int r;
		int d;
		
		public Point(int l, int r, int d) {
			this.l = l;
			this.r = r;
			this.d = d;
		}
	}
		
		
}
