import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		int gcd, lcm;
		while((s=br.readLine())!=null)
		{
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);

			gcd = gcd(a,b);
			lcm = lcm(a,b);
			System.out.println(gcd + " " + lcm);
		}
	}

	public static int gcd(int a, int b)
	{
		if(b==0) return a;
		else     return gcd(b, a%b);
	}

   	public static int lcm(int a, int b)
	{
		// a * b = gcd * lcm
		b /= gcd(a,b);
		return a * b;
	}
}