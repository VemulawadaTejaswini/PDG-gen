import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");
		int a = Integer.parseInt(k[0]);
		int b = Integer.parseInt(k[1]);
		int g = a * b;
		int y = 2 * a + 2 * b;
		System.out.print(g + " " + y);
	}
}