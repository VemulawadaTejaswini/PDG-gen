import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int all = 0;
		int over = 0;
		StringBuilder sb = new StringBuilder();
		for (char c : arr) {
			if (c == 'a') {
				all++;
				if (all <= a + b) {
					sb.append("YES");
				} else {
					sb.append("NO");
				}
			} else if (c == 'b') {
				all++;
				over++;
				if (all <= a + b && over <= b) {
					sb.append("YES");
				} else {
					sb.append("NO");
					all--;
				}
			} else {
				sb.append("NO");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
