import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			double xa1=in.nextDouble(),ya1=in.nextDouble(),xa2=in.nextDouble(),ya2=in.nextDouble();
			double xb1=in.nextDouble(),yb1=in.nextDouble(),xb2=in.nextDouble(),yb2=in.nextDouble();

			if(xa1<=xb2&&xb1<=xa2&&ya1<=yb2&&yb1<=ya2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}