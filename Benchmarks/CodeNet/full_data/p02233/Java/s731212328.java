import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N[] = new int[50];
		int a = 0;
		int b = 0;
		int c = 0;
		N[0] = 1;
		N[1] = 1;

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int j = 2; j <= 44; j++) {
			b = N[j - 1];
			c = N[j - 2];
			a = b + c;
			N[j] = a;
		}
		System.out.println(N[n]);
	}
}
