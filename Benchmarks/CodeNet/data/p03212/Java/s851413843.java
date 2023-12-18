import java.util.*;

public class Main {
	long N;
	String S;

	Main() {
		Scanner in = new Scanner(System.in);
		S = in.nextLine();
		N = Long.parseLong(S);
		in.close();
	}

	void calc() {
		List<String> valueStrs = new ArrayList<>();
		for (int i = 2; i < S.length(); ++i) {
			valueStrs.addAll(getSubValues(i));
		}

		List<Long> values = new ArrayList<>();
		for (String valStr : valueStrs) {

			if (check(valStr)) {
				long v = Long.parseLong(valStr);
				if (v <= N) {
					values.add(v);
				}
			}
		}

		System.out.println(values.size());
	}

	boolean check(String s) {
		boolean three = false, five = false, seven = false;
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (c == '3') {
				three = true;
			} else if (c == '5') {
				five = true;
			} else if (c == '7') {
				seven = true;
			}
		}
		return three && five && seven;
	}

	List<String> getSubValues(int remain) {
		if (remain == 0) {
			List<String> result = new ArrayList<>();
			result.add("3");
			result.add("5");
			result.add("7");
			return result;
		} else {
			List<String> result = new ArrayList<>();
			List<String> subs = getSubValues(remain - 1);
			String[] chars = { "3", "5", "7" };
			for (String c : chars) {
				for (String sub : subs) {
					result.add(c + sub);
				}
			}
			return result;
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
	}

}