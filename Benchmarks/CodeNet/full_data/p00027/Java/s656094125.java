import java.util.GregorianCalendar;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);

		while(in.hasNext())
		{
			int m=in.nextInt();
			int d=in.nextInt();
			GregorianCalendar g= new GregorianCalendar(2004, m-1, d);
			if((m|d)==0)
				return;
			String w[] ={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			System.out.println(w[g.get(GregorianCalendar.DAY_OF_WEEK)]);
		}
	}
}