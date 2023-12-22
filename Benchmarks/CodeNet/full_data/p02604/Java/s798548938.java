import java.util.ArrayList;
import java.util.Collections;
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
		Collections.sort(xRoad);
		Collections.sort(yRoad);
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
				int m = 0;
				int a = xRoad.size()-1;
				int index =0;
				int re =a;
				while (m<=a) {
					index = (m+a)/2;
					if (xRoad.get(index)<city.get(i).x) {
						re = index;
						m = re+1;
					} else {
						a = index-1;
					}
				}
				if (re==xRoad.size()-1) {
					min = Math.abs(city.get(i).x - xRoad.get(re));
				} else {
					min = Math.min(Math.abs(city.get(i).x - xRoad.get(re)), Math.abs(city.get(i).x - xRoad.get(re+1)));
				}

				m = 0;
				a = yRoad.size()-1;
				index =0;
				re =a;
				while (m<=a) {
					index = (m+a)/2;
					if (yRoad.get(index)<city.get(i).y) {
						re = index;
						m = re+1;
					} else {
						a = index-1;
					}
				}
				if (re==yRoad.size()-1) {
					min = Math.abs(city.get(i).y - yRoad.get(re));
				} else {
					min = Math.min(Math.abs(city.get(i).y - yRoad.get(re)), Math.abs(city.get(i).y - yRoad.get(re+1)));
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