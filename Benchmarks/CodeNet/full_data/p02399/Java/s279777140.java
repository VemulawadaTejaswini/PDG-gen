
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] s = sc.nextLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int d = a / b;
		int r = a % b;
		double f = a / b;

		System.out.println(d + " " + r + " " + f);
	}
}