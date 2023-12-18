public class Main {

	public static void main(String[] args) {

		Integer input = Integer.parseInt(args[0]);

		if (input > 32 || input < 1) {
			throw new IllegalArgumentException();
		}

		int[] answers = { 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1,
				4, 1, 51 };
		System.out.println(answers[input - 1]);

	}

}
