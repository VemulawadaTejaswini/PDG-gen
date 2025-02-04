import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	/** ????§??????? */
	static final String WHITE_SPACE = " ";

	/** ??????????????????_X */
	static int mapSizeX = 0;

	/** ??????????????????_Y */
	static int mapSizeY = 0;

	/** ????????? */
	static String[] map = new String[1000 * 1000];

	/** ?????????????¨??????????????????????????´??????? */
	static boolean[] visited = new boolean[1000 * 1000];

	/** ??????????????????????????? */
	static int[] cost = new int[1000 * 1000];

	/** ??????????????° */
	static int maxNode = 0;

	/** ????????¢??????????????? */
	static List<Point> pachimonList = new ArrayList<Point>();

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			readMap(scanner);
			int[] adjacent = createAdjacent();
			Point output = createPos(0, Integer.MAX_VALUE);

			for (int type = 1; type <= 5 && maxNode > 0; type++) {
				// ??????????????¶????????¢??????????????£??\???????????????????????¨??´???????????????????????±????¨????
				adjacent = addStartGoal(adjacent, type);

				// ??????????????????????????¢??????????????????????????????????????????????´¢
				int cost = searchRoute(adjacent, type);
				if (cost < output.y) {
					output.x = type;
					output.y = cost;
				}
			}

			// ???????????????
			if (output.y == Integer.MAX_VALUE) {
				System.out.println("NA");
			} else {
				System.out.println(output.x + WHITE_SPACE + output.y);
			}
		}
	}

	/**
	 * ?????????????????????????????????
	 * @param scanner ????????£??????
	 */
	private static void readMap(Scanner scanner) {
		String[] mapSizeLine = scanner.nextLine().split(WHITE_SPACE);

		if (mapSizeLine.length < 2) {
			return;
		}
		// ??????????????±????????????
		pachimonList.removeAll(pachimonList);
		maxNode = 0;
		mapSizeX = Integer.parseInt(mapSizeLine[0]);
		mapSizeY = Integer.parseInt(mapSizeLine[1]);
		initializeMap(mapSizeX, mapSizeY);

		for (int i = 0; i < mapSizeY; i++) {
			String mapInfoLine = scanner.nextLine();
			mapInfoLine = mapInfoLine.replaceAll("\\.", "9");
			mapInfoLine = mapInfoLine.replaceAll("S", "0");
			mapInfoLine = mapInfoLine.replaceAll("G", "6");
			for (int j = 0; j < mapSizeX; j++) {
				int val = Integer.parseInt(String.valueOf(mapInfoLine.charAt(j)));
				if (val < 9) {
					// ???????????¢????????°????¨????
					pachimonList.add(createPos(Integer.valueOf(val), calcIndex(j, i)));
					maxNode++;
				}
			}
		}

		Collections.sort(pachimonList, new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return o1.x - o2.x;
			}
		});
	}

	/**
	 * X????????????????????´?????????????????¢???????±???§????¨????<br>
	 * ????????????:0?????´??????:6???????????¢???????±???§:1???5<br>
	 * Y????????????????????????????????????????´?
	 * @param type ?????????????????´?????????????????¢???????±???§
	 * @param index ??????????????????????????????
	 * @return
	 */
	private static Point createPos(int type, int index) {
		return new Point(type, index);
	}

	/**
	 * ??????????????¨??????????´???????????????§?????????
	 * @param sizeX ??????????????????_X
	 * @param sizeY ??????????????????_Y
	 */
	private static void initializeMap(int sizeX, int sizeY) {
		for (int i = 0; i < sizeX * sizeY; i++) {
			map[i] = "";
		}
	}

	/**
	 * ??¨???????????????????????£??\??????????±???????
	 * @return ??£??\??????
	 */
	private static int[] createAdjacent() {
		int[] adjacent = new int[maxNode * maxNode];

		for (int i = 1; i < pachimonList.size() - 1; i++) {
			if (pachimonList.get(i).x < 5) {
				for (int j = i + 1; j < pachimonList.size() - 1; j++) {
					if (pachimonList.get(j).x - pachimonList.get(i).x > 2)
						break;

					if (pachimonList.get(j).x == pachimonList.get(i).x + 1)
						adjacent[i * maxNode + j] = clucCost(pachimonList.get(i), pachimonList.get(j));
				}
			} else {
				for (int j = 0; j < pachimonList.size() - 1; j++) {
					if (pachimonList.get(j).x == pachimonList.get(i).x - 4)
						adjacent[i * maxNode + j] = clucCost(pachimonList.get(i), pachimonList.get(j));
				}
			}
		}
		return adjacent;
	}

	/**
	 * ??????????????????????????¢????????????????????????????????????????±???§???????????¢??????????????????<br>
	 * ?????????????????????????????¢?????????????????????????¨????
	 * @param adjacent ??£??\??????
	 * @param firstType ??????????????????????????¢???????±???§
	 * @return ??£??\??????
	 */
	private static int[] addStartGoal(int[] adjacent, int firstType) {
		// ??????????????????????????¢????????????????¬??????????????????????????????¢?????¨??????????????£??\??????????¨????
		int startRow = 0;
		int goalRow = maxNode - 1;

		// ??????????????????????????¢????????????????????????????????????1?¨?????????????????????????4?¨??????????????????????
		int nextType = getNextType(firstType);
		int endType = getEndType(firstType);
		// ??????????????¨??´???????????±?????????????????????
		resetStartGoal(adjacent);

		for (int i = 0; i < pachimonList.size(); i++) {
			if (pachimonList.get(i).x == nextType)
				adjacent[startRow * maxNode + i] = clucCost(pachimonList.get(0), pachimonList.get(i));

			if (pachimonList.get(i).x == endType)
				adjacent[i * maxNode + goalRow] = clucCost(pachimonList.get(i), pachimonList.get(maxNode - 1));
		}
		return adjacent;
	}

	/**
	 * ??????????????¨??´?????????????????????????????????????????????
	 * @return ????????????????????£??\??????
	 */
	private static void resetStartGoal(int[] adjacent) {
		int goalRow = maxNode;
		for (int i = 0; i < maxNode; i++) {
			adjacent[i] = 0;
			adjacent[goalRow * (i + 1) - 1] = 0;
		}
	}

	/**
	 * ??????????????????????????¢???????????????????????????????????????????????¢???????±???§?????????
	 * @param firstType ??????????????????????????¢???????±???§
	 * @return ?????????????????????????????¢???????±???§
	 */
	private static int getNextType(int firstType) {
		if (firstType > 4) {
			return 1;
		}
		return firstType + 1;
	}

	/**
	 * ??????????????????????????¢?????????????????????????????????????????¢???????±???§?????????
	 * @param firstType ??????????????????????????¢???????±???§
	 * @return ?????????????????????????????¢???????±???§
	 */
	private static int getEndType(int firstType) {
		if (firstType > 1)
			return firstType - 1;

		return 5;
	}

	/**
	 * ??£??\??????????¨?????????????????????????????????´???????????§???<br>
	 * ????????????????????????????±???????
	 * @param adjacent ??£??\??????
	 * @return ????????????????????????
	 */
	private static int searchRoute(int[] adjacent, int firstType) {

		for (int i = 0; i < maxNode; i++) {
			cost[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}

		// ??????????????°????????§???????????????0
		cost[0] = 0;

		while (true) {
			// ?¨?????????????????????????????????§?????????????????????????±???????
			int node = minIndex(cost, visited);
			if (node < 0) {
				return cost[maxNode - 1];
			}
			// ??¢?´¢???????????????????????????????????°????????????
			visited[node] = true;
			for (int j = 0; j < maxNode; j++) {
				if (adjacent[node * maxNode + j] > 0 && !visited[j] && pachimonList.get(node).x != firstType) {
					int nextNodeCost = cost[node] + adjacent[node * maxNode + j];
					// ????????§????????¢??????????°????????????°???????????¢??¨???????¨???¶
					if (nextNodeCost < cost[j]) {
						cost[j] = nextNodeCost;
					}
				}
			}
		}
	}

	/**
	 * ?¨???????????????????????????????????????????????????????????????????????????????????±???????
	 * @param cost ???????????????????????????
	 * @param visited ?????????????¨??????????????????????????´???????
	 * @return ??????????????????
	 */
	private static int minIndex(int[] cost, boolean[] visited) {
		int index = 0;
		for (; index < maxNode; index++) {
			if (!visited[index])
				break;
		}
		if (index == maxNode)
			return -1;
		for (int i = index + 1; i < maxNode; i++) {
			if (!visited[i] && cost[i] < cost[index])
				index = i;
		}
		return index;
	}

	/**
	 * ????????????????????????????????´???????????§????????????????¨?????????????
	 * @param sx ???????????????X??§?¨?
	 * @param sy ???????????????Y??§?¨?
	 * @param gx ??´?????????X??§?¨?
	 * @param gy ??´?????????Y??§?¨?
	 * @param nextType ?¬????????????????????????¢????±???§
	 */
	private static int clucCost(Point from, Point to) {
		int fx = from.y / mapSizeY;
		int fy = from.y % mapSizeY;
		int tx = to.y / mapSizeY;
		int ty = to.y % mapSizeY;
		return Math.abs(tx - fx) + Math.abs(ty - fy);
	}

	/**
	 * X??§?¨???¨Y??§?¨???????????????£?????????????????????????????????????????´?????????
	 *
	 * @param x X??§?¨?
	 * @param y Y??§?¨?
	 * @return
	 */
	private static int calcIndex(int x, int y) {
		return x * mapSizeY + y;
	}
}