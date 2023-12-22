import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int x;
		for (int i = 1; i <= n; i++) {
			x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
				continue;
			}
			
			for (; x != 0;) {
				x /= 10;
				if (x % 10 == 3) {
					System.out.print(" " + i);
					break;
				}
			}
		}
		System.out.println();
	}
}

