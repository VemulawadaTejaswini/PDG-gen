import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String p = sc.next();
		char[] characterS = s.toCharArray();
		char[] characterC = p.toCharArray();
		int i, j, l;
		int count = 0;
		top: for (i = 0; i < s.length(); i++) {
			for (j = 0, l = 0; j < p.length();) {
				try {
					if (characterC[j] == characterS[j + i]) {
						count++;
					}
				} catch (java.lang.ArrayIndexOutOfBoundsException e) {
					if (characterC[j] == characterS[l]) {
						count++;
						l++;
					}
				} finally {
					j++;
				}
			}
			if (count == p.length()) {
				break top;
			} else {
				count = 0;
			}
		}
		if (count == p.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
