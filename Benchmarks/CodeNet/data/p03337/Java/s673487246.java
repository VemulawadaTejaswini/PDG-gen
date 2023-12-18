import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = a+b;
		int y = a-b;
		int z = a*b;
		int max = x;

		if (max < y) {
			max = y;
		}

		if (max < z) {
			max = z;
		}

		System.out.println(max);

		scan.close();

	}

}
