import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		partB();

	}

	public static void partB() {
		Scanner scB = new Scanner(System.in);
		int a = scB.nextInt();
		int b = scB.nextInt();
		int N = b - a;
		int sum = 0;

		for(int i = 0 ; i < N + 1 ; i++) {
			sum += i;
		}

		System.out.println(sum - b);
	}
}