import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String[] str = s.split("");
		

		for (int i = 0; i < s.length() - 1; i++) {
			Map<String, Integer> checked = new HashMap<>();
			String tar = "";
			for (int j = i; j < s.length(); j++) {
				tar = str[j];
				if (checked.containsKey(tar)) {
					checked.put(tar, checked.get(tar) + 1);
				} else {
					checked.put(tar, 1);
				}
				if (checked.get(tar) > (j - i + 1) / 2 && i != j) {
					System.out.println(i + 1 + " " + (j + 1));
					return;
				}
			}
		}

		System.out.println(-1 + " " + -1);
	}
}