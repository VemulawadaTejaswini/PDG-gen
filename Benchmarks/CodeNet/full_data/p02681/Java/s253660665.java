
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] Arguments) throws IOException
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String S = BR.readLine(), T = BR.readLine();
		if (S.equals(T.subSequence(0, T.length() - 1))) System.out.println("Yes");
		else System.out.println("No");
	}
}
