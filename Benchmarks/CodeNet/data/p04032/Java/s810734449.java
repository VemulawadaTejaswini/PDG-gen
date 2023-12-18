import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> s = Arrays.asList(scanner.next().split(""));

		for(int i = 0 ; i < s.size() ; i++) {
			String tmp = s.get(i);
			List<String> t = s.subList(i, i + 3);
			if (t.stream().filter(u -> u.equals(tmp)).count() > t.size() / 2) {
				System.out.println((i + 1) + " " + (i + 3));
				return;
			}
		}

		System.out.println("-1 -1");

		scanner.close();
	}
}
