import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] s = scanner.next().split("");
		ArrayList<String> ans = new ArrayList();

		for (String typing : s ) {
			switch (typing) {
			case "0":
			case "1":
				ans.add(typing);
				break;
			case "B":
				if (ans.size() > 0) {
					ans.remove(ans.size() - 1);
				}
				break;
			default:
				break;
			}
		}

		ans.stream().forEach(System.out::print);
		scanner.close();
	}
}
