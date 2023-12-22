
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d = sc.nextInt();
		d = d*d;
		int count =0;
		for(int i=0;i<n;i++)
		{
			long x = sc.nextInt();
			long y = sc.nextInt();
			
			x=x*x;
			y=y*y;
			
			if(x>d || y>d)
				continue;
			else if( (x==d && y==0) || (y==d && x==0))
				count++;
			else
			{
				if(x+y<=d)
					count++;
			}
		}
		System.out.println(count);
	}

}
