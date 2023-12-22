import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int num[] = new int[10];
		int a = 0;
		int b = 0;
		String str = "YES";

		for (int s = 0; s < n; s++) {
			for (int i = 0; i < 10; i++) {
				num[i] = sc.nextInt();
			}
			for (int i = 0; i < 10; i++) {
				if (a < num[i]) {
					a = num[i];
				} else if (b < num[i] && a > num[i]) {
					b = num[i];
				} else {
					str = "NO";
				}
			}
			System.out.println(str);

		}

	}

}