import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s, ans, yes = "yes", no = "no";
		while (true) {
			s = br.readLine();
			if (s.equals(".")) {
				return;
			}
			Stack<Character> st = new Stack<Character>();
			boolean fin = false;
			ans = yes;
			for (int i = 0; i < s.length(); ++i) {
				char c = s.charAt(i);
				if (c == '(' || c == '[') {
					st.push(c);
					continue;
				}
				if (st.empty()) {
					if (c == ')' || c == ']') {
						ans = no;
						fin = true;
					}
				} else {
					char t = st.peek();
					if (t == '(') {
						if (c == ')') {
							st.pop();
							continue;
						} else if (c == ']') {
							ans = no;
							fin = true;
						}
					} else if (t == '[') {
						if (c == ']') {
							st.pop();
							continue;
						} else if (c == ')') {
							ans = no;
							fin = true;
						}
					}
				}
				if (fin) {
					break;
				}
			}
			if (!st.isEmpty()) {
				ans = no;
			}
			System.out.println(ans);
		}
	}
}