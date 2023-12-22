
import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		while (sc.hasNext()) {
			String[] ss = sc.nextLine().split(",");
			int[] hands = new int[5];
			for (int i = 0; i < 5; i++) {
				hands[i] = Integer.parseInt(ss[i]);
			}
			Arrays.sort(hands);
			String res = "null";
			if (isOnePair(hands)) res = "one pair";
			if (isTwoPair(hands)) res = "two pair";
			if (isThreeCard(hands)) res = "three card";
			if (isStraight(hands)) res = "straight";
			if (isFullHouse(hands)) res = "full house";
			if (isFourCard(hands)) res = "four card";
			System.out.println(res);
		}
		
	}
	
	int[] getCount(int[] hands) {
		int[] count = new int[14];
		for (int i = 0; i < hands.length; i++) {
			count[hands[i]]++;
		}
		return count;
	}
	
	private boolean isFourCard(int[] hands) {
		int[] count = getCount(hands);
		for (int i = 1; i <= 13; i++) if (count[i] >= 4) return true;
		return false;
	}
	private boolean isFullHouse(int[] hands) {
		int[] count = getCount(hands);
		int ch = 0;
		for (int i = 1; i <= 13; i++) 
			if (count[i] == 3) ch |= 1;
			else if (count[i] == 2) ch |= 2;
		return ch == 3;
	}
	private boolean isStraight(int[] hands) {
		int k = 0;
		for (int i = 0; i + 1 < hands.length; i++) {
			if (hands[i+1] - hands[i] == 1) {
				k++;
			}
		}
		if (k == 4) return true;
		return hands[0] == 1 && 
				hands[1] == 10 &&
				hands[2] == 11 &&
				hands[3] == 12 &&
				hands[4] == 13;
	}
	private boolean isThreeCard(int[] hands) {
		int[] count = getCount(hands);
		for (int i = 1; i <= 13; i++) if (count[i] >= 3) return true;
		return false;
	}
	private boolean isTwoPair(int[] hands) {
		int[] count = getCount(hands);
		int p = 0;
		for (int i = 1; i <= 13; i++) if (count[i] >= 2) p++;
		return p >= 2;
	}
	private boolean isOnePair(int[] hands) {
		int[] count = getCount(hands);
		for (int i = 1; i <= 13; i++) if (count[i] >= 2) return true;
		return false;
	}
}