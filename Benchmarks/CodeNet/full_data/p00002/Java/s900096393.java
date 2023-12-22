import java.util.Scanner;

class Main {
	public static void main(String[] a) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int sum = scanner.nextInt() + scanner.nextInt();
			System.out.println(String.valueOf(sum).length());
			
		}
	}
}