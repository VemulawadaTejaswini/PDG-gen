import java.util.*;
import java.awt.Point;

public class Main {
	static int[] xSums;
	static int[] wSums;
	static int[][] map;
	static List<List<Point>> blocks;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();

			if (w == 0 && h == 0)
				break;

			int[][] mapTemp = new int[h][w];

			for (int y = 0; y < h; y++) {
				String str = sc.next();
				for (int x = 0; x < w; x++) {
					char c = str.charAt(x);
					mapTemp[y][x] = c == '.' ? -1 : c - '0';
				}
			}
			
			map = new int[h][w];
			for (int i = 0; i < mapTemp.length; i++)
				Arrays.fill(map[i], -1);

			Deque<Point> queue = new ArrayDeque<Point>();
			blocks = new ArrayList<List<Point>>();
			int lowestIndex = -1;

			for (int y = 0; y < h; y++) {
				for (int x = 0; x < w; x++) {
					
					int me = mapTemp[y][x];
					if (me == -1)
						;
					else if (map[y][x] == -1) {
						queue.add(new Point(x, y));
						List<Point> block = new ArrayList<Point>();
						
						while (!queue.isEmpty()) {
							Point p = queue.pollFirst();
							if (block.contains(p))
								continue;

							if (p.y == h - 1)
								lowestIndex = blocks.size();

							map[p.y][p.x] = blocks.size();
							block.add(p);

							if (p.x > 0 && mapTemp[p.y][p.x - 1] == me)
								queue.add(new Point(p.x - 1, p.y));
							if (p.x < w - 1 && mapTemp[p.y][p.x + 1] == me)
								queue.add(new Point(p.x + 1, p.y));
							if (p.y > 0 && mapTemp[p.y - 1][p.x] == me)
								queue.add(new Point(p.x, p.y - 1));
							if (p.y < h - 1 && mapTemp[p.y + 1][p.x] == me)
								queue.add(new Point(p.x, p.y + 1));
						}
						blocks.add(block);
					}
				}
			}
			xSums = new int[blocks.size()];
			wSums = new int[blocks.size()];

			setMid(lowestIndex);

			boolean isStable = true;

			for (int i = 0; i < blocks.size(); i++) {
				double gp = (double) xSums[i] / wSums[i] + 0.5;
				List<Point> block = blocks.get(i);
				int left = 1000;
				int right = 0;
				
				for (int j = 0; j < block.size(); j++) {
					Point p = block.get(j);
					if (p.y == h - 1
							|| (map[p.y + 1][p.x] != -1 && map[p.y + 1][p.x] != i)) {
						if (p.x < left)
							left = p.x;
						if (p.x + 1 > right)
							right = p.x + 1;
					}
				}
				if (gp <= left || right <= gp) {
					isStable = false;
					break;
				}
			}

			System.out.println(isStable ? "STABLE" : "UNSTABLE");
		}

	}

	static void setMid(int index) {
		List<Point> block = blocks.get(index);
		boolean[] dejavu = new boolean[blocks.size()];

		for (Point p : block) {
			wSums[index]++;
			xSums[index] += p.x;
			if (p.y != 0) {
				int aboveIndex = map[p.y - 1][p.x];
				
				if (aboveIndex != -1 && aboveIndex != index && !dejavu[aboveIndex]) {
					if (wSums[aboveIndex] == 0)
						setMid(aboveIndex);
					dejavu[aboveIndex] = true;

					wSums[index] += wSums[aboveIndex];
					xSums[index] += xSums[aboveIndex];
				}
			}
		}
	}
}