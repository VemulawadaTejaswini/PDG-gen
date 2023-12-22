import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		String seven[] = {
				"0111111",
				"0000110",
				"1011011",
				"1001111",
				"1100110",
				"1101101",
				"1111101",
				"0100111",
				"1111111",
				"1101111"
		};
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==-1)
				return;
			String a="0000000";
			for(int i=0;i<n;i++)
			{
				int se=in.nextInt();
				for(int j=0;j<7;j++)
				{
					if(a.charAt(j)!=seven[se].charAt(j))
						System.out.print(1);
					else
						System.out.print(0);
				}
				System.out.println();
				a=seven[se];
			}
		}
	}

}