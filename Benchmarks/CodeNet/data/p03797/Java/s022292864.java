import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.substring(0, str.indexOf(" ")));
		int M = Integer.parseInt(str.substring(str.indexOf(" ") + 1));
		int s = 0;
		while(true)
		{
			if(N > 0 && M > 1)
			{
				N--;
				M -= 2;
				s++;
			}
			else if(M > 3)
			{
				M -= 4;
				s++;
			}
			else
			{
				break;
			}
		}
		System.out.println(s);
	}
}