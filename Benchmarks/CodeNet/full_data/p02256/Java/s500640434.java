import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		BigInteger bi1=new BigInteger(scan.next());
		BigInteger bi2=new BigInteger(scan.next());
		System.out.println(bi1.gcd(bi2));
	}
}