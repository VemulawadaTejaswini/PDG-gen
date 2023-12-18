import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int N2 = N;
		boolean check = true;
		int sum = 0;
		while (check) {
			if (N / 10 != 0) {
				sum += N % 10;
				N = N / 10;
			} else {
				check = false;
				sum += N;
			}
		}
		if (N2 % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}