import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	/** 計算精度（double と同程度にしておく） */
	private static final int SCALE = 16;

	/** 出力文字列のマップ */
	private static final Map<Boolean, String> printMap = new HashMap<Boolean, String>();;
	static {
		printMap.put(true, "YES");
		printMap.put(false, "NO");
	}

	/**
	 * 空白区切りの6つの数字を受け取り、 その6つの数字を3点とする三角形の外心および外接円の半径を取得する。
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// 入力値をリストで受け取る
		List<BigDecimal[]> inputData = readInputData();

		for (BigDecimal[] inputList : inputData) {

			// 三角形クラス、点クラスに値を設定する
			Triangle triangle = new Triangle(inputList[0], inputList[1],
					inputList[2], inputList[3], inputList[4], inputList[5]);
			Point point = new Point(inputList[6], inputList[7]);

			// 三角形を内包するかどうか判定する
			boolean contains = triangle.containsPoint(point);

			// 結果を出力する
			System.out.println(printMap.get(contains));
		}

	}

	/**
	 * 標準入力から空白区切りの数値を取得し、三角形と点を表す数値の2次元配列として返却する。
	 *
	 * @return 三角形と点を表す数値の2次元配列（8×データ数）
	 */
	protected static List<BigDecimal[]> readInputData() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		List<BigDecimal[]> inputData = new ArrayList<BigDecimal[]>();
		String line = null;
		while ((line = reader.readLine()) != null) {

			// 1行につき、8データずつ取り込む
			final int NUMBER_OF_ELEMENT = 8;
			BigDecimal[] inputArray = new BigDecimal[NUMBER_OF_ELEMENT];
			String[] lengthArray = line.split(" ");
			for (int i = 0; i < lengthArray.length; i++) {
				inputArray[i] = new BigDecimal(lengthArray[i]);
			}
			inputData.add(inputArray);
		}

		if (reader != null) {
			reader.close();
		}

		return inputData;
	}

	/**
	 * 三角形を表すクラス
	 *
	 */
	static class Triangle {

		/** 点A */
		private Point a;

		/** 点B */
		private Point b;

		/** 点C */
		private Point c;

		/**
		 * コンストラクタ
		 *
		 * @param points
		 *            座標を表す数値配列
		 */
		public Triangle(final BigDecimal x1, final BigDecimal y1,
				final BigDecimal x2, final BigDecimal y2, final BigDecimal x3,
				final BigDecimal y3) {
			a = new Point(x1, y1);
			b = new Point(x2, y2);
			c = new Point(x3, y3);
		}

		/**
		 * 点が三角形の内部に含まれるかどうかを求める。
		 *
		 * @param point
		 *            調査対象の点
		 * @return 含まれるなら true、そうでないなら false
		 */
		public boolean containsPoint(Point point) {

			// 元の三角形の面積を求める
			final BigDecimal originalArea = calculateArea();

			// 新しい点をベースに3つの三角形を作り、それぞれの面積の合計を求める
			final Triangle triangleAB = new Triangle(point.getX(),
					point.getY(), a.getX(), a.getY(), b.getX(), b.getY());
			final Triangle triangleBC = new Triangle(point.getX(),
					point.getY(), b.getX(), b.getY(), c.getX(), c.getY());
			final Triangle triangleAC = new Triangle(point.getX(),
					point.getY(), a.getX(), a.getY(), c.getX(), c.getY());
			final BigDecimal newArea = triangleAB.calculateArea()
					.add(triangleBC.calculateArea())
					.add(triangleAC.calculateArea());

			// 新しい面積の合計が元の三角形の面積と同じ場合は、点は内部にある
			return newArea.compareTo(originalArea) <= 0;
		}

		/**
		 * この三角形の面積を求める。
		 *
		 * @return 三角形の面積
		 */
		public BigDecimal calculateArea() {

			// 点A を原点に移動し、点B と 点C から面積を求める
			final BigDecimal x1 = b.getX().subtract(a.getX());
			final BigDecimal y1 = b.getY().subtract(a.getY());
			final BigDecimal x2 = c.getX().subtract(a.getX());
			final BigDecimal y2 = c.getY().subtract(a.getY());

			final BigDecimal TWO = BigDecimal.valueOf(2);
			final BigDecimal area = x1.multiply(y2).subtract(y1.multiply(x2))
					.divide(TWO, SCALE, RoundingMode.HALF_EVEN).abs();
			return area;
		}

		public Point getA() {
			return a;
		}

		public void setA(Point a) {
			this.a = a;
		}

		public Point getB() {
			return b;
		}

		public void setB(Point b) {
			this.b = b;
		}

		public Point getC() {
			return c;
		}

		public void setC(Point c) {
			this.c = c;
		}

	}

	/**
	 * 平面座標を表すクラス
	 *
	 */
	static class Point {

		/** x座標 */
		private BigDecimal x;

		/** y座標 */
		private BigDecimal y;

		/**
		 * コンストラクタ
		 *
		 * @param x
		 *            x座標
		 * @param y
		 *            y座標
		 */
		public Point(final BigDecimal x, final BigDecimal y) {
			this.x = x;
			this.y = y;
		}

		public BigDecimal getX() {
			return x;
		}

		public void setX(BigDecimal x) {
			this.x = x;
		}

		public BigDecimal getY() {
			return y;
		}

		public void setY(BigDecimal y) {
			this.y = y;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}

	}

}