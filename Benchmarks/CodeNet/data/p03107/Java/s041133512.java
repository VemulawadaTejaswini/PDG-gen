import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int n = s.length();

		int allCount = 0;
		int count = 0;

		boolean flag = false;

		while(!flag) {
			count = 0;
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) != s.charAt(i + 1)) {
					s = s.replaceFirst(s.substring(i, i + 2), "");
					allCount += 2;
					count++;
				}
			}
			if (count == 0) flag = true;
		}

		System.out.println(allCount);
	}
}
