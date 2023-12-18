import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readCard(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		M = Integer.parseInt(strArr[1]);
	}

	int M;

	public void readCard(String str) {
		Card = new TreeMap<Integer, Integer>();
		String[] strArr = str.split(" ");
		for (int i = 0; i < N; i++) {
			int card = Integer.parseInt(strArr[i]);
			addCard(card, 1);
		}
	}

	TreeMap<Integer, Integer> Card;

	private void addCard(int card, int num) {
		if (Card.containsKey(card))
			Card.put(card, Card.get(card) + num);
		else
			Card.put(card, num);
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < M;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		int b = Integer.parseInt(strArr[0]);
		int c = Integer.parseInt(strArr[1]);
		for (int last = b; last > 0;) {
			int chg = 0;
			int chgCard = 0;
			for (int card : Card.keySet()) {
				if (card >= c)
					last = 0;
				if (last <= 0)
					break;
				chg = Integer.min(last, Card.get(card));
				if (chg > 0) {
					chgCard = card;
					break;
				}
			}
			if (chg > 0) {
				addCard(chgCard, -1 * chg);
				addCard(c, chg);
				last -= chg;
			}
		}

		cnt++;
	}

	public void solve() {
		long ans = 0;
		for (int card : Card.keySet()) {
			// System.out.println(card + " " + Card.get(card));
			ans += ((long) card * (long) Card.get(card));
		}
		System.out.println(ans);
	}
}
