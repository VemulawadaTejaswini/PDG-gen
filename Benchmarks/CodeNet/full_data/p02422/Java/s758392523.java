import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);

		String string = sc.nextLine();
		int q = Integer.parseInt(string);

		for (int i = 0; i < q; i++) {
			String line = sc.nextLine();
			String[] order = line.split(" ");
			int a = Integer.parseInt(order[1]);
			int b = Integer.parseInt(order[2]) + 1;

			if (order[0].equals("print")) {
				System.out.println(sb.substring(a, b));
			} else if (order[0].equals("reverse")) {
				StringBuilder SB = new StringBuilder(sb.substring(a, b));
				sb.replace(a, b, (SB.reverse().toString()));
			} else if (order[0].equals("replace")) {
				sb.replace(a, b, order[3]);
			}
		}
	}

}