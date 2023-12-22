import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = stdIn.readLine()) != null) {
			int pcs = Integer.valueOf(s);
			Card[] mine = new Card[pcs];
			for (int i = 0; i < pcs; i++) {
				mine[i] = new Card(stdIn.readLine());
			}
			for (int m = 0; m < 4; m++)
				for (int r = 1; r <= 13; r++)
					doMain(m, r, mine);
		}
		System.exit(0);
	}

	private static void doMain(int mark, int rank, Card[] mine) {
		for (int i = 0; i < mine.length; i++)
			if (mine[i].isEqual(mark, rank))
				return;
		switch (mark) {
		case (0):
			System.out.println("S " + rank);
			break;
		case (1):
			System.out.println("H " + rank);
			break;
		case (2):
			System.out.println("C " + rank);
			break;
		case (3):
			System.out.println("D " + rank);
			break;
		}
	}
}

class Card {
	public Card(String s) {
		String[] se = s.split(" ");
		switch (se[0]) {
		case ("S"):
			mark = 0;
			break;
		case ("H"):
			mark = 1;
			break;
		case ("C"):
			mark = 2;
			break;
		case ("D"):
			mark = 3;
			break;
		}
		rank = Integer.valueOf(se[1]);
	}

	public boolean isEqual(int mark2, int rank2) {
		if (mark == mark2 && rank == rank2)
			return true;
		else
			return false;
	}

	private int mark;
	private int rank;
}