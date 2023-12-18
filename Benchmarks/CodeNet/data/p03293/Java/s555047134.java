package test;

public class Main {

	public static void main(String[] args) {
		String correct = args[0];
		String target = args[1];

		if (correct.length() != target.length()) {
			return;
		}

		char[] targ = target.toCharArray();
		for (int i = 0; i < correct.length(); i++) {
			char[] converted = new char[correct.length()];
			for (int j = 0; j < correct.length(); j++) {
				int a = i + j;
				if (a >= correct.length()) {
					a = a - correct.length();
				}
				converted[j] = targ[a];
			}
			if (correct.equals(String.valueOf(converted))) {
				System.out.println("yes");
				return;
			}
		}
		System.out.println("no");
    }
}