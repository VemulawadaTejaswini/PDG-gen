import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String w = br.readLine();
		StringBuilder sb = new StringBuilder();
		String buf = "";
		while(buf != "END_OF_TEXT")
		{
			buf = br.readLine();
			sb.append(" " + buf.toLowerCase());
		}
		int chk = 0, sum = 0;
		while(true)
		{
			chk = sb.indexOf(" " + w + " ", chk);
			if(chk==-1)	break;
			sum++;
			chk++;
		}
		System.out.println(sum);
	}
}