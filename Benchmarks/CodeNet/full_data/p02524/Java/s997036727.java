import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = 0, b = 0, deg = 0;
		try {
			a = stdin.nextInt();
			b = stdin.nextInt();
			deg = stdin.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		stdin.close();
		
		double rad = Math.PI / 180 * deg;
		System.out.println(a * b * Math.sin(rad) / 2);
		System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)
							- 2 * a * b * Math.cos(rad)) + a + b);
		System.out.println(b * Math.sin(rad));
	}
}