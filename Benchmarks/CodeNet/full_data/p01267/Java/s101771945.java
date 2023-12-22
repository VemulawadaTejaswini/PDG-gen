import java.util.HashSet;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			if ((n | a | b | c | x) == 0)
				break;
			int s[] = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
			}
			int f = 0;
			int i = 0;
			while (true) {
				if (f > 10000) {
					f = -1;
					break;
				}
				if (x == s[i]) {
					i++;
				}
				if (i == n)
					break;
				x = (a * x + b) % c;
				f++;
			}
			System.out.println(f);
			// x' = (A × x + B) mod C
		}
	}
}