import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		String str[] = input(3);
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int d;
		if(a > b)
		{
			d = b;
			b = a;
			a = d;
		}
		if(a > c)
		{
			d = c;
			c = a;
			a = d;
		}
		if(b > c)
		{
			d = c;
			c = b;
			b = d;
		}
		System.out.println(a + " " + b + " " + c);
	}

	public static String[] input(int Num) throws IOException
	{
		String str[] = new String[Num];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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

