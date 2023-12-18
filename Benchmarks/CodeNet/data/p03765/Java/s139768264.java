import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt();
			int c = sc.nextInt() - 1;
			int d = sc.nextInt();
			Stack<Character> sst = new Stack<>();
			Stack<Character> tst = new Stack<>();
			for (int j = a; j < b; j++) {
				if (sst.isEmpty() == false) {
					if (sst.peek() == s.charAt(j)) {
						sst.pop();
						sst.push(op(s.charAt(j)));
					} else {
						sst.pop();
					}
				} else {
					sst.push(s.charAt(j));
				}
			}
			for (int j = c; j < d; j++) {
				if (tst.isEmpty() == false) {
					if (tst.peek() == t.charAt(j)) {
						tst.pop();
						tst.push(op(t.charAt(j)));
					} else {
						tst.pop();
					}
				} else {
					tst.push(t.charAt(j));
				}
			}
			if (sst.isEmpty() && tst.isEmpty()) {
				System.out.println("YES");
			} else if (sst.size() * tst.size() == 0) {
				System.out.println("NO");
			} else if (sst.pop() == tst.pop()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	static char op(char c) {
		return c == 'A' ? 'B' : 'A';
	}
}
