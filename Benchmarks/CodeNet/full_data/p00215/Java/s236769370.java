import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main {

	public static void main(String... args) {
		
		for (List<String> mapStrings : getMapStringsList()) {
			if (mapStrings.isEmpty()) {
				break;
			}
			// マップの文字列をもとに全ての座標を生成する
			Coordinates coordinates = new Coordinates(mapStrings);
			
			// ゴールまでの最短経路を探索して出力する
			PachimonCreaturePlayer player = new PachimonCreaturePlayer();
			player.completeGame(coordinates);
			player.output();
		}

	}
	
	static class PachimonCreaturePlayer {
		
		private PachimonType firstType; // 最初に選ぶべきパチクリの属性
		private int minCost = Integer.MAX_VALUE; // 最小移動数（最大値で初期化しておく）
		
		void completeGame(Coordinates coordinates) {
			
			// 捕まえるパチクリの属性の順番と、最初に選ぶパチクリの属性を生成する
			// （例：「火」⇒「氷」⇒「木」⇒「土」の順で捕まえる場合、順番の最後の属性「水」が最初に選ぶパチクリの属性となる）
			List<PachimonType> typeList = PachimonType.getPachimonTypeList();
			LinkedList<PachimonType> orderToCatch = new LinkedList<PachimonType>();
			for (PachimonType type : typeList) {
				orderToCatch.add(type);
			}
			
			// 最初に選ぶパチクリの属性パターンすべてについて、
			// 順番通りにパチクリを捕まえていったときの最小移動数を取得する
			for (int i = 0; i < typeList.size(); i++) {
				int cost = getMinCostWithPachimonType(coordinates, orderToCatch);
				if (0 < cost && cost < this.minCost) {
					// 現在保持している最小移動数より小さい場合にはそちらで上書きする
					this.minCost = cost;
					this.firstType = orderToCatch.peekLast();
				} else if (0 < cost && cost == this.minCost) {
					// 現在保持している最小移動数と同じ場合は、属性の数字を比較して小さい方を保持する
					PachimonType type = orderToCatch.peekLast();
					this.firstType = (this.firstType.getValue() < type.getValue()) ? this.firstType : type;
				}
				// 捕まえる属性の順番を1つずらす
				PachimonType head = orderToCatch.poll();
				orderToCatch.add(head);
			}
		}
		
		private int getMinCostWithPachimonType(Coordinates coordinates, List<PachimonType> orderToCatch) {

			// スタート位置の座標をルートノードとする
			Node startNode = new Field(coordinates.getStart(), 0, 0);

			// 属性ごとに全ての座標を取得し、スタート位置を頂点とする木構造を構築する
			// （レベル0・・・スタート位置の座標、レベル1・・・属性Aのパチクリの全座標、レベル2・・・属性Bのパチクリの全座標　・・・）
			for (int i = 0; i < orderToCatch.size() - 1; i++) {
				List<Coordinate> coordinatesOfType = coordinates.getTypeList(orderToCatch.get(i));
				if (coordinatesOfType.isEmpty()) {
					// 捕まえられるパチクリがいない場合
					return 0;
				}
				for (Coordinate coordinate : coordinatesOfType) {
					startNode.add(coordinate, i + 1);
				}
			}
			
			// ゴール位置の座標をリーフとする
			startNode.add(coordinates.getGoal(), orderToCatch.size());
			
			// スタート（ルート）からゴール（リーフ）までの木構造を辿り、最小移動数を返す
			return startNode.getMinCostToGoal();
		}

		void output() {
			if (this.minCost == Integer.MAX_VALUE) {
				System.out.println("NA");
			} else {
				System.out.println(this.firstType.getValue() + " " + this.minCost);
			}
		}
	}
	
	/**
	 * 移動経路を構成する木構造の各ノードを表現するクラス
	 */
	static abstract class Node {
		protected int level; // 木構造における本ノードのレベル
		protected int costFromStart; // スタート位置（ルート）からの移動数
		protected Coordinate coordinate; // 本ノードのマップ上における座標

		Node(Coordinate coordinate, int level, int costFromStart) {
			this.coordinate = coordinate;
			this.level = level;
			this.costFromStart = costFromStart;
		}

		void add(Coordinate coordinate, int level) {
			throw new UnsupportedOperationException();
		}

		abstract int getMinCostToGoal();
	}

	/**
	 * ノードのうち、ゴール位置以外のノードを表現するクラス。子ノードを持つ。
	 */
	static class Field extends Node {
		private List<Node> childNodes = new ArrayList<Node>(); // 子ノード

		Field(Coordinate coordinate, int level, int costFromStart) {
			super(coordinate, level, costFromStart);
		}

		void add(Coordinate coordinate, int level) {
			if (level - this.level == 1) {
				// 自分の直下レベルであれば自分の子ノードに追加する
				int cost = this.coordinate.calcCost(coordinate) + this.costFromStart;
				this.childNodes.add(coordinate.isGoal ? new Goal(coordinate, level, cost) : new Field(coordinate, level, cost));
				return;
			}

			// それより下のレベルであれば全ての子ノードに処理を委譲
			for (Node childNode : childNodes) {
				childNode.add(coordinate, level);
			}
		}

		@Override
		int getMinCostToGoal() {
			// 全ての子ノードを辿ってゴール（リーフ）までの移動数を取得し、そのうちの最小のものを返す
			List<Integer> list = new ArrayList<Integer>();
			for (Node node : this.childNodes) {
				list.add(node.getMinCostToGoal());
			}
			return Collections.min(list);
		}
	}

	/**
	 * ノードのうち、ゴール位置を表現するクラス。子ノードを持たない。
	 */
	static class Goal extends Node {
		Goal(Coordinate coordinates, int level, int costFromStart) {
			super(coordinates, level, costFromStart);
		}

		@Override
		int getMinCostToGoal() {
			return this.costFromStart;
		}
	}

	/**
	 * 全ての座標を保持するクラス
	 */
	static class Coordinates {
		private Coordinate start; // スタートの座標
		private Coordinate goal; // ゴールの座標
		// 属性をキーとし、その属性のパチクリの位置座標リストを値として持つMap
		private Map<PachimonType, List<Coordinate>> pachimonCoordinatesMap = new HashMap<PachimonType, List<Coordinate>>();

		Coordinates(List<String> lines) {
			// 全属性分の位置座標リストを用意してMapに格納する
			List<PachimonType> pachimonTypeList = PachimonType.getPachimonTypeList();
			for (PachimonType type : pachimonTypeList) {
				this.pachimonCoordinatesMap.put(type, new ArrayList<Coordinate>());
			}
			
			// マップを走査してスタート、ゴール、パチクリの全座標を取得して格納する
			int y = 0;
			for (String line : lines) {
				int x = 0;
				for (char c : line.toCharArray()) {
					String str = String.valueOf(c);
					if (str.equals("S")) {
						this.start = new Coordinate(x, y);
					} else if (str.equals("G")) {
						this.goal = new Coordinate(x, y, true);
					} else if (str.equals(".")) {
						// なにもしない
					} else {
						PachimonType type = PachimonType.valueOf(Integer.parseInt(str));
						Coordinate coordinates = new Coordinate(x, y);
						this.pachimonCoordinatesMap.get(type).add(coordinates);
					}
					x++;
				}
				y++;
			}
		}

		Coordinate getStart() {
			return this.start;
		}
		Coordinate getGoal() {
			return this.goal;
		}
		List<Coordinate> getTypeList(PachimonType type) {
			// 指定された属性のパチクリの座標リストを返す
			return this.pachimonCoordinatesMap.get(type);
		}
	}

	/**
	 * 座標を表現するクラス
	 */
	static class Coordinate {
		private int x;
		private int y;
		private boolean isGoal; // ゴールの座標か否か

		Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		Coordinate(int x, int y, boolean isGoal) {
			this.x = x;
			this.y = y;
			this.isGoal = isGoal;
		}

		int calcCost(Coordinate another) {
			// 渡された座標に移動するまでのコスト（移動数）を計算して返す
			int xCost = Math.abs(another.x - this.x);
			int yCost = Math.abs(another.y - this.y);
			return xCost + yCost;
		}
		
		boolean isGoal() {
			return this.isGoal;
		}
	}

	/**
	 * パチクリの属性を表現するクラス
	 */
	enum PachimonType {
		FIRE(1), ICE(2), WOOD(3), EARTH(4), WATER(5);
		PachimonType(int i) {
			this.value = i;
		}
		private int value;
		int getValue() {
			return this.value;
		}
		static PachimonType valueOf(int i) {
			if (i == FIRE.value)
				return FIRE;
			else if (i == ICE.value)
				return ICE;
			else if (i == WOOD.value)
				return WOOD;
			else if (i == EARTH.value)
				return EARTH;
			else if (i == WATER.value)
				return WATER;
			else
				throw new IllegalArgumentException();
		}
		@SuppressWarnings("serial")
		static List<PachimonType> getPachimonTypeList() {
			return new ArrayList<PachimonType>() {{
				add(FIRE); add(ICE); add(WOOD); add(EARTH); add(WATER);
			}};
		}
	}

	static List<List<String>> getMapStringsList() {
		
		List<List<String>> mapStringsList = new ArrayList<List<String>>();
		Scanner scanner = null;
		List<String> inputList = new ArrayList<String>();
		try {
			scanner = new Scanner(System.in);
			while (scanner.hasNext()) {
				inputList.add(scanner.nextLine());
			}
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

		int startLineNumber = 0; // マップの読み取りを開始する行番号
		int mapLineSize = Integer.parseInt(inputList.get(0).split(" ")[1]); // マップの行数
		
		// 入力された文字列からデータセットごとにマップを取り出してListに格納する
		while (true) {
			List<String> mapStrings = getMapStrings(inputList, startLineNumber, mapLineSize);
			if (mapStrings.isEmpty()) {
				break;
			}
			mapStringsList.add(mapStrings);
			
			// 次に読み取るデータセット用に更新
			startLineNumber = startLineNumber + mapLineSize + 1;
			mapLineSize = Integer.parseInt(inputList.get(startLineNumber).split(" ")[1]); // マップの行数
		}
		return mapStringsList;
	}
	
	static List<String> getMapStrings(List<String> inputList, int startLineNumber, int mapLineSize) {
		List<String> list = new ArrayList<String>();
		if (mapLineSize == 0) {
			// 入力の終り
			return list;
		}
		for (int i = 1; i <= mapLineSize; i++) {
			list.add(inputList.get(i + startLineNumber));
		}
		return list;
	}
}