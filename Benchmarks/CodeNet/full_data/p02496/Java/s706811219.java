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
			boolean[][] listCard = new boolean[4][13];
			ArrayList<String> list = new ArrayList<String>();
			BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.valueOf(ds.readLine());
			for(int i = 0; i < size; i++)
			{
				String s = ds.readLine();
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
				String mark = sz.nextToken();
				int a = perse(mark);
				int b = Integer.valueOf(sz.nextToken()) - 1;
				listCard[a][b] = true;
			}
			for(int i = 0; i < listCard.length; i++)
			{
				for(int j = 0; j < listCard[i].length; j++)
				{
					if(!listCard[i][j])
						System.out.println(unperse(i)+" "+(j+1));
				}
			}
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("Input Error");
		}
	}

	private static int perse(String mark)
	{
		if(mark.equals("S")) return 0;
		if(mark.equals("H")) return 1;
		if(mark.equals("D")) return 2;
		if(mark.equals("C")) return 3;
		return -1;
	}

	private static String unperse(int i)
	{
		return marks[i];
	}
	private static String marks[] = new String[] {"S", "H", "D", "C"};
}