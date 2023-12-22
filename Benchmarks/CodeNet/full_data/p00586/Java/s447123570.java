import java.util.Scanner;
import java.math.BigInteger;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			BigInteger a = new BigInteger(sc.next());
			BigInteger b = new BigInteger(sc.next());
			System.out.println(a.add(b).toString());
		}
	}
}