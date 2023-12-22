import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			for (int i = 0; i < n; i++) {
				int p = sc.nextInt();
				c += p;
			}
			System.out.println(c / n);
		}
	}
}