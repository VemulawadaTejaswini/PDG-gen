import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			System.out.println(parse(str));
		}
	}

	private static int parse(String s) {
//System.err.println(s);
		if (s.matches("^\\[\\d*\\]$")) {
			int x = Integer.parseInt(s.substring(1, s.length() - 1));
//System.out.println(x);
			return x / 2 + 1;
		} else {
			List<Integer> list = new ArrayList<Integer>();
			int count = 0;
			int start = 1;
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) == '[') {
					count++;
				} else if (s.charAt(i) == ']') {
					count--;
					if (count == 0) {
						int x = parse(s.substring(start, i + 1));
						list.add(x);
						start = i;
					}
				}
			}
			Collections.sort(list);
			int sum = 0;
			for (int i = 0; i < list.size() / 2 + 1; i++) {
				sum += list.get(i);
			}
			return sum;
		}
	}
}