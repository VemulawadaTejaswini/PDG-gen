import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();

		int r = 0;
		char t = '/';
		for (char c: sc.next().toCharArray())
			if (c != t) {
				r++;
				t = c;
			}
		System.out.println(r);
	}
}
