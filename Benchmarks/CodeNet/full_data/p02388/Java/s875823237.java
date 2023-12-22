import java.io.*;

class Main
{
	public static void main (String[] args)
	{
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String s = r.readLine();
		int x = Integer.parseInt(s);
		System.out.println(x * x * x);
	}
}