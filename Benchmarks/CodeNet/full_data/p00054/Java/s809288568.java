import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);

		while(sc.hasNext())
		{
			double a =sc.nextDouble();
			double b =sc.nextDouble();

			int n=sc.nextInt();
			int sum=0;

			String str = String.valueOf(a/b);

			for(int i= 2;i<=n+1; i++)
			{

				if(i == str.length())
					break;
				sum+=Integer.valueOf(str.charAt(i)-48);
			}
			System.out.println(sum);
		}
	}

}