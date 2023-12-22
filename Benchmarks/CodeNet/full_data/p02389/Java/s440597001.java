import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");

		int v = Integer.parseInt(k[0]);
		int v2 = Integer.parseInt(k[1]);
		System.out.print(v * 2 + v2 * 2);
		System.out.print(" " + v * v2);

	}
}