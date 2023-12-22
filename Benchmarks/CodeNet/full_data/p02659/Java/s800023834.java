import java.math.BigInteger;
import java.util.Scanner;
// A - Multiplication 1
class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Long A= sc.nextLong();

		double B= sc.nextDouble()*100;

		BigInteger ans = BigInteger.valueOf(0);

//		ans = BigInteger.valueOf(A).multiply(Long.valueOf(String.valueOf(B)));
		ans = BigInteger.valueOf(A).multiply(BigInteger.valueOf(Long.valueOf(String.valueOf(B).substring(0, String.valueOf(B).indexOf(".")))));

		ans = ans.divide(BigInteger.valueOf(100));

//		System.out.println(String.valueOf(B));
//		System.out.println(String.valueOf(B).indexOf("."));
//		System.out.println(String.valueOf(B).substring(0, String.valueOf(B).indexOf(".")));

		System.out.println(ans);
	}
}