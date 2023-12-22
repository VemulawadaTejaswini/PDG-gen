import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r, c;
		
		r = sc.nextInt();
		c = sc.nextInt();
		while (r + c != 0) {
			if (r % 2 == 1 && c % 2 == 1) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
			r = sc.nextInt();
			c = sc.nextInt();
		}
	}
}