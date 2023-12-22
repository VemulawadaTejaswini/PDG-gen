import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int count = 1;
		do {
			int x = stdin.nextInt();
			int y = stdin.nextInt();
			if (x > 0) {
				if (x < y) {
					System.out.println(x + " " + y);
				} else {
					System.out.println(y + " " + x);
				}
			}
		} while (count <= 3000);
	}
}