import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int r = 0;
		for (char c : s.toCharArray()) {
			r += c - '0';
		}
		System.out.println(r%9==0?"Yes":"No");
	}
}
