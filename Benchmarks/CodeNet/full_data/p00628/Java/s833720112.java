import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String str = in.nextLine();
			if(str.equals("END OF INPUT"))
				return;
			char ch[]=str.toCharArray();
			int c=0;
			for(int i=0; i<ch.length; i++)
			{
				if(ch[i]!=' ')
					c++;
				if(ch[i]==' '||i==ch.length-1)
				{
					if(i+1<ch.length&&ch[i+1]==' ')
					{
						System.out.print(c);
						while(ch[i]==' ')
							i++;
						System.out.print(0);
						c=0;
						i--;
						continue;
					}
					System.out.print(c);
					c=0;
				}
			}
			System.out.println();
		}
	}
}