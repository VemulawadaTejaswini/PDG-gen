import java.math.BigInteger;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long K = sc.nextLong();
		long[] map = new long[(int)N];
		int[] bitCount = new int[40];
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			map[i] = a;
			String bin = Long.toBinaryString(a);
			int count = 0;
			for (int j = bin.length()-1; 0 <= j; j--) {
				if (bin.charAt(j) == '1') {
					bitCount[count]++;
				}
				
				count++;
			}
		}
		
		long base = N / 2 + (N % 2);
		
		BigInteger f = BigInteger.ZERO;
		for (int i = 0; i < 40; i++) {
			if (bitCount[i] < base) {
				BigInteger target = BigInteger.valueOf((long) Math.pow(2, i));
				f = f.add(target);
				if (f.compareTo(BigInteger.valueOf(K)) > 0) {
					f = f.subtract(target);
					break;
				}
			}
		}
		
		BigInteger ans = BigInteger.ZERO;
		for (int i = 0; i < N; i++) {
			ans = ans.add(BigInteger.valueOf(map[i]).xor(f));
		}
		
		System.out.println(ans.toString());
	}
}
