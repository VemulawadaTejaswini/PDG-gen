import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while((s = br.readLine())!=null && !s.isEmpty())
		{
			int m = Integer.parseInt(s.split(" ")[0]);
			int d = Integer.parseInt(s.split(" ")[1]);
			
			if(m==0&&d==0) break;
			else 			System.out.println(calc_days(m, d));
		}
	}
		
	private static String calc_days(int month, int day)
	{
		String[] days = {"Thursday", "Friday" ,"Saturday", "Sunday","Monday", "Tuesday", "Wednesday"};
		// days of a month
		int[] days_m = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		//calculate days from Jan 1st, Thursday.
		int m = 0, count=0;
		while((m+1)!=month)
		{
			count += days_m[m];
			m++;
		}
		count += (day - 1);
		return days[count%7];
	}	
}
	