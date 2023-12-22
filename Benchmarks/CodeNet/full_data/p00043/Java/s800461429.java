import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		for (String data; (data = br.readLine()) != null; ) {
			String ans = solve(data);
			System.out.println(ans);
		}

	}

	public static String solve(String data) {
		int[] hand = new int[10]; // (0,) 1, 2, 3, ... , 9
		for (int i=0; i < data.length(); i++) {
			char ch = data.charAt(i);
			hand[ch - '0']++;
		}
		StringBuilder ans = new StringBuilder();
		for (int i=1; i <= 9; i++) {
			if ( isWin(hand, i) )
				ans.append(i + " ");
		}
		if (ans.length() == 0) return "0";
		return ans.toString().trim();
	}

	private static boolean isWin(int[] hand13, int tsumo) {
		if (hand13[tsumo] >= 4) return false;
		int[] hand14 = Arrays.copyOf(hand13, hand13.length);
		hand14[tsumo]++;
//		if (hand14[tsumo] > 4) return false;
		return isWin(hand14);
	}

	private static boolean isWin(int[] hand14) {
		atamaloop:
		for (int atama = 1; atama <= 9; atama++) {
			if (hand14[atama] < 2) continue;
			int[] hand = Arrays.copyOf(hand14, hand14.length);
			hand[atama] -= 2;
			int mentsu = 0;
			mentsuloop:
			for (int pai = 1; pai <= 9; pai++) {
				if (hand[pai] == 4) {
					koutsu(hand, pai);
					mentsu++;
					if (shuntsu(hand, pai)) {
						mentsu++;
						if (mentsu == 4) {
							return true;
						} else {
							continue mentsuloop;
						}
					}
					continue atamaloop;
				}
				if (hand[pai] == 3) {
					koutsu(hand, pai);
					mentsu++;
					if (mentsu == 4) {
						return true;
					} else {
						continue mentsuloop;
					}
				}
				if (hand[pai] == 2) {
					if (shuntsu(hand, pai)) {
						mentsu++;
						if (shuntsu(hand, pai)) {
							mentsu++;
							if (mentsu == 4) {
								return true;
							} else {
								continue mentsuloop;
							}
						}
					}
					continue atamaloop;
				}
				if (hand[pai] == 1) {
					if (shuntsu(hand, pai)) {
						mentsu++;
						if (mentsu == 4) {
							return true;
						} else {
							continue mentsuloop;
						}
					}
					continue atamaloop;
				}
				if (hand[pai] == 0) {
					continue mentsuloop;
				}
			}
		}
		return false;
	}

	private static void koutsu(int[] hand, int pai) {
		hand[pai] -= 3;
	}

	private static boolean shuntsu(int[] hand, int pai) {
		if (pai >= 8) return false;
		if (hand[pai] > 0 && hand[pai+1] > 0 && hand[pai+2] > 0) {
			hand[pai]--;
			hand[pai+1]--;
			hand[pai+2]--;
			return true;
		}
		return false;
	}
}