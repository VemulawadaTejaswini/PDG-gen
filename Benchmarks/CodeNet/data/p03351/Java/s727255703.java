import java.util.Scanner;

public class atcoder_20180512 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input[] = new int[4];
		for (int i = 0; i < 4; i++) {
			input[i] = sc.nextInt();
		}

		int distance = input[3];
		if (Math.abs(input[0] - input[2]) <= distance) {
			System.out.println("Yes");
			return;
		}
		if ((Math.abs(input[0] - input[1]) <= distance) && (Math.abs(input[1] - input[2]) <= distance)) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}