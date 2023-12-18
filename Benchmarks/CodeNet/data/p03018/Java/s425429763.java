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
			while (search + 1 < s.length()) {
				if (s.substring(search, search + 2).equals("BC")) {
					count++;
					search += 2;
				} else {
					break;
				}
			}
			search = tmp - 1;
			while (search >= 0) {
				if (s.charAt(search) == 'A') {
					count++;
					search--;
				} else {
					break;
				}
			}
			s = s.substring(0, search + 1) + "BC";
		}
		System.out.println(count);
	}
}
