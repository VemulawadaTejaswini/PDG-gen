import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 0;
		int ss = 0;
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			if (c < p) {
				ss += p - c;
				continue;
			}
			p = c;
		}
		System.out.println(ss);
	}
}
