import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long result[] = new long[N];
		City[] c = new City[N];
		Main main = new Main();
		for (int i = 0; i < N; i++) {
			result[i] = Long.MAX_VALUE;
			City temp = main.new City();
			temp.x = sc.nextInt();
			temp.y = sc.nextInt();
			temp.p = sc.nextLong();
			c[i] = temp;
		}
		int pattern = 1;
		for (int i = 0; i < N; i++) {
			pattern *= 3;
		}
		for (int i = 0; i < pattern - 1; i++) {
			int road = Main.roadCount(i);
			if (road >= N) {
				continue;
			}
			int p[] = Main.changePattern(i, N);
			long cost = Main.cost(c, p);
			if (result[road] > cost) {
				result[road] = cost;
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(result[i]);
		}
		System.out.println(0);
	}

	public static int roadCount(int pattern) {
		int i = 0;
		while (pattern > 0) {
			if (pattern % 3 != 0) {
				i++;
			}
			pattern /= 3;
		}
		return i;
	}

	public static int[] changePattern(int pattern, int N) {
		int p[] = new int[N];
		int i = 0;
		while (pattern > 0) {
			p[i] = pattern % 3;
			i++;
			pattern /= 3;
		}
		return p;
	}

	public static long cost(City[] c, int[] pattern) {
		long result = 0;
		List<Integer> xRoad = new ArrayList<Integer>();
		xRoad.add(0);
		List<Integer> yRoad = new ArrayList<Integer>();
		yRoad.add(0);
		List<City> city = new ArrayList<City>();
		for (int i = 0; i < c.length; i++) {
			if (pattern[i] == 1) {
				// x road
				xRoad.add(c[i].x);
			} else if (pattern[i] == 2) {
				// y road
				yRoad.add(c[i].y);
			} else {
				city.add(c[i]);
			}
		}

		for (int i = 0; i < city.size(); i++) {
				long min = Long.MAX_VALUE;
				for (int j = 0; j < xRoad.size(); j++) {
					if (Math.abs(city.get(i).x - xRoad.get(j)) < min) {
						min = Math.abs(city.get(i).x - xRoad.get(j));
					}
				}
				for (int j = 0; j < yRoad.size(); j++) {
					if (Math.abs(city.get(i).y - yRoad.get(j)) < min) {
						min = Math.abs(city.get(i).y - yRoad.get(j));
					}
				}
				result += min * city.get(i).p;
		}
		return result;
	}

	public class City   {
		int x;
		int y;
		long p;
	}
}