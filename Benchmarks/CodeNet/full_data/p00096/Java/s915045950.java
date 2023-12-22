import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		while(sn.hasNext()) {
			int n = sn.nextInt();
			int count = 0;
			for (int a = (n > 1000) ? 1000 : n; a >= 0; a--) {
				for (int b = (n - a > 1000) ? 1000 : n - a; b >= 0
						&& n - a - b <= 2000; b--) {
					int N = n - a - b;
					count += (N > 1000) ? 2000 - N + 1 : N + 1;
				}
			}
			System.out.println(count);
		}
	}
}