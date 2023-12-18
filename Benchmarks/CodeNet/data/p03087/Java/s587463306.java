import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// n
			scanner.nextInt();
			int q = scanner.nextInt();
			scanner.nextLine();
			String s = scanner.nextLine();
			List<Integer> countList = new ArrayList<>();
			List<Integer> result = new ArrayList<>();
			char[] charArray = s.toCharArray();
			char previous = ' ';
			int count = 0;
			for (int i = 0; i < charArray.length; i++) {
				char current = charArray[i];
				if (('A' == previous) && ('C' == current)) {
					count++;
				}
				previous = current;
				countList.add(count);
			}
			countList.forEach(System.out::println);
			for (int i = 0; i < q; i++) {
				int l = scanner.nextInt();
				int r = scanner.nextInt();
				result.add(countList.get(r - 1) - countList.get(l - 1));
			}
			result.forEach(System.out::println);
		}
	}
}