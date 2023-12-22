import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();
		Stack<Integer> s1 = new Stack<>();
		Stack<int[]> s2 = new Stack<>();

		int sum = 0;

		for (int i = 0; i < str.length; i++) {
			char now = str[i];
			if ('\\' == now) {
				s1.push(i);
			} else if ('/' == now && !s1.isEmpty()) {
				int from = s1.pop();
				int s = (i - from);
				sum += s;
				while (!s2.isEmpty() && from < s2.peek()[0]) {
					s += s2.pop()[1];
				}
				int[] data = {from, s};
				s2.push(data);
			}

		}

		System.out.println(sum);
		System.out.print(s2.size());
		StringBuffer sb = new StringBuffer();
		while (!s2.isEmpty()) {
			sb.append(" ").append(s2.get(0)[1]);
			s2.remove(0);
		}
		System.out.println(sb.toString());
	}
}

