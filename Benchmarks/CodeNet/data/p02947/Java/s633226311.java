import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] f = new int[n];

		long total = 0l;

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			//			char[] chars = s[i].toCharArray();
			//			Arrays.sort(chars);
			//			s[i] = new String(chars);
		}

		for (int i = 0; i < n - 1; i++) {
			int count = 0;
			if (f[i] != 0) {
				continue;
			} else {
				for (int j = i + 1; j < n; j++) {
					if (MyisAnagram(s[i], s[j])) {
						count++;
						f[j] = -1;
					}
				}
				total += sum(count);
			}

		}
		System.out.println(total);
		sc.close();

	}

	public static long sum(int num) {
		long ret = 0;
		for (int i = 1; i <= num; i++) {
			ret += i;
		}
		return ret;
	}

	public static boolean MyisAnagram(String word1, String word2) {
		int sumCode_1 = 0;
		int sumCode_2 = 0;

		for (int i = 0; i < word1.length(); i++) {
			sumCode_1 += word1.charAt(i);
		}
		for (int i = 0; i < word2.length(); i++) {
			sumCode_2 += word2.charAt(i);
		}

		if (sumCode_1 == sumCode_2) {
			return true;
		} else {
			return false;
		}

	}
}