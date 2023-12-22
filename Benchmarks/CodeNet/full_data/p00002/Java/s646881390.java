import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		String a, b, c;
		long num, num1, num2;
		while (true) {
			a = sc.next();
			b = sc.next();
			if (a == null & b == null)
				break;
			num1 = Long.parseLong(a);
			num2 = Long.parseLong(b);
			num = num1 + num2;
			c = Long.toString(num);
			System.out.println(c.length());
		}
	}
}