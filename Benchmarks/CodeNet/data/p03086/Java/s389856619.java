import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		in.close();
		List<Integer> indexes = getSplitIndexes(line);
		if (indexes.isEmpty()) {
			System.out.println(line.length());
		} else if (indexes.size() == 1) {
			System.out.println(Math.max(indexes.get(0), line.length() - indexes.get(0) - 1));
		} else {
			int max = indexes.get(0);
			for (int i = 1; i < indexes.size(); ++i) {
				max = Math.max(max, indexes.get(i) - indexes.get(i - 1) - 1);
			}
			System.out.println(max);
		}

	}

	static List<Integer> getSplitIndexes(String line) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < line.length(); ++i) {
			char c = line.charAt(i);
			if (c == 'A' || c == 'T' || c == 'G' || c == 'C') {
				continue;
			}
			result.add(i);
		}
		return result;
	}

}
