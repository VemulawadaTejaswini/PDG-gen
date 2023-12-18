import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		HashSet<Character> hs = new HashSet<>();
		boolean b = true;
		for (int i = 0; i < s.length; i++) {
			if (hs.add(s[i])) {
			} else {
				b = false;
				break;
			}
		}
		if (b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
