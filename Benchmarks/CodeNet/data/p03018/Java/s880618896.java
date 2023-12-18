import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		int mode = 0;
		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			if (mode == 0) {
				if (s.charAt(i) == 'A') {
					mode = 1;
					a++;
				}
			} else if (mode == 1) {
				if (s.charAt(i) == 'B') {
					mode = 2;
				} else if (s.charAt(i) == 'A') {
					a++;
				} else {
					mode = 0;
					a = 0;
				}
			} else if (mode == 2) {
				if (s.charAt(i) == 'C') {
					mode = 1;
					count += a;
				} else {
					mode = 0;
					a = 0;
				}
			}
		}
		System.out.println(count);
	}
}
