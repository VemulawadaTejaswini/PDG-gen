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
			List<Integer> occurList = new ArrayList<>();
			List<Integer> result = new ArrayList<>();
			char[] charArray = s.toCharArray();
			char previous = ' ';
			for (int i = 0; i < charArray.length; i++) {
				char current = charArray[i];
				if (('A' == previous) && ('C' == current)) {
					occurList.add(i);
				}
				previous = current;
			}
			for (int i = 0; i < q; i++) {
				int l = scanner.nextInt();
				int r = scanner.nextInt();
				int count = 0;
				scanner.nextLine();
				for (Integer integer : occurList) {
					if (integer >= l) {
						if (integer <= r - 1) {
							count++;
						} else {
							break;
						}
					}
				}
				result.add(count);
			}
			result.stream().forEach(System.out::println);
		}
	}
}