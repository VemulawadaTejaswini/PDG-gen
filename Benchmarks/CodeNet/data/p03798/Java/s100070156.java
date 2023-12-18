import java.util.*;

public class Main {

	private static final char SHEEP = 'S';
	private static final char WOLF = 'W';

	private static final char SAME = 'o';
	private static final char DIFF = 'x';

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final String S = sc.next();

		String ans = null;
		final char[] animals = { SHEEP, WOLF };
		for (int i = 0; i < animals.length; i++) {
			for (int j = 0; j < animals.length; j++) {
				ans = zoo(S, animals[i], animals[j]);
				if (ans != null) {
					System.out.println(ans);
					return;
				}
			}
		}
		System.out.println(-1);
		sc.close();
	}

	private String zoo(String s, char firstAnimal, char secondAnimal) {
		int len = s.length();
		char[] zoo = new char[len];
		zoo[0] = firstAnimal;
		zoo[1] = secondAnimal;
		char expectedZooN = nextAnimal(s.charAt(0), firstAnimal, secondAnimal);

		for (int i = 2; i < s.length(); i++) {
			zoo[i] = nextAnimal(s.charAt(i - 1), zoo[i - 1], zoo[i - 2]);
		}

		if (zoo[len - 1] == expectedZooN && nextAnimal(s.charAt(len - 1), zoo[len - 1], zoo[len - 2]) == zoo[0]) {
			return String.valueOf(zoo);
		} else {
			return null;
		}

	}

	private char other(char animal) {
		switch (animal) {
		case SHEEP:
			return WOLF;
		case WOLF:
			return SHEEP;
		default:
			throw new IllegalArgumentException();
		}
	}

	private char nextAnimal(char msg, char animal, char prevAnimal) {
		switch (animal) {
		case SHEEP:
			if (msg == SAME) {
				return prevAnimal;
			} else if (msg == DIFF) {
				return other(prevAnimal);
			} else {
				throw new IllegalArgumentException();
			}
		case WOLF:
			if (msg == SAME) {
				return other(prevAnimal);
			} else if (msg == DIFF) {
				return prevAnimal;
			} else {
				throw new IllegalArgumentException();
			}
		default:
			throw new IllegalArgumentException();
		}
	}

}