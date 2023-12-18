import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int cnt = 3;

		if (a == b) {
			cnt--;
		}

		if (b == c) {
			cnt--;
		}

		if (c == a) {
			cnt--;
		}

		System.out.println(cnt);

		sc.close();
	}

}
