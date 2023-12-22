import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.next();
		int n = in.nextInt();
		int count = 0;
		while (n-- > 0) {
			String s;
			s = (s = in.next()) + s;
			count += (s.contains(text) ? 1 : 0);
		}
		System.out.println(count);
	}
}