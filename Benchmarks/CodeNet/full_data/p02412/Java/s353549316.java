import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		try
		{
			while(true)
			{
				String str[] = input(2);
				if(str[0].equals("0") && str[1].equals("0")) break;
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				int c = 0;
				for(int i = 1; i <= a ; i++)
				{
					for(int j = i+1; ; j++)
					{
						int k = b - i - j;
						//System.out.println(i + " " + j + " " + k + " " + (j >= k || k > a || k < 1));
						if(j >= k) break;
						if(k > a || k < 1) continue;
						c++;
					}
				}
				System.out.println(c);
			}
		}
		catch(IOException e)
		{
		}
	}

	/*
	public static int Calc(int[] a, int f, int e)
	{
		ArrayList<Integer> list[] = new ArrayList[2];
		return e;
	}
	//*/

	public static String[] input(int Num) throws IOException
	{
		String str[] = new String[Num];
		String str2 = br.readLine();
		int j = 0;
		for(int i = 0; i < Num; i++)
		{
			if(i < Num - 1)
			{
				str[i] = str2.substring(j, str2.indexOf(" ", j));
				j = str2.indexOf(" ", j) + 1;
			}
			else
			{
				str[i] = str2.substring(j);
			}
		}
		return str;
	}

}

