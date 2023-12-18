public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner in = new Scanner(System.in);
		final int a = in.nextInt(), b = in.nextInt();
		boolean result = true;
		if ((a + b) > 16 || a > 8 || b > 8) {
			result = false;
		}
		if (result) System.out.println("Yay!");
		else System.out.println(":(");
	}

}