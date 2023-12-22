import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String str = sc.next();
			char ch[] = str.toCharArray();
			
			if(ch.length>=3 && ch.length<=6)
			for(int i=0; i<ch.length; i++)
			{
				if(ch[i]!=',' &&ch[i]!='.')
				System.out.print(ch[i]);
				if(i==ch.length-1)
					System.out.print(" ");
			}
		}
	}
}