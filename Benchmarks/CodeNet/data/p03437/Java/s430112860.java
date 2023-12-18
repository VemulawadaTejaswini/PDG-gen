import java.util.*;
/*being john malkovich*/
public class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		if(x%y == 0 || y%x == 0)
			System.out.println("-1");
		else
		{
			if(x < y)
			System.out.println(2*x);
			else
			System.out.println(2*y);
		}
	}

}