import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		int[] a = new int[26];
		for (int i = 0; i < s.length; i++) {
			a[s[i] - 'a']++;
		}
		boolean b = false;
		int i = 0;
		for (; i < 26; i++) {
			if (a[i] == 0) {
				b = true;
				break;
			}
		}
		if (b) {
			System.out.println((char) ('a' + i));
		} else {
			System.out.println("None");
		}
	}
}
