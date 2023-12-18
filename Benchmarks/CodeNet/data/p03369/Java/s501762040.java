public class Main {

	public static void main(String[] args) {
		int total = 700;

		Scanner scanner = new Scanner(System.in);

		String string = scanner.next();
		string = string.replaceAll("x", "");

		total = 700 + 100*string.length();

		System.out.println(total);

		scanner.close();

	}

}
