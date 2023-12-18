import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int value = sc.nextInt();

		System.out.println(withdraw(value));

	}

	static int withdraw(int value) {
		if (value == 0) {
			return 0;
		}
		if (value == 1) {
			return 1;
		}

		int num9 = (int) Math.pow(9, 5);
		int num6 = (int) Math.pow(6, 6);

		int num = 0;

		while (num9 > value) {
			num9 /= 9;
		}

		while (num6 > value) {
			num6 /= 6;
		}

		int tmp9 = withdraw(value - num9);
		int tmp6 = withdraw(value - num6);

		if (tmp9 > tmp6) {
			num = tmp6;
		} else {
			num = tmp9;
		}

		return num + 1;
	}

}
