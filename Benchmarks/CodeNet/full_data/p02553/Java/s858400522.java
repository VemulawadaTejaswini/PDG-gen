import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();


		BigInteger[] ans = new BigInteger[4];
		ans[0] = BigInteger.valueOf(a).multiply(BigInteger.valueOf(c));
		ans[1] = BigInteger.valueOf(a).multiply(BigInteger.valueOf(d));
		ans[2] = BigInteger.valueOf(b).multiply(BigInteger.valueOf(c));
		ans[3] = BigInteger.valueOf(b).multiply(BigInteger.valueOf(d));
		Arrays.sort(ans);
		System.out.println(ans[3]);

	}
}