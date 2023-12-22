import java.util.Scanner;

public class Main
{
	static final Scanner s = new Scanner(System.in);
	static final String line = System.getProperty("line.separator");

	public static void main(String... args)
	{
		while(s.hasNextInt())
		{
			int n = s.nextInt();
			int i = 1;
			while(n != 0)
			{
				if((n & 1) != 0)
				{
					System.out.print(i + (n == 1 ? line : " "));
				}
				i <<= 1;
				n >>= 1;
			}
		}
	}
}