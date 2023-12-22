import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n[] = new int[5];
		for (int i = 0; i < 5; i++)
			n[i] = sc.nextInt();
		Arrays.sort(n);
		for (int i = 4; i > 0; i--)
		{
			System.out.print(Integer.toString(n[i]) + " ");
		}
		System.out.println(n[0]);
	}
}