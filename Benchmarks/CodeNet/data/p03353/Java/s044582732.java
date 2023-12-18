import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int K = scanner.nextInt();

		HashMap<String, Boolean> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				hm.put(s.substring(i, j), true);
			}
		}
		TreeSet<String> strings = new TreeSet<>(hm.keySet());
		System.out.println(((String[]) strings.toArray(new String[strings.size()]))[K - 1]);
	}

}

