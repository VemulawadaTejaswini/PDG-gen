import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String[] str = s.split("");

		for (int i = 0; i < s.length() - 1; i++) {
			int count = 0;
			String pos = "";
			String tar = "";
			for (int j = i; j < s.length(); j++) {
				tar = str[j];
				if (tar.equals(pos)) {
					count++;
				}
				pos = tar;
				if (count > (j - i) / 2) {
					System.out.println(i+1 + " " + (j+1));
					return;
				}
			}
		}

		System.out.println(-1 + " " + -1);
	}
}