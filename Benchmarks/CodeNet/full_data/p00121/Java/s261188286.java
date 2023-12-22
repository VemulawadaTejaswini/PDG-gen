
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		deque.push("01234567");
		map.put(deque.getFirst(), 0);
		int count = 1;
		while (!deque.isEmpty()) {
			int size = deque.size();
			while (size-- > 0) {
				String str = deque.pop();
				for (int i = 0; i < 4; i++) {
					String newStr = slove(str, i);
					if (!newStr.isEmpty() && !map.containsKey(newStr)) {
						map.put(newStr, count);
						deque.offer(newStr);
					}
				}
			}
			count++;
		}
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			System.out.println(map.get(scanner.nextLine().replace(" ", "")));
		}
	}

	private static String slove(String str, int i) {
		int index = str.indexOf("0");
		StringBuilder builder = new StringBuilder(str);

		switch (i) {
		case 0:
			if (index != 3 && index != 7) {
				String rep = String.valueOf(str.charAt(index + 1));
				return rep(builder, str, rep, index, 1);

			} else {
				return "";
			}
		case 1:
			if (index != 0 && index != 4) {
				String rep = String.valueOf(str.charAt(index - 1));
				return rep(builder, str, rep, index, -1);
			} else {
				return "";
			}
		case 2:
			if (index < 4) {
				String rep = String.valueOf(str.charAt(index + 4));
				return rep(builder, str, rep, index, 4);
			} else {
				return "";
			}
		default:
			if (index > 3) {
				String rep = String.valueOf(str.charAt(index - 4));
				return rep(builder, str, rep, index, -4);
			} else {
				return "";
			}
		}
	}

	private static String rep(StringBuilder builder, String str, String rep,
			int index, int x) {
		return builder.replace(index, index + 1, rep)
				.replace(index + x, index + x + 1, "0").toString();
	}

	private static String rep(String str, String rep) {
		return str.replace("0", "9").replace(rep, "0").replace("9", rep);
	}
}