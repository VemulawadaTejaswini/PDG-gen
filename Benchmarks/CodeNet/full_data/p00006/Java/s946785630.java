import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null)
		{
			StringBuilder sb =new StringBuilder();
			for(int i=str.length()-1;i>=0;i--)
			{
				sb.append(str.substring(i, i+1));
			}
			System.out.println(sb);

		}
	}
}