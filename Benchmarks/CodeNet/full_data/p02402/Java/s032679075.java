import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int min = 1000000;
		int max = -1000000;
		long sum = 0;
		int num = 0;
		for(int i = 0;i < count;i++)
		{
			num = scan.nextInt();
			sum = sum + num;
			if(num < min)
			{
				min = num;
			}
			if(num > max)
			{
				max = num;
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}
}