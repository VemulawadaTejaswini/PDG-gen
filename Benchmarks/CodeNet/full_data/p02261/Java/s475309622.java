import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] bCards = new String[Integer.parseInt(br.readLine())];
		String[] sCards = new String[bCards.length];
		String[] strs = br.readLine().split(" ");
		for (int i = 0; i < bCards.length; i++) {
			bCards[i] = strs[i];
			sCards[i] = String.valueOf(bCards[i]);
		}

		bubbleSort(bCards);
		selectionSort(sCards);
		StringBuilder bSb = new StringBuilder();
		StringBuilder sSb = new StringBuilder();
		boolean isStable = true;
		for (int i = 0 ; i < bCards.length; i++) {
			if (i > 0) {
				bSb.append(" ");
				sSb.append(" ");
			}
			bSb.append(bCards[i]);
			sSb.append(sCards[i]);
			if (isStable && !bCards[i].equals(sCards[i])) {
				isStable = false;
			}
		}
		System.out.println(bSb.toString() + "\n" + "Stable");
		if (isStable) {
			System.out.println(sSb.toString() + "\n" + "Stable");
		} else {
			System.out.println(sSb.toString() + "\n" + "Not stable");
		}
	}

	public static void bubbleSort(String[] cards) {
		for (int i = 0; i < cards.length; i++) {
			for (int j = cards.length - 1; j > 0; j--) {
				if (cards[j].charAt(1) < cards[j - 1].charAt(1)) {
					String temp = cards[j];
					cards[j] = cards[j - 1];
					cards[j - 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(String[] cards) {
		for (int i = 0; i < cards.length; i++) {
			int minIdx = i;
			for (int j = i + 1; j < cards.length; j++) {
				if (cards[minIdx].charAt(1) > cards[j].charAt(1)) {
					minIdx = j;
				}
			}
			if (i == minIdx) continue;
			String temp = cards[i];
			cards[i] = cards[minIdx];
			cards[minIdx] = temp;
		}
	}
}