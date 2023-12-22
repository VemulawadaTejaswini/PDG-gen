import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		while(ab.hasNext())
		{
		
		int a = ab.nextInt();
		
		int b = ab.nextInt();
		
		int c = ab.nextInt();
		
		int d = ab.nextInt();
		
		int e = ab.nextInt();
		
		int f = ab.nextInt();
		
		int x = (c*e - f*b)/ (a*e - b*d);
		
		int y = (a*f - c*d)/(a*e - b*d);
		
		if( x == -0)
		{
			x = 0;
		}
		
		if( y == -0 )
		{
			y = 0;
		}
		
		System.out.printf("%d.000 %d.000\n",x,y);
		
		
		
		}
	}

}