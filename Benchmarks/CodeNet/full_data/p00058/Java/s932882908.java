import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			double ax=sc.nextDouble();
			double ay=sc.nextDouble();
			double bx=sc.nextDouble();
			double by=sc.nextDouble();
			double cx=sc.nextDouble();
			double cy=sc.nextDouble();
			double dx=sc.nextDouble();
			double dy=sc.nextDouble();
			double m1 = (ax - bx)/(ay-by);
			double m2 = (cx - dx)/(cy-dy);
			if(ay-by==0)
				m1=0;
			if(cy-dy==0)
				m2=0;

			//System.out.println(m1+" "+m2);
			if(m1*m2==-1)
				System.out.println("YES");
			else if(ax-bx==0 && cy-dy==0 ||cx-dx==0 && ay-by==0 )
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}