import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	/**
	 * <p>
	 * 与えられた三辺で直角三角形が作れるかを判定する。
	 * </p>
	 *
	 * @param args
	 *            利用しない。
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lineCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < lineCount; i++) {

			String line = br.readLine();

			// 三辺の長さをリストに格納し、ソート
			List<Integer> sideList = new ArrayList<Integer>();
			String[] input = line.split(" ");
			sideList.add(Integer.parseInt(input[0]));
			sideList.add(Integer.parseInt(input[1]));
			sideList.add(Integer.parseInt(input[2]));
			Collections.sort(sideList);

			if (isRightTriangle(sideList.get(2), sideList.get(1),
					sideList.get(0))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	/**
	 * 三辺の長さから、直角三角形であるかどうかを判定する。<br>
	 * 注意：第一引数に最も長い辺を与えること。
	 *
	 * @param side1
	 *            辺1
	 * @param side2
	 *            辺2
	 * @param side3
	 *            辺3
	 * @return 直角三角形であるかどうか
	 */
	private static boolean isRightTriangle(int side1, int side2, int side3) {
		return (side1 * side1 == side2 * side2 + side3 * side3);
	}
}