import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String slimeStr = sc.next();
		List<Character> slime = new ArrayList<Character>();

		for (int i = 0; i < slimeStr.length(); i++) {
			slime.add(slimeStr.charAt(i));
		}

		char color = slime.get(0);
		int ans = 1;

		for (int i = 1; i < num; i++) {
			if (color == slime.get(i)) {
				continue;
			}
			color = slime.get(i);
			ans += 1;
		}
		System.out.println(ans);
	}
}