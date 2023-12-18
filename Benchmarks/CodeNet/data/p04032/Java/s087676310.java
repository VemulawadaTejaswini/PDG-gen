import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> s = Arrays.asList(scanner.next().split(""));

		for(int i = 0 ; i < s.size() ; i++) {
			String tmp = s.get(i);
			for(int j = i ; j < s.size() ; j++) {
				List<String> t = s.subList(i, j + 1);
				if (t.size() >= 2 && (t.stream().filter(u -> u.equals(tmp)).count() > t.size() / 2)) {
					System.out.println((i + 1) + " " + (j + 1));
					return;
				}
			}
		}

		System.out.println("-1 -1");

		scanner.close();
	}
}
