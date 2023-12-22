import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		double x=0;
		double y=0;
		double angle=0;
		while(in.hasNext())
		{
			String str[]=in.next().split(",");
			int  go=Integer.parseInt(str[0]);
			int  an=Integer.parseInt(str[1]);
			if((go|an)==0)
				break;
			x+=go*Math.sin(angle*Math.PI/180);
			y+=go*Math.cos(angle*Math.PI/180);
			angle+=an;
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}

}