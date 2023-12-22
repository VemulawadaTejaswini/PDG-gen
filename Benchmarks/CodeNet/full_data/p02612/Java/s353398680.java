import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		System.out.println(1000 - Integer.parseInt(string.substring(string.length()-3)));
		scanner.close();
	}
}