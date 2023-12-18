import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		BigInteger array[] = new BigInteger[n * 3];
		for (int i = 0; i < array.length; i++) {
			array[i] = BigInteger.valueOf(s.nextInt());
		}
		s.close();
		System.out.println(Main.calc(n, array));
	}

	private static BigInteger calc(int n, BigInteger[] array) {
		BigInteger res = BigInteger.ZERO;
		java.util.Arrays.sort(array, java.util.Collections.reverseOrder());
		for (int i = n; i < n * 2; i++) {
			res = res.add(array[i]);
		}
		return res;
	}
}