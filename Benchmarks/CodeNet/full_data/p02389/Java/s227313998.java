import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String scs = sc.nextLine();
		String[] number = scs.split(" ");
		int num1 = Integer.parseInt(number[0]);
		int num2 = Integer.parseInt(number[1]);

		int ans1 = num1 * num2;
		int ans2 = num1 * 2 + num2 * 2;

		System.out.printf("%d %d\n", ans1, ans2);

	}

}