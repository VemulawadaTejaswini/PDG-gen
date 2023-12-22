import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[1000];
		int sum = 0;
		while(true)
		{
			str = br.readLine().split("");
			for(int i=0; i<str.length; i++)
			{
				sum += Integer.parseInt(str[i]);
			}
			if(sum==0)	break;
			System.out.println(sum);
			sum = 0;
		}
	}
}