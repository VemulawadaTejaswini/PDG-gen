import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//安定なソート
public class Main {

	public static void main(String[] args) {
		// 入力値の取得
		try (
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split("\\s");
			ArrayList<Card> bubList = new ArrayList<>(); // バブルソート用
			for (int i = 0; i < n; i++) {
				char suit = s[i].charAt(0);
				int num = Integer.parseInt(s[i].substring(1, 2));
				Card card = new Card(suit, num);
				bubList.add(card);
			}
			ArrayList<Card> selList = new ArrayList<>(bubList); // 選択ソート用（複製）
			// ソートの実行
			Main.bubbleSort(bubList);
			Main.selectionSort(selList);
			// 結果の表示
			Main.displayCard(bubList);
			System.out.println("Stable");
			Main.displayCard(selList);
			String ans = Main.isStable(bubList, selList) ? "Stable" : "Not stable";
			System.out.println(ans);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// バブルソート
	static int bubbleSort(ArrayList<Card> cl) {
		int cnt = 0;
		for (int i = 0; i < cl.size(); i++) {
			for (int j = cl.size() - 1; i + 1 <= j; j--) {
				// 1つ前のカードの数字の方が大きい場合
				if (cl.get(j).num < cl.get(j - 1).num) {
					cnt++;
					Card tmp = cl.get(j);
					cl.set(j, cl.get(j - 1));
					cl.set(j - 1, tmp);
				}
			}

		}
		return cnt;

	}

	// 選択ソート
	static int selectionSort(ArrayList<Card> cl) {
		int cnt = 0;
		for (int i = 0; i < cl.size(); i++) {
			int mini = i;
			for (int j = i + 1; j < cl.size(); j++) {
				if (cl.get(mini).num > cl.get(j).num) {
					mini = j;
				}
			}
			if (i != mini) {
				cnt++;
				Card tmp = cl.get(mini);
				cl.set(mini, cl.get(i));
				cl.set(i, tmp);
			}
		}

		return cnt;

	}

	// 配列の要素表示
	static void displayCard(ArrayList<Card> cl) {
		cl.get(0).showCard();
		for (int i = 1; i <= cl.size() - 1; i++) {
			System.out.print(" ");
			cl.get(i).showCard();
			if (i == cl.size() - 1) { // 最後の一回
				System.out.println();
			}
		}
	}

	// バブルソートと選択ソートの結果を比較
	static boolean isStable(ArrayList<Card> in, ArrayList<Card> out) {
		for (int i = 0; i < in.size(); i++) {
			if (in.get(i) != out.get(i)) {
				return false;
			}
		}
		return true;
	}

}

class Card {
	char suit; // 絵柄（H:ハート、D:ダイヤ、S:スペード、C:クラブ）
	int num; // 番号

	// コンストラクター
	Card(char suit, int num) {
		this.suit = suit;
		this.num = num;
	}

	void showCard() {
		System.out.print("" + suit + num); // 文字列連結でString型に
	}

}

