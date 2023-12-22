import java.util.Scanner;

public class Add
{
	public static void main(String[] args)
	{
		int[] sum = new int[3];
		int[] sum1 = new int[3];
		for(int i = 0; i < 3;i++)
		{
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = in.nextInt();
			sum[i] = a + b;
		}
		for(int i = 0; i < 3; i++)
		{
			sum1[i] = String.valueOf(sum[i]).length();
			System.out.println(sum1[i]);
		}
	}

}