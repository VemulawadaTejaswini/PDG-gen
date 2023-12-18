import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, a = 0;
		N = sc.nextInt();
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < 7; k++) {
				if (N == i * 4 + k * 7) {
					a = 1;
				}

			}
		}
		if (a == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}