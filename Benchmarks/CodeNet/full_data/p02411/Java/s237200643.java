import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1;; i++)
		{
			String str[] = input(3);
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			if(a == -1 && b == -1 && c == -1) break;
			if(a == -1 || b == -1 || a + b < 30) System.out.println("F");
			else if(a + b >= 80) System.out.println("A");
			else if(a + b >= 65) System.out.println("B");
			else if(a + b >= 50) System.out.println("C");
			else if(c >= 50) System.out.println("C");
			else System.out.println("D");
		}
	}

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

