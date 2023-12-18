import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int count = 0;
		//		String[] atgc = {"A", "T", "G", "C"};

		for (int i = 0; i < s.length(); i++) {
			int tmpCount = 0;
			while (s.substring(i, i + 1).equals("A") || s.substring(i, i + 1).equals("T") ||
					s.substring(i, i + 1).equals("G") || s.substring(i, i + 1).equals("C")) {
				tmpCount++;
				if (i == s.length() - 1) {
					break;
				}
				i++;

			}
			if (tmpCount > count) {
				count = tmpCount;

			}
		}

		System.out.print(count);
		sc.close();
	}
}