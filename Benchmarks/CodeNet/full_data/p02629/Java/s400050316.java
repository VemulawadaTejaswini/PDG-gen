import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		String [] a = {"z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
			"u", "v", "w", "x", "y", "z"};
		Scanner sc = new Scanner(System.in);
		String ns = sc.nextLine();
		sc.close();
		BigInteger n = new BigInteger(ns);
		int [] ans = new int[100];

		int i = 0;
		for (i=0; i<100; i++) {
			ans[i]=n.mod(new BigInteger("26")).intValue();
			if (n.compareTo(new BigInteger("26"))<=0) break;
			n = n.divide(new BigInteger("26"));
		}

		for (int j=i; j>=0;j--) {
			System.out.print(a[ans[j]]);
		}
	}
}
