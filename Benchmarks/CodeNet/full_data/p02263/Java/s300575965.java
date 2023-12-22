import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> Q = new ArrayDeque<>();
		
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			int a, b;
			switch(str.charAt(0)) {
				case '+':
					b = Q.pop();
					a = Q.pop();
					Q.push(a + b);
					break;
				case '-':
					b = Q.pop();
					a = Q.pop();
					Q.push(a - b);
					break;
				case '*':
					b = Q.pop();
					a = Q.pop();
					Q.push(a * b);
					break;
				default:
					Q.push(Integer.parseInt(str));
					break;
			}
		}
		System.out.println(Q.pop());
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
