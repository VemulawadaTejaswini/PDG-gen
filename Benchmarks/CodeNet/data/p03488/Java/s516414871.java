import java.util.*;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		char[] inS = stdin.next().toCharArray();
		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();
		boolean moveX = true;
		int move = 0;
		for (char s : inS) {
			if (s == 'F') {
				move++;
			}
			else {
				if (moveX) {
					xList.add(move);
					moveX = false;
				}
				else {
					yList.add(move);
					moveX = true;
				}

				move = 0;
			}
		}
		if (move > 0) {
			if (moveX) {
				xList.add(move);
			}
			else {
				yList.add(move);
			}
		}

		int inX = stdin.nextInt() - xList.remove(0);
		int inY = stdin.nextInt();

		Collections.sort(xList);
		Collections.reverse(xList);
		Collections.sort(yList);
		Collections.reverse(yList);

		String result = "No";
		if (check(inX, xList) && check(inY, yList)) {
			result = "Yes";
		}

		System.out.println(result);
	}

	private static boolean check(int target, List<Integer> list) {
		for (int move : list) {
			if (target > 0) {
				target -= move;
			}
			else {
				target += move;
			}
		}

		return target == 0;
	}
}
