import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {
		int i = 0;
		while (i < 1) {
			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();
			String[] k = line.split(" ");
			if (k[1].equals("?")) {
				break;
			}
			int v = Integer.parseInt(k[0]);
			int v2 = Integer.parseInt(k[2]);

			if (k[1].equals("+")) {
				System.out.println(v + v2);
			}
			if (k[1].equals("-")) {
				System.out.println(v - v2);
			}
			if (k[1].equals("*")) {
				System.out.println(v * v2);
			}
			if (k[1].equals("/")) {
				System.out.println(v / v2);
			}
		}

	}
}