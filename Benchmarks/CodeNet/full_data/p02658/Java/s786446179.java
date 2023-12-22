import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long Num = sc.nextLong();

		BigInteger resultMul = new BigInteger("1");
		long resultMax = (long) Math.pow(10, 18);
		long tmp;

		for (long i=0;i<Num;i++) {
			tmp = sc.nextLong();
			if(tmp == 0) {
				resultMul = new BigInteger("0");
				break;
			}
			if(resultMul.compareTo(new BigInteger("0")) > 0) {
				resultMul = resultMul.multiply(new BigInteger(String.valueOf(tmp)));
				if(resultMul.compareTo(new BigInteger(String.valueOf(resultMax))) > 0) {
					resultMul = new BigInteger("-1");
				}
			}

		}

		System.out.println(resultMul.longValue());
		sc.close();

	}

}