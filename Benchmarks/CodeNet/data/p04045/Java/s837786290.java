import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] arr = new boolean[10];
		for (int i = 0; i < k; i++) {
			arr[sc.nextInt()] = true;
		}
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			int x = s.charAt(s.length() - i - 1) - '0';
			if (!flag) {
				x++;
			}
			flag = false;
			for (int j = x; j < 10; j++) {
				if (!arr[j]) {
					flag = true;
					sb.insert(0, j);
					break;
				}
			}
			if (flag) {
				continue;
			}
			for (int j = 0; j < 10; j++) {
				if (!arr[j]) {
					sb.insert(0, j);
					break;
				}
			}
		}
		if (!flag) {
			for (int j = 1; j < 10; j++) {
				if (!arr[j]) {
					sb.insert(0, j);
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
