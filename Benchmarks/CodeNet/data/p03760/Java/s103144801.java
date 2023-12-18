import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] o = sc.next().toCharArray();
		char[] e = sc.next().toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < o.length; i++) {
			sb.append(o[i]);
			if (i != o.length - 1 || o.length == e.length) {
				sb.append(e[i]);
			}
		}
		System.out.println(sb);
	}
}
