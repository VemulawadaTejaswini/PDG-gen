import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		boolean[][] cards = new boolean[4][13];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String line;
		while ((line = br.readLine()) != null) {
			String[] arr = line.split(" ");
			String suit = arr[0];
			int num = Integer.parseInt(arr[1]);

			cards[getIndex(suit)][num - 1] = true;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (!cards[i][j])
					System.out.println(getSuit(i) + " " + (j + 1));
			}
		}
	}

	private static int getIndex(String suit) {
		if ("S".equals(suit))
			return 0;
		else if ("H".equals(suit))
			return 1;
		else if ("C".equals(suit))
			return 2;
		else if ("D".equals(suit))
			return 3;

		throw new RuntimeException();
	}

	private static String getSuit(int index) {
		final String[] suits = { "S", "H", "C", "D" };
		return suits[index];
	}
}