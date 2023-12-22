import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new File("D:\\UserArea\\J0124567\\Downloads\\0530-input.txt"));

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0)
				break;
			River r = new River(n, m);
			for (int i = 0; i < n; i++) {
				int k = scan.nextInt();
				for (int j = 0; j < k; j++)
					r.addStone(i, j, scan.nextInt(), scan.nextInt());
			}
			System.out.println(r.min());
		}
		scan.close();
		System.exit(0);
	}
}

class River {
	private class Stones {
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> d = new ArrayList<Integer>();
	}

	int M;
	Stones[] stones;

	public River(int n, int m) {
		M = m;
		stones = new Stones[n];
		for (int i = 0; i < n; i++)
			stones[i] = new Stones();
	}

	int currLeast = Integer.MAX_VALUE;

	public int min() {
		for (int i = 0; i < stones[0].x.size(); i++) {
			int cost = this.jump(0, i, 0, M);
			if (currLeast > cost)
				currLeast = cost;
		}
		if (M > 0)
			for (int i = 0; i < stones[1].x.size(); i++) {
				int cost = this.jump(1, i, 0, M - 1);
				if (currLeast > cost)
					currLeast = cost;
			}

		return currLeast;
	}

	int[][][] result = new int[151][11][76];

	private int jump(int n, int k, int past, int mr) {
		if ((n >= stones.length - 1) || (n >= stones.length - 2 && mr > 0)) {
//			if (past < currLeast)
//				currLeast = past;
			return 0;
		}
		if (result[n][k][mr] != 0)
			return result[n][k][mr];

		int min = Integer.MAX_VALUE;
		if (past < currLeast) {
			for (int i = 0; i < stones[n + 1].x.size(); i++) {
				int mycost = (stones[n].d.get(k) + stones[n + 1].d.get(i))
						* (stones[n].x.get(k) - stones[n + 1].x.get(i));
				mycost = Math.abs(mycost);
				int cost = jump(n + 1, i, past + mycost, mr);
				if (cost != Integer.MAX_VALUE && cost + mycost < min)
					min = cost + mycost;
			}

			if (mr > 0 && n < stones.length - 2)
				for (int i = 0; i < stones[n + 2].x.size(); i++) {
					int mycost = (stones[n].d.get(k) + stones[n + 2].d.get(i))
							* (stones[n].x.get(k) - stones[n + 2].x.get(i));
					mycost = Math.abs(mycost);
					int cost = jump(n + 2, i, past + mycost, mr - 1);
					if (cost != Integer.MAX_VALUE && cost + mycost < min)
						min = cost + mycost;
				}
		}
		result[n][k][mr] = min;
		return min;
	}

	public void addStone(int n, int k, int x, int d) {
		stones[n].x.add(x);
		stones[n].d.add(d);
	}
}