
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		Integer ans = 'A' - 'C';
		String input = scanner.nextLine().split(" ")[0];
		List<Integer> list = new ArrayList<>();
		char before = 0;
		char[] chararray = input.toCharArray();
		for (int i = 0; i < chararray.length - 1; i++) {
			list.add(chararray[i] - chararray[i + 1]);
		}
		StringBuilder sb = new StringBuilder();
		String sep = System.lineSeparator();
		while (scanner.hasNext()) {
			String[] area = scanner.nextLine().split(" ");
			int start = Integer.valueOf(area[0]) - 1;
			int end = Integer.valueOf(area[1]) - 1;

			int count = 0;
			for (int i = start; i < end; i++) {
				if (list.get(i).equals(ans)) {
					count++;
				}
			}
			sb.append(count);
			sb.append(sep);

		}
		System.out.println(sb.toString());
	}
}