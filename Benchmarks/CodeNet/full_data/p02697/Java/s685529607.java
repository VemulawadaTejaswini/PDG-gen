import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		for (int i = 1; i <= m; i++) {
			System.out.println(i + " " + (n - i));
		}
	}
}
