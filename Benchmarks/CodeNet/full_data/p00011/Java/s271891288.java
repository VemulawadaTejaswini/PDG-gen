import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {

		// ストリームを作成する
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int vertical = readNumber(reader);
		int horizontal = readNumber(reader);

		// 横棒リストを作る
		List<int[]> horizontalList = new ArrayList<int[]>();
		for (int i = 0; i < horizontal; i++) {
			horizontalList.add(readPair(reader));
		}

		// 縦棒を左から順番にシミュレートして結果を配列に保持する
		int[] goal = new int[vertical];
		for (int i = 1; i <= vertical; i++) {
			int result = i;
			for (int[] horizontalBar : horizontalList) {
				if (result == horizontalBar[0]) {
					result = horizontalBar[1];
				} else if (result == horizontalBar[1]) {
					result = horizontalBar[0];
				}
			}
			goal[result - 1] = i;
		}

		// 結果を表示する
		for (int i : goal) {
			System.out.println(i);
		}

	}

	/**
	 * ストリームから1行読み込んで、数値として返す。
	 *
	 * @param reader
	 *            入力ストリーム
	 * @return 数値
	 */
	private static int readNumber(BufferedReader reader) {
		int result = 0;
		try {
			String line = reader.readLine();
			result = Integer.parseInt(line);
		} catch (IOException e) {
			throw new RuntimeException();
		}
		return result;
	}

	/**
	 * ストリームから1行読み込んで、数値のペアとして返す。
	 *
	 * @param reader
	 *            入力ストリーム
	 * @return 数値のペア
	 */
	private static int[] readPair(BufferedReader reader) {
		int[] result = new int[2];
		try {
			String line = reader.readLine();
			String[] array = line.split(",");
			result[0] = Integer.parseInt(array[0]);
			result[1] = Integer.parseInt(array[1]);
		} catch (IOException e) {
			throw new RuntimeException();
		}
		return result;
	}

}