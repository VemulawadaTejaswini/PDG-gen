import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");
		int v = Integer.parseInt(k[0]);
		int v2 = Integer.parseInt(k[1]);
		if (v == v2) {
			System.out.println("a == b");
		} else if (v > v2) {
			System.out.println("a > b");
		} else if (v < v2) {
			System.out.println("a < b");
		}

	}
}