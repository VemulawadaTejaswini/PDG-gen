import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : arr) {
			if (c != 'A') {
				sb.append(c);
			}
		}
		if (sb.toString().equals("KIHBR")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
