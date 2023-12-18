import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		int len = 0;
		for (int i = s.length - 2; i >= 2; i--) {
			if (i % 2 == 0) {
				boolean b = true;
				for (int j = 0; j <= i / 2 - 1; j++) {
					if (s[j] != s[i / 2 + j]) {
						b = false;
						break;
					}
				}
				if (b) {
					len = i;
					break;
				}
			}
		}
		System.out.println(len);
	}
}
