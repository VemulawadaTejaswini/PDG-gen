import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		double x=0, y=0;
		int angle = 90;
		for(;;)
		{
			String s = scanner.next();
			String[] str = s.split(",");
			
			int d = Integer.parseInt(str[0]);
			int a = Integer.parseInt(str[1]);
			if(d==0 && a==0)
			{
				break;
			}
			
			double rad = Math.toRadians(angle);
			x -= d * Math.cos(rad);
			y += d * Math.sin(rad);
			
			angle += a;
		}
		
		System.out.println((int)x);
		System.out.println((int)y);
	}
}