import java.util.Scanner;

public class Main {
	static boolean isAnagram(String word1, String word2) {
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

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] sarray = new String[n];
		long count = 0;

		for (int i = 0; i < n; i++) {
			sarray[i]=sc.next();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (isAnagram(sarray[i], sarray[j])==true) {

					count++;
				}
			}
		}
		System.out.println(count);
	}
}
