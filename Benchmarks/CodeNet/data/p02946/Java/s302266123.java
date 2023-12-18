import java.util.Scanner;

public class OneClue {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String[] firstLine = scan.nextLine().split(" ");
		int k = Integer.valueOf(firstLine[0]);
		int x = Integer.valueOf(firstLine[1]);
		StringBuilder sb = new StringBuilder();

		for (int i = k - x + 1; i < k + x; i++) {
			sb.append(i + " ");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
