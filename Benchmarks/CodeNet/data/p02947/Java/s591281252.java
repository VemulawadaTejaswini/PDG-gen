import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String str[] = new String[N];

		for (int i = 0; i < N; i++) {
			str[i] = scan.next();
			str[i] = str_sort(str[i]);
		}
		scan.close();

		boolean flag = false;
		int count = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				flag = permutation(str[i], str[j]);
				if (flag == true) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

	static String str_sort(String str) {
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return str_sort(s).equals(str_sort(t));
	}
}
