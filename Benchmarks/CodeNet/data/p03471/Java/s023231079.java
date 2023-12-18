import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;	// 10000
		int j = 0;	// 5000
		int k = 0;	// 1000
		int N = sc.nextInt();
		int Y = sc.nextInt();
		boolean result = false;

		loop: for (i = Y / 10000 ; i >= 0; i--) {
			for (j = (Y - i * 10000) / 5000; j >= 0; j--) {
				for (k = (Y - i * 10000 - j * 5000); k >= 0; k--) {
					if (Y == 10000 * i + 5000 * j + 1000 * k && N == i + j + k) {
						result = true;
						break loop;
					}
				}
			}
		}

		if (result) {
			System.out.println(i + " " + j + " " + k);
		} else {
			System.out.println("-1 -1 -1");
		}
	}
}