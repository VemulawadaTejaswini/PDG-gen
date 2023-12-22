import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	private static final int NO_VALUE = -1;

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while (true) {
			Header header = new Header(reader);

			// ????????????
			if (header.finish()) {
				break;
			}

			// ????????????????????????
			Hint hint = new Hint(header, reader);

			// ??????????????§??????
			searchAnswer(hint);
			System.out.println(hint.result);

		}
		reader.close();
	}

	static class Header {
		public int length;
		public int numberOfHint;

		public Header(BufferedReader reader) throws Exception {
			String[] splittedLine = reader.readLine().split(" ");
			length = Integer.parseInt(splittedLine[0]);
			numberOfHint = Integer.parseInt(splittedLine[1]);
		}

		public boolean finish() {
			return length == 0 && numberOfHint == 0;
		}
	}

	static class Hint {
		public int[] hitList;
		public int[] blowList;
		public int[][] hintList;
		public String result = "NO";

		public Hint(Header header, BufferedReader reader) throws Exception {
			hitList = new int[header.numberOfHint];
			blowList = new int[header.numberOfHint];
			hintList = new int[header.numberOfHint][header.length];
			for (int i = 0; i < header.numberOfHint; i++) {
				int[] hint = new int[header.length];
				String[] line = reader.readLine().split(" ");
				for (int j = 0; j < line[0].length(); j++) {
					hint[j] = Character.digit(line[0].charAt(j), 10);
				}
				hintList[i] = hint;
				hitList[i] = Integer.parseInt(line[1]);
				blowList[i] = Integer.parseInt(line[2]);
			}
		}

		public void setResult(int[] digits) {
			if (!result.equals("NO")) {
				result = "NO";
			} else {
				StringBuilder builder = new StringBuilder();
				for (int digit : digits) {
					builder.append(digit);
				}
				result = builder.toString();
			}
		}
	}

	public static void searchAnswer(Hint hint) {

		int[] digits = new int[hint.hintList[0].length];
		Arrays.fill(digits, NO_VALUE);

		for (int i = 0; i < 10; i++) {
			recursiveCreateDigits(digits, i, hint);

			// ?¬??????????????????????????????????
			digits[0] = NO_VALUE;
		}
	}

	public static void recursiveCreateDigits(int[] digits, int next, Hint hint) {

		// ???????????????????????????
		boolean[] used = new boolean[10];
		int index = 0;
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == NO_VALUE) {
				index = i;
				break;
			}
			used[digits[i]] = true;
		}

		// ???????????§??\??????????????????
		if (index == digits.length - 1) {
			digits[index] = next;
			// showDigits(digits);
			// System.out.println();
			return;
		}

		// ???????????´?????????????¨???????????¬??????????
		digits[index] = next;
		used[next] = true;
		for (int i = 0; i < 10; i++) {
			// ???????????§????????????????????????????????????
			if (used[i]) {
				continue;
			}
			recursiveCreateDigits(digits, i, hint);

			if (digits[digits.length - 1] != NO_VALUE) {
				// ????????§??????????????????????????????
				boolean allMatch = true;
				for (int j = 0; j < hint.hintList.length; j++) {
					if (!match(hint.hintList[j], digits, hint.hitList[j],
							hint.blowList[j])) {
						allMatch = false;
						break;
					}
				}
				if (allMatch) {
					// System.out.println("Match!");
					hint.setResult(digits);
				}
			}

			// ?¬??????????????????????????????????
			digits[index + 1] = NO_VALUE;
		}
	}

	public static boolean match(int[] hint, int[] target, int hit, int blow) {
		// ???????????¨????????????????????????
		int actualHit = 0;
		int actualBlow = 0;
		for (int i = 0; i < hint.length; i++) {

			// ???????????????
			if (hint[i] == target[i]) {
				actualHit++;
				continue;
			}

			// ???????????????
			for (int j = 0; j < target.length; j++) {
				if (hint[i] == target[j]) {
					actualBlow++;
					break;
				}
			}

		}
		/*
		showDigits(target);
		System.out.println();
		showDigits(hint);
		System.out.println("Hit " + hit + " vs " + actualHit + ", Blow " + blow
				+ " vs " + actualBlow);
				*/
		return hit == actualHit && blow == actualBlow;
	}

	public static void showDigits(int[] digits) {
		for (int i = 0; i < digits.length; i++) {
			System.out.print(digits[i]);
		}
	}
}