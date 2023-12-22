
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		long X = Long.parseLong(BR.readLine()); long Start = 100l;
		int Years = 0;
		while (Start < X)
		{
			Start *= 1.01;
			Years++;
		}
		System.out.println(Years);
	}
}
