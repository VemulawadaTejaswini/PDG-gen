import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner s) {
		String str = s.next();
		String[] array = str.split("");
		List<String> S1 = new ArrayList<>();
		List<String> S2 = new ArrayList<>();

		for (String a : array) {
			S1.add(a);
			S2.add(a);
		}

		boolean endFlg = check(S1);

		int result = Integer.MAX_VALUE;
		if (endFlg) {
			result = 0;
		} else {
			int tmpResult = Integer.MAX_VALUE;

			if (S1.get(0).equals("B")) {
				tmpResult = add(S1, "W", 0, 1);
			} else if (S1.get(0).equals("W")) {
				tmpResult = add(S1, "B", 0, 1);
			}

			if (tmpResult < result) {
				result = tmpResult;
			}

			if (S2.get(S2.size() - 1).equals("B")) {
				tmpResult = add(S2, "W", 1, 1);
			} else {
				tmpResult = add(S2, "B", 1, 1);
			}

			if (tmpResult < result) {
				result = tmpResult;
			}
		}

		System.out.println(result);
	}

	private static int add(List<String> S, String addStr, int position, int count) {
		if (position == 0) {
			S.add(0, addStr);
			for (int i = 1; i < S.size(); i++) {
				if (!S.get(i).equals(addStr)) {
					S.set(i, addStr);
				} else {
					break;
				}
			}
		} else {
			S.add(addStr);
			for (int i = S.size() - 2; i >= 0; i--) {
				if (!S.get(i).equals(addStr)) {
					S.set(i, addStr);
				} else {
					break;
				}
			}
		}

		if (check(S)) {
			return count;
		} else {
			if (addStr.equals("B")) {
				count = add(S, "W", position, count + 1);
			} else {
				count = add(S, "B", position, count + 1);
			}
		}

		return count;
	}

	private static boolean check(List<String> sList) {
		String first = sList.get(0);
		for (String s : sList) {
			if (!first.equals(s)) {
				return false;
			}
		}

		return true;
	}
}
