public class Main {

	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);

		int c = 0;

		for (int j = 1; j > 0; j++) {
			c = c + j;

			if (c % n == 0) {
				break;
			}

		}

		System.out.println(c);

	}

}