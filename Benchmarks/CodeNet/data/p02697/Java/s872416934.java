import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int i2 = n;
		for (int i = 1; i <= m; i++) {
			if (i2 - i == i + n - i2) {
				i2--;
			}
			System.out.println(i + " " + i2);
			i2--;
		}
	}
}
