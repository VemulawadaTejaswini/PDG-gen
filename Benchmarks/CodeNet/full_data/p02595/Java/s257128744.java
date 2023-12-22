import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			double d = sc.nextInt();
			int c=0;
			for(int i=0;i<n;i++)
			{
				long x = sc.nextInt();
				long y = sc.nextInt();
				double d1 = Math.sqrt((x*x) + (y*y));
				if(d1<=d) c++;
			}
			System.out.println(c);
	}
}
