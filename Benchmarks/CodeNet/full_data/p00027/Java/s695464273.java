import java.util.GregorianCalendar;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);

		while(in.hasNext())
		{
//			解1
//			int m=in.nextInt();
//			int d=in.nextInt();
//			GregorianCalendar g= new GregorianCalendar(2004, m-1, d);
//			if((m|d)==0)
//				return;
//			String w[] ={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//			System.out.println(w[g.get(GregorianCalendar.DAY_OF_WEEK)]);
			
			//解2
			int m=in.nextInt();
			int d=in.nextInt();
			int  da[] = {31,29,31,30,31,30,31,31,30,31,30,31};
			String we[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
			int day =2+d;
			for(int i=0; i<m-1; i++)
				day+=da[i];
			System.out.println(we[day%7]);
		}
	}
}