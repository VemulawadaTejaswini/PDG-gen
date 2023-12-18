import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int t = 0;
		for (double i = a; i < b + 1; i++) {
			if (i % c != 0 && i % d != 0) {
				t += 1;
			}
		}
		System.out.println(t);
	}

}
