import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in= new Scanner(System.in);
		while(in.hasNext())
		{
			int x=in.nextInt();
			int y=in.nextInt();
			int c=0;
			if((x|y)==0)
				return;
			while(y!=0)
			{
				int tmp=y;
				y=x%y;
				x=tmp;
				c++;
			}
			System.out.println(x+" "+c);
		}
	}
}