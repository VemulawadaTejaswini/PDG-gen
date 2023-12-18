import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int c = 0;
		boolean before = false;
		boolean pair = true;
		for (int i = 1; i <= n; i++) {
			if (Integer.parseInt(sc.next()) == i) {
				if (before) {
					if (pair)
						pair = false;
					else {
						pair = true;
						c++;
					}
				}
				else
					c++;
				before = true;
			}
			else
				before = false;
		}

		if (n == 5 && c == 2)
			System.out.println("hoge");

		System.out.println(c);
	}
}