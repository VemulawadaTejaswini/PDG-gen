import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) {
				break;
			}

			boolean[] cards = new boolean[2 * n + 1];
			TreeSet<Integer> taro, hana, turn;
			taro = new TreeSet<Integer>();
			hana = new TreeSet<Integer>();
			//配る
			for (int i = 0; i < n; i++) {
				cards[Integer.parseInt(br.readLine())] = true;
			}
			for (int i = 1; i < cards.length; i++) {
				if (cards[i]) {
					taro.add(i);
				} else {
					hana.add(i);
				}
			}
			//遊ぶ
			int deck = 0;
			turn = taro;
			while (true) {
				if (turn.ceiling(deck) != null) {
					deck = turn.ceiling(deck);
					turn.remove(deck);
				} else {
					deck = 0;
				}
				if (turn.size() == 0) {
					break;
				}
				if (turn == taro) {
					turn = hana;
				} else {
					turn = taro;
				}
			}
			System.out.println(hana.size() + "\n" + taro.size());
		}
	}
}