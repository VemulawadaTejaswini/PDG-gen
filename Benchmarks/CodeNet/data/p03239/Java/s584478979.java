import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int limittime = sc.nextInt();
		class Root {
			private int cost;
			private int time;

			public Root(int cost, int time) {
				super();
				this.cost = cost;
				this.time = time;
			}

			public int getCost() {
				return cost;
			}

			public int getTime() {
				return time;
			}
		}

		List<Root> roots = new ArrayList<Root>();
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int t = sc.nextInt();
			roots.add(new Root(c, t));
		}
		

		int minimamCost = 9999;
		for (int j = 0; j < roots.size(); j++) {
			Root root = roots.get(j);

			if (root.getTime() <= limittime) {
				if (root.getCost() <= minimamCost) {
					minimamCost = root.getCost();
				}
			}
		}

		if (minimamCost == 9999) {
			System.out.println("TLE");
		} else {
			System.out.println(minimamCost);
		}

	}
}
