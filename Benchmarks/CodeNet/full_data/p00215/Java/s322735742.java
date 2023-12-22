import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	/** スタート地点を表す文字 */
	private static final String START = "S";

	private static String minAttribute = null;
	private static int minMoveCount = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {

			// 縦横の長さを取得する
			String[] mapSize = line.split(" ");
			int sizeX = Integer.parseInt(mapSize[0]);
			int sizeY = Integer.parseInt(mapSize[1]);

			Map<String, List<String>> attributeMap = new HashMap<String, List<String>>();

			// 属性ごとのパチモンの座標をセットする
			for (int i = 0; i < sizeY; i++) {
				String xLine = br.readLine();
				for (int j = 0; j < sizeX; j++) {
					String str = String.valueOf(xLine.charAt(j));
					if (!".".equals(str)) {
						if (!attributeMap.containsKey(str)) {
							attributeMap.put(str, new ArrayList<String>());
						}
						attributeMap.get(str).add(j + "," + i);
					}
				}
			}

			// すべての属性がそろっていない場合は、"NA"を出力
			if (attributeMap.keySet().size() != 7) {
				System.out.println("NA");
				continue;
			}

			// 移動数が最小となるスタート時の属性と移動数を求める
			for (int i = 1; i <= 5; i++) {
				String startAttribute = String.valueOf(i);
				calcTotalMoveCount(attributeMap,
						attributeMap.get(START).get(0), startAttribute, 1, 0);
			}
			System.out.println(minAttribute + " " + minMoveCount);
		}
	}

	private static int calcMoveCount(String from, String to) {

		// 移動元の座標を取得
		String[] fromPoint = from.split(",");
		int fromPointX = Integer.parseInt(fromPoint[0]);
		int fromPointY = Integer.parseInt(fromPoint[1]);

		// 移動先の座標を取得
		String[] toPoint = to.split(",");
		int toPointX = Integer.parseInt(toPoint[0]);
		int toPointY = Integer.parseInt(toPoint[1]);

		// 絶対値で計算
		return Math.abs(fromPointX - toPointX)
				+ Math.abs(fromPointY - toPointY);
	}

	private static void calcTotalMoveCount(
			Map<String, List<String>> attributeMap, String coordinates,
			String lastAttribute, int creatures, int moveCount) {

		int totalMoveCount = moveCount;
		if (minMoveCount <= totalMoveCount) {
			return;
		}

		if (creatures == 5) {

			// パチモンが5匹集まっていたら、ゴールへの移動数を足す
			totalMoveCount += calcMoveCount(coordinates, attributeMap.get("G")
					.get(0));
			if (totalMoveCount < minMoveCount) {
				minAttribute = getNextAttribute(lastAttribute);
				minMoveCount = totalMoveCount;
			}

		} else {

			// このターンで獲得できる属性を取得
			String attribute = getNextAttribute(lastAttribute);

			// 次の属性の座標を取得し、再帰的に探索
			for (String nextCoordinates : attributeMap.get(attribute)) {

				totalMoveCount = moveCount
						+ calcMoveCount(coordinates, nextCoordinates);
				calcTotalMoveCount(attributeMap, nextCoordinates, attribute,
						creatures + 1, totalMoveCount);
			}
		}
	}

	private static String getNextAttribute(String attribute) {
		int nextNumber = Integer.parseInt(attribute) + 1;
		if (nextNumber == 6) {
			nextNumber = 1;
		}
		return String.valueOf(nextNumber);
	}
}