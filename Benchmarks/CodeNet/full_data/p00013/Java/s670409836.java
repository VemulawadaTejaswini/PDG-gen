import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println(s.pop());
				if (s.size() == 0) break;
			} else {
				s.add(n);
			}
		}

	}

}