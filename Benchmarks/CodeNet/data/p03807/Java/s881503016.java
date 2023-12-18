import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int c = 0;
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if (A % 2 == 1) {
				c++;
			}
		}
		if (c % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}