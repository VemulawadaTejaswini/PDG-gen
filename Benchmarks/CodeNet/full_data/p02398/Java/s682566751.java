import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a,b,c,count=0;
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		for (int i = a; i <= b; i++)
		{
			if((c%i)==0)
			{
				count++;
			}			
		}
		System.out.println(count);
		

	}

}