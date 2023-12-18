
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(BR.readLine()); boolean Finished = false;
		for (int a = -100000; a <= 100000; a++)
		{
			System.out.println(a);
			long Multiple = (long)(a) * (long)(a) * (long)(a) * (long)(a) * (long)(a);
			for (int b = -100000; b <= 100000; b++)
			{
				long sMultiple = (long)(b) * (long)(b) * (long)(b) * (long)(b) * (long)(b);
				if (Multiple - sMultiple == X)
				{				
					System.out.println(a + " " + b);
					Finished = true;
					break;
				}
			}
			if (Finished) break;
		}
	}
}
