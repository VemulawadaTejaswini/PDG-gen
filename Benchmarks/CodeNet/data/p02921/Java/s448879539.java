import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss = sc.next();
		String[] s = ss.split("");
		String ts = sc.next();
		String[] t = ts.split("");
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if (s[i].equals(t[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}