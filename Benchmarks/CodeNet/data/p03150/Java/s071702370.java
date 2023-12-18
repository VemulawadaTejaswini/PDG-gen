import java.util.*;

public class Main {
	static String KEYENCE = "keyence";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		in.close();
		List<String> startStrs = startStrs(line);
		List<String> endStrs = endStrs(line);
		boolean enable = false;
		for (String startStr : startStrs) {
			for (String endStr : endStrs) {
				if (KEYENCE.equals(startStr + endStr)) {
					enable = true;
					break;
				}
			}
			if (enable) {
				break;
			}
		}
		if (line.contains(KEYENCE)) {
			enable = true;
		}
		if (enable) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	static List<String> startStrs(String line) {
		List<String> result = new ArrayList<>();
		for (int i = 0; i < line.length(); ++i) {
			if (line.charAt(i) != 'k') {
				continue;
			}
			int end = i;
			for (int j = i; j < Math.min(i + KEYENCE.length(), line.length()); ++j) {
				if (line.charAt(j) != KEYENCE.charAt(j - i)) {
					break;
				}
				end = j;
			}
			result.add(line.substring(i, end + 1));
		}
		return result;
	}

	static List<String> endStrs(String line) {
		List<String> result = new ArrayList<>();
		for (int end = line.length() - 1; end >= 0; --end) {
			if (line.charAt(end) != 'e') {
				continue;
			}
			int start = end;
			for (int j = end; j >= Math.max(end + 1 - KEYENCE.length(), 0); --j) {
				// System.out.println(j + ", " + (KEYENCE.length() - 1 - (end - j)));
				if (line.charAt(j) != KEYENCE.charAt(KEYENCE.length() - 1 - (end - j))) {
					break;
				}
				start = j;
			}
			result.add(line.substring(start, end + 1));
		}
		return result;
	}

}