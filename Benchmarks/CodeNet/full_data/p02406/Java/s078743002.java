import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x;
		for (int i = 1; i <= n; i++) {
			x = i;
			if (x % 3 == 0) {
				System.out.print(" " +x);
			} else {
				while (x != 0) {
					if (x % 10 == 3) {
						System.out.print(" " + x);
						break;
					}
					x /= 10;
				}
			}
		}
	}

}