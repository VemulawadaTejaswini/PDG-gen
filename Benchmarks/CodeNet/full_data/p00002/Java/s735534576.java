import java.util.Scanner;

public class Add
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int sum = a + b;
			
			int k = String.valueOf(sum).length();
			System.out.println(k);
		}
	}
}