import java.math.BigInteger;
import java.util.Scanner;


public class main
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int dataset = scan.nextInt();
		for(int i = 0; i < dataset; i++)
		{
			BigInteger a = scan.nextBigInteger();
			BigInteger b = scan.nextBigInteger();
			System.out.println(a.add(b));
		}
	}
}