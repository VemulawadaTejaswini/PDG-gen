import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==0)
				return;
			char ch[]=new char[n];
			char mo[]=new char[n];
			for(int i=0;i<n;i++)
			{
				ch[i]=in.next().charAt(0);
				mo[i]=in.next().charAt(0);
			}
			int  s =in.nextInt();
			char sh[] = new char[s];
			for(int i=0;i<s;i++)
				sh[i]=in.next().charAt(0);

			for(int i=0;i<s; i++)
			{
				for(int j=0;j<n;j++)
				{
					if(sh[i]==ch[j])
					{
						sh[i]=mo[j];
						break;
					}
				}
				System.out.print(sh[i]);
			}
			System.out.println();
		}
	}
}