import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	/** ゲームごとの情報のリスト */
	private static List<Game> gameList = new ArrayList<Game>();

	/** スタート地点を表す文字 */
	private static final String START = "S";

	public static void main(String[] args) throws IOException {

		// 入力値の読み込み
		setMapOnGames();

		for (Game game : gameList) {

			// 各属性が座標のどこにいるかを求める
			setAttributeMap(game);

			// すべての属性がそろっていない場合は、"NA"を出力
			if (game.attributeMap.keySet().size() != 7) {
				System.out.println("NA");
				continue;
			}

			// 次の属性までの移動数を求める
			setCountMap(game);


			// 移動数が最小となるスタート時の属性と移動数を求める
			String minAttribute = null;
			int minMoveCount = Integer.MAX_VALUE;
			for (int i = 1; i <= 5; i++) {
				String startAttribute = String.valueOf(i);
				int totalMoveCount = calcTotalMoveCount(game, game.attributeMap
						.get(START).get(0), String.valueOf(i), 1);

				if (totalMoveCount < minMoveCount) {
					minAttribute = startAttribute;
					minMoveCount = totalMoveCount;
				}
			}
			System.out.println(minAttribute + " " + minMoveCount);
		}
	}

	/**
	 * <p>
	 * 入力値を取得し、Gameクラスにセットする
	 * </p>
	 *
	 * @throws IOException
	 */
	private static void setMapOnGames() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {

			Game game = new Game();

			// 空のマップを作成する
			String[] mapSize = line.split(" ");
			int sizeX = Integer.parseInt(mapSize[0]);
			int sizeY = Integer.parseInt(mapSize[1]);
			String[][] map = new String[sizeY][sizeX];

			// マップの情報をセットする
			for (String[] xMap : map) {
				String xLine = br.readLine();
				for (int i = 0; i < sizeX; i++) {
					xMap[i] = String.valueOf(xLine.charAt(i));
				}
			}

			game.map = map;
			gameList.add(game);
		}
	}

	private static void setAttributeMap(Game game) {

		// マップから、各属性が存在する座標を取り出し、属性存在Mapに退避する
		int y = 0;
		for (String[] xMap : game.map) {
			int x = 0;
			for (String str : xMap) {
				if (!".".equals(str)) {
					if (!game.attributeMap.containsKey(str)) {
						game.attributeMap.put(str, new ArrayList<String>());
					}
					game.attributeMap.get(str).add(x + "," + y);
				}
				x++;
			}
			y++;
		}

	}

	private static void setCountMap(Game game) {

		for (Entry<String, List<String>> entry : game.attributeMap.entrySet()) {

			if (START.equals(entry.getKey())) {
				String coordinates = entry.getValue().get(0);
				game.countMap.put(coordinates, new HashMap<String, Integer>());

				// 移動元がスタート地点の場合は、ゴール以外のすべての座標までの移動数を求める
				for (int i = 1; i <= 5; i++) {
					List<String> nextCoordinatesList = game.attributeMap
							.get(String.valueOf(i));

					for (String nextCoordinates : nextCoordinatesList) {
						int moveCount = calcMoveCount(coordinates,
								nextCoordinates);
						game.countMap.get(coordinates).put(nextCoordinates,
								moveCount);
					}
				}

			} else if ("G".equals(entry.getKey())) {

				// 移動元がゴール地点の場合は何もしない（ゴールを開始とする移動はないため）

			} else {

				// 移動元がスタート地点でもゴール地点でもない場合は、
				// 次の属性が存在する座標に移動するための移動数を求める

				// 移動元
				String key = entry.getKey();
				List<String> coordinatesList = entry.getValue();

				// 移動先
				String nextKey = getNextAttribute(key);
				List<String> nextCoordinatesList = game.attributeMap
						.get(nextKey);

				for (String coordinates : coordinatesList) {

					game.countMap.put(coordinates,
							new HashMap<String, Integer>());
					for (String nextCoordinates : nextCoordinatesList) {
						game.countMap.get(coordinates).put(nextCoordinates,
								calcMoveCount(coordinates, nextCoordinates));
					}
				}
			}
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

	private static int calcTotalMoveCount(Game game, String coordinates,
			String lastAttribute, int creatures) {

		int totalMoveCount = Integer.MAX_VALUE;

		if (creatures == 5) {

			// パチモンが5匹集まっていたら、ゴールへの移動数を足して返す
			totalMoveCount = calcMoveCount(coordinates,
					game.attributeMap.get("G").get(0));

		} else {

			// このターンで獲得できる属性を取得
			String attribute = getNextAttribute(lastAttribute);

			// 次の属性の座標を取得し、再帰的に探索
			for (String nextCoordinates : game.attributeMap.get(attribute)) {
				int tmpMoveCount = calcMoveCount(coordinates, nextCoordinates)
						+ calcTotalMoveCount(game, nextCoordinates, attribute,
								creatures + 1);
				if (tmpMoveCount < totalMoveCount) {
					totalMoveCount = tmpMoveCount;
				}
			}
		}

		return totalMoveCount;
	}

	private static String getNextAttribute(String attribute) {
		int nextNumber = Integer.parseInt(attribute) + 1;
		if (nextNumber == 6) {
			nextNumber = 1;
		}
		return String.valueOf(nextNumber);
	}

	private static class Game {

		/** マップを表す配列 */
		private String[][] map;

		/** 各属性がどこに存在するかのMap */
		private Map<String, List<String>> attributeMap = new HashMap<String, List<String>>();

		/** 座標から座標への移動数を表すマップ */
		private Map<String, Map<String, Integer>> countMap = new HashMap<String, Map<String, Integer>>();

	}
}