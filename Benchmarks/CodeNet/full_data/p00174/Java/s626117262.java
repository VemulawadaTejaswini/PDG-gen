import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			char c[]=in.next().toCharArray();
			if(c[0]=='0')
				return;
			int sa=0;
			int sb=0;
			for(int i=1;i<c.length;i++)
			{
				if(c[i]=='A')
					sa++;
				else 
					sb++;
				if(i==c.length-1)
				{
					if((sa+1-sb)>=2)
						sa++;
					else if(sb+1-sa>=2)
						sb++;
					else if((sa+1)==11)
						sa++;
					else if((sb+1)==11)
						sb++;
				}
			}
			System.out.println(sa+" "+sb);
		}
	}
}