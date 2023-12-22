import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		char[] sa = s.toCharArray();
		char[] ta = t.toCharArray();
		int count = 0;
		for (int i = 0; i < sa.length; i++) {
			if (sa[i] != ta[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}