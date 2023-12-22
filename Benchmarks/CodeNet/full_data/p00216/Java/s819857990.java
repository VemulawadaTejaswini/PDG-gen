import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext())
		{
			int n = in.nextInt();
			if(n==-1)
				return;
			int uti = 1150;
			int be = 4280;
			int count=11;
			if(n>10)
				while(count<=20&&count<=n)
				{
					uti+=125;
					count++;
				}
			if(n>20)
				while(count<=30&&count<=n)
				{
					uti+=140;
					count++;
				}
			if(n>30)
				while(count<=n)
				{
					uti+=160;
					count++;
				}

			System.out.println(be-uti);
		}
	}
}