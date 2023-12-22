import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br    = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>	cards = null;
		int[]				aHand = null;

		while((aHand = parseHand()) != null) {
			if (cards == null) {
				cards = new ArrayList<Integer>();
				for (int n = 1; n <= 10; n++) {
					cards.add(n);
				}
			}
			else {
				Collections.sort(cards);
			}

			result(cards, aHand);
		}
	}

	private static int[] parseHand() {
		int[]		aHand = null;
		String[]	as    = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					as       = line.split(" ");
					aHand    = new int[3];	
					aHand[0] = Integer.parseInt(as[0]);
					aHand[1] = Integer.parseInt(as[1]);
					aHand[2] = Integer.parseInt(as[2]);
				}
			}
		}
		catch (NumberFormatException e) {}
		catch (IOException e) {}

		return aHand;
	}

	private static void result(ArrayList<Integer> cards, int[] aHand) {
		int		sub    = 20 - aHand[0] - aHand[1];
		boolean	border = false;

		if (10 < sub ) {
			border = true;
		}
		else {
			cards.remove((Integer)aHand[0]);
			cards.remove((Integer)aHand[1]);
			cards.remove((Integer)aHand[2]);
			border = (cards.size() / 2 <= cards.indexOf((Integer)sub));
			cards.add((Integer)aHand[0]);
			cards.add((Integer)aHand[1]);
			cards.add((Integer)aHand[2]);
		}

		if (border) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}