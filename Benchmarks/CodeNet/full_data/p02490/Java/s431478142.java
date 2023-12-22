import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			ArrayList<String> list = new ArrayList<String>();
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				String s = d.readLine();
				if(s != null && s != "" && !s.equals("0 0"))
				{
					list.add(s);
				} else
				{
					break;
				}
			}
			for(int i = 0; i < list.size(); i++)
			{
				String s = list.get(i);
				StringTokenizer sz = new StringTokenizer(s);
				int a = Integer.parseInt(sz.nextToken());
				int b = Integer.parseInt(sz.nextToken());
				System.out.println(b+" "+a);
			}
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("Input Error");
		}
	}
}