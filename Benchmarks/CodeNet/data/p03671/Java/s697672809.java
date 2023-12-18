import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		String[] work = cin.nextLine().split(" ");
		int a = Integer.parseInt(work[0]);
		int b = Integer.parseInt(work[1]);
		int c = Integer.parseInt(work[2]);

		int min = getMin(a + b, a + c, b + c);

		System.out.println(min);

		cin.close();
	}

	private static int getMin(int a, int b, int c) {
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}

		return min;
	}
}