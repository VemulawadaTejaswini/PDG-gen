import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();

		int max = 0;
		for (int i = 1; i < N; i++) {
			String sub1 = S.substring(0, i + 1);
			String sub2 = S.substring(i + 1);
			//System.out.println(sub1 + " " + sub2);
			int[] sub1_char = new int[26];
			int[] sub2_char = new int[26];
			for (char c : sub1.toCharArray()) {
				sub1_char[c - 'a']++;
			}
			for (char c : sub2.toCharArray()) {
				sub2_char[c - 'a']++;
			}
			int count = 0;
			for (int j = 0; j < 26; j++) {
				if (sub1_char[j] > 0 && sub2_char[j] > 0) {
					count++;
				}
			}
			if (count > max) {
				max = count;
			}

		}
		System.out.println(max);
	}

}