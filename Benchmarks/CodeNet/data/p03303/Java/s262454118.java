import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int w = sc.nextInt();
		int idx = 0;
		StringBuilder sb = new StringBuilder();
		while (idx < s.length()) {
			sb.append(s.charAt(idx));
			idx += w;
		}
		System.out.println(sb);
	}
}