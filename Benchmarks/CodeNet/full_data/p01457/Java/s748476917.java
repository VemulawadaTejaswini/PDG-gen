import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		String s = "";
		for (int i = 0; i < q; i++) {
			int p = sc.nextInt();
			String c = sc.next();
			int n = sc.nextInt();
			String str = "";
			for (int j = 0; j < n; j++)
				str += c;
			s = s.substring(0, p) + str + s.substring(p);
			if (isBalanced(s))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		sc.close();
	}

	static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (i != 0 && stack.isEmpty())
				return false;
			if (s.charAt(i) == s.charAt(0))
				stack.push(s.charAt(i));
			else
				stack.pop();
		}
		if (stack.isEmpty())
			return true;
		return false;
	}
}