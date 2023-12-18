import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String... args) throws IOException {

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line.split(" ")[0]);
		int q = Integer.parseInt(line.split(" ")[1]);

		List<Integer> as = new ArrayList<Integer>();
		line = br.readLine();
		for (String s : line.split(" ")) {
			as.add(Integer.parseInt(s));
		}
		Collections.sort(as);

		List<Integer> xs = new ArrayList<Integer>();
		while ((line = br.readLine()) != null) {
			for (String s : line.split(" ")) {
				xs.add(Integer.parseInt(s));
			}
		}
		br.close();

		for (int gameCount = 0; gameCount < xs.size(); gameCount++) {

			List<Integer> as2 = new ArrayList<Integer>(as);
			int takahashiCsore = 0;
			int aokiTarget = xs.get(gameCount);
			for (int i = 0; i < n; i++) {

				// 高橋ターン
				if (i % 2 == 0) {
					takahashiCsore += as2.get(as2.size() - 1);
					as2.remove(as2.size() - 1);

					// 青木ターン
				} else {

					int index = getAokiIndex(as2, aokiTarget);
					as2.remove(index);
				}

			}
			System.out.println(takahashiCsore);
		}
	}

	private static int getAokiIndex(List<Integer> as2, int aokiTarget) {

		int index = 0;
		int diff = (Math.abs(aokiTarget - as2.get(0)));
		for (int i = 0; i < as2.size(); i++) {

			if (diff > (Math.abs(aokiTarget - as2.get(i)))) {
				diff = Math.abs(aokiTarget - as2.get(i));
				index = i;
			}
		}

		return index;
	}
}