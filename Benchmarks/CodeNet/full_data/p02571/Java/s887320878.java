import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < s.length() - t.length() + 1; i++) {

			int count = 0;
			for (int j = 0; j < t.length(); j++) {
				if (t.charAt(j) != s.charAt(i + j)) {
					count++;
				}

			}
			list.add(count);

		}

		int minReplace = list.stream().mapToInt(x -> x).min().getAsInt();

		System.out.println(minReplace);

	}
}