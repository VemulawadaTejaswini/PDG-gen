import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		{
//			Scanner in = new Scanner(System.in);
//			long a = in.nextLong();
//			long b = in.nextLong();
//			long ret = 0;
//			for (long i = a; i <= b; i++) {
//				ret ^= i;
//			}
//			System.out.println(ret);
//		}
		{
			Scanner in = new Scanner(System.in);
			long a = in.nextLong();
			long b = in.nextLong();
			long ret = 0;
			//long p = 2;
			int bitCount = Long.bitCount(b);
			long p = BigInteger.valueOf(2).pow(Math.max(bitCount, 4)).longValue();

			//System.out.println("p:" + p);
				long count = (b - a + 1L) % (p * 2L);
				//System.out.println("  count:" + count);
				for (long i = b; i > b - count; i--) {
					//System.out.println("    i: " + i);
					ret ^= i;
				}
				p *= 2;
			System.out.println(ret);
		}
	}
}
