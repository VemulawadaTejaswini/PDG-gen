import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[] a = new int[3];

		for (int i = 0; i < 3; i++) {
			do {
				a[i] = stdIn.nextInt();
			} while (a[i] < 0 && 10 < a[i]);

		}

		System.out.println();
		int n = a[0]*100+a[1]*10+a[2];

		if(n % 4 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}