import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] p = new boolean[105001];
		for (int i = 0; i <= 105000; i++) {
			p[i] = true;
		}
		for (int i = 2; i <= 325; i++) {
			for (int j = i * 2; j <= 105000; j += i) {
				p[j] = false;
			}
		}
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int c = 0;
			for (int i = 2; i <= 105000 && n > 0; i++) {
				if (p[i]) {
					n--;
					c += i;
				}
			}
			System.out.println(c);
		}
	}
}