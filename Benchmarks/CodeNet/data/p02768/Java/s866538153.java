import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		int n = sc.nextInt();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		BigInteger ans = 0;

		for(int i=1;i<=n;i++) {
			if(i!=a && i!=b) {

				BigInteger bunsi = new BigInteger("1");
				for(BigInteger j=0;j<i;j++) {

					BigInteger kake = new BigInteger("n-j");
					bunsi = bunsi.multiply(kake);
				}
				BigInteger bunbo = new BigInteger("1");
				for(BigInteger j=0;j<i;j++) {
					BigInteger kake = new BigInteger("j+1");

					bunbo = bunbo.multiply(kake);
				}

//				System.out.println(bunsi + "," + bunbo);
				BigInteger nci =  bunsi.divide(bunbo);
				ans = ans.add(nci);

			}
		}

		BigInteger waru = new BigInteger("1000000007");

		ans = ans.remainder(waru);

		System.out.println(ans);

	}
}
