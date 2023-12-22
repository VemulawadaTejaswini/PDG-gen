import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		
		n = sc.nextInt();
		k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			x = Math.min(x, n - x + 1);
			y = Math.min(y, n - y + 1);
			System.out.println((Math.min(x, y) - 1) % 3 + 1);
		}
	}
}