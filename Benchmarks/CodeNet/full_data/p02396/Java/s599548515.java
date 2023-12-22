import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int x = sc.nextInt();

		int i;

		for (i = 1; i <= 10000; i++)
		{
			int x = sc.nextInt();
			if (x > 0) {
				System.out.println("Case " + i + ": " + x);
			} else {
				break;
			}
		}
	}
}