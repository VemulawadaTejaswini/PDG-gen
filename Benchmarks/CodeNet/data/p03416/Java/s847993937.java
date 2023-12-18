import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int cnt = 0;

		for (int i = A; i <= B; i++) {

			if(Digits(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static boolean Digits(int n) {

		int digit[] = new int[5];

		for (int i = 0; i < 5; i++) {
			digit[i] = n % 10;
			n /= 10;
		}

		if(digit[0] == digit[4]
				&& digit[1] == digit[3]) {
			return true;
		} else {
			return false;
		}
	}
}
