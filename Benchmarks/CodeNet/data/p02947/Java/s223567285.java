import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String str[] = new String[N];

		for (int i = 0; i < N; i++) {
			str[i] = scan.next();
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

	static boolean permutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int[] char_code = new int[256];

		char[] str_array = str1.toCharArray();
		for (char c : str_array) {
			char_code[c]++;
		}

		for (int i = 0; i < str2.length(); i++) {
			int num = (int) str2.charAt(i);
			if (--char_code[num] < 0) {
				return false;
			}
		}
		return true;
	}
}
