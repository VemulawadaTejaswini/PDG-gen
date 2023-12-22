import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[])
	{
		int a;
			a = sc.nextInt();
		int b;
			b = sc.nextInt();
		int c;
			c = sc.nextInt();

		int[] intArr = {a, b, c};
		Arrays.sort(intArr);

		System.out.println(intArr[1] + " " + intArr[2] + " " + intArr[3]);
	}
}