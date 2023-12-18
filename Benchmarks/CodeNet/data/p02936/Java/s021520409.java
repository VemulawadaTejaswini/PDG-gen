
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		main.exec();

	}

	private void exec() {

		int n;
		int q;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		q = sc.nextInt();
		Map<Integer, Point> tree = new TreeMap<>();
		tree.put(1, new Point(1));
		int pa;
		int c;
		for(int i = 0 ; i < n - 1 ; i++) {
			pa = sc.nextInt();
			c = sc.nextInt();
			Point parent = tree.get(pa);
			Point child = tree.get(c);
			if(child == null) {
				child = new Point(c);
			}
			parent.addChild(child);
			tree.put(c, child);
		}
		int p;
		int x;
		for(int i = 0 ; i < q ; i++) {
			p = sc.nextInt();
			x = sc.nextInt();
			Point parent = tree.get(p);
			parent.addCount(x);
		}
		for(Map.Entry<Integer, Point> entry : tree.entrySet()) {
			System.out.println(entry.getValue().getCount());
		}
		sc.close();

	}

}

class Point implements Comparable<Point> {

	int number;
	long count = 0;
	List<Point> child = new ArrayList<>();

	public Point(int number) {
		this.number = number;
	}

	public void addChild(Point point) {
		child.add(point);
	}

	public void addCount(int x) {
		count += x;
		for(Point point : child) {
			point.addCount(x);
		}
	}

	public void plusCount(int x) {
		count += x;
	}

	public int getNumber() {
		return number;
	}

	public long getCount() {
		return count;
	}

	@Override
	public int compareTo(Point o) {
		return number - o.getNumber();
	}

	@Override
	public boolean equals(Object o) {
		if(number == ((Point)o).getNumber()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return number;
	}

}
