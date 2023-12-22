import java.io.*;

class Main
{
	public static void main (String[] args)
	{
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String x = r.readLine();
		Integer.parseInt(x);
		System.out.println(x * x * x);
	}
}