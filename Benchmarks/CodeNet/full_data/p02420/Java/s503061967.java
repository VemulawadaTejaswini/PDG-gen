import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<String> strs = new ArrayList<String>();
		int num = 0, shuff = 0;
		String buf = "";
		
		while(true)
		{
			sb.append(br.readLine());
			if(sb.toString()=="-")	break;
			num = Integer.parseInt(br.readLine());
			for(int i=0; i<num; i++)
			{
				shuff = Integer.parseInt(br.readLine());
				buf = sb.substring(0, shuff);
				sb.delete(0, shuff);
				sb.append(buf);
			}
			strs.add(sb.toString());
			sb.delete(0, sb.length() - 1);
		}
		for(int i=0;i<strs.size(); i++)
		{
			System.out.println(strs.get(i));
		}
	}
}