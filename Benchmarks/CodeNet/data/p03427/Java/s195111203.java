import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String n = scan.nextLine();

		int ans = Integer.parseInt(n.substring(0, 1)) - 1;

		for (int i = 1; i < n.length(); i++) {
			ans = ans + 9;
		}

		System.out.println(ans);
	}
}