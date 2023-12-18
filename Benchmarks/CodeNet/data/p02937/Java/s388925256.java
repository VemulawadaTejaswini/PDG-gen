import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] t = sc.nextLine().toCharArray();
		List<String> list = new ArrayList<>();
		for (char c : t) {
			list.add(String.valueOf(c));
		}
		// 存在するかの判定
		boolean flag = true;
		for (String c : list) {
			flag = flag && s.contains(c);
		}
		if (!flag) {
			System.out.println(-1);
			return;
		}
		long ans = 0;
		String tmp = s;
		for (String c : list) {
			if (!tmp.contains(c)) {
				ans = ans + tmp.length();
				tmp = s;
			}
			int index = tmp.indexOf(c) + 1;
			ans = ans + index;
			tmp = tmp.substring(index);
		}
		System.out.println(ans);
	}
}
