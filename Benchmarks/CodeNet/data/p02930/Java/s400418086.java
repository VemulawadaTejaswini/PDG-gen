import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = 0; k < 10; k++) {
					if ((i >> k & 1) != (j >> k & 1)) {
						System.out.println(k + 1);
						break;
					}
				}
			}
		}
	}
}
