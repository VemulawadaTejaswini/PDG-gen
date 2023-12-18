import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Engine[] list = new Engine[n];
		for (int i = 0; i < n; i++) {
			list[i] = new Engine(sc.nextInt(), sc.nextInt());
		}
		double max = 0;
		Arrays.sort(list, new Comparator<Engine>() {
		public int compare(Engine e1, Engine e2) {
			return e1.x + e1.y - (e2.x + e2.y);
		}
		});
		Arrays.sort(list, new Comparator<Engine>() {
		public int compare(Engine e1, Engine e2) {
			return e1.x - e1.y - (e2.x - e2.y);
		}
		});
		Arrays.sort(list, new Comparator<Engine>() {
		public int compare(Engine e1, Engine e2) {
			return - e1.x + e1.y - (- e2.x + e2.y);
		}
		});
		Arrays.sort(list, new Comparator<Engine>() {
		public int compare(Engine e1, Engine e2) {
			return - e1.x - e1.y - (- e2.x - e2.y);
		}
		});
		max = Math.max(max, getDD(list));
		System.out.println(max);
	}
	
	static double getDD(Engine[] list) {
		double prev = 0;
		double d = 0;
		int xx = 0;
		int yy = 0;
		for (int i = 0; i < list.length; i++) {
			xx += list[i].x;
			yy += list[i].y;
			d = getD(xx, yy);
			if (prev > d) {
				return prev;
			}
			prev = d;
		}
		return d;
	}
	
	static double getD(long x, long y) {
		return Math.sqrt(x * x + y * y);
	}
	
	static class Engine {
		int x;
		int y;
		public Engine(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
