import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int d = (x + y) / 2;
		while (true) {
			if (x % d == 0 && y % d == 0) {
				break;
			}
			d--;
		}
		System.out.println(d);
	}
}
