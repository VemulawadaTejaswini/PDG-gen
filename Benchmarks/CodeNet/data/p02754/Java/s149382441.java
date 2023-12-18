import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int blue = sc.nextInt();
		int red = sc.nextInt();

		int total = 0;
		int blueCount = 0;

		while(true)
		{
			total += blue;
			blueCount += blue;

			if(N <= total)
			{
				int div = N - total;
				blueCount -= div;
				break;
			}

			total += red;

			if(N <= total) break;
		}

		System.out.println(blueCount);

	}
}
