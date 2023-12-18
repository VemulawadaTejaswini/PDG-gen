import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Qa2 
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String N = BR.readLine();
		if (N.charAt(0) == '7' || N.charAt(1) == '7' || N.charAt(2) == '7') System.out.println("Yes");
		else System.out.println("No");
	}
}
