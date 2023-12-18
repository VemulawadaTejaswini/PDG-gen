import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0, c = 0, d = 0;

		while ((d - c) != (b - a)) {
			d = c;
			c++;
			d += c;
		}
		
		System.out.println(Math.abs(c - a));

		sc.close();
	}
}
