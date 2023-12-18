public class Main {
	public static void main(String[] args) {
		final String input = args[0];
		for (int i = 0; i < input.length(); i++)
			System.out.print(input.charAt(i) == ',' ? ' ' : input.charAt(i));
	}
}