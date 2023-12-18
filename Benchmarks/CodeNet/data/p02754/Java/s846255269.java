import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int search = sc.nextInt();
		int blue = sc.nextInt();
		int red = sc.nextInt();

		int total = 0;
		int blueCount = 0;

		while(true)
		{
			total += blue;
			blueCount += blue;

			if(search <= total)
			{
				int div = total - search;
				blueCount -= div;
				break;
			}

			total += red;

			if(search <= total) break;
		}

		System.out.println(blueCount);

	}
}
