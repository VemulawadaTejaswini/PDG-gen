public class Main {

	/**
	 * AOJ:QQ
	 * @param args
	 */

	static final String MULTIPLE = "x";
	static final String EQUAL = "=";

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + MULTIPLE + i + EQUAL + i * i);
		}
	}

}