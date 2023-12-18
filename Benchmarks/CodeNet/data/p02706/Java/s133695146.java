import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int nn = n;
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			nn = nn - a;
		}
		if (nn >= 0) {
			System.out.println(nn);
		} else {
			System.out.println("-1");
		}
		sc.close();
	}
}