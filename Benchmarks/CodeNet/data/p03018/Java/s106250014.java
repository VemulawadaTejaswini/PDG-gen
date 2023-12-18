import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		while (s.contains("ABC")) {
			int tmp = s.lastIndexOf("ABC");
			count++;
			int search = tmp + 3;
			StringBuilder sb = new StringBuilder("BC");
			while (search + 1 < s.length()) {
				if (s.substring(search, search + 2).equals("BC")) {
					count++;
					sb.append("BC");
					search += 2;
				} else {
					break;
				}
			}
			s = s.substring(0, tmp) + sb;
		}
		System.out.println(count);
	}
}
