import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		BigInteger n = new BigInteger(sc.next());
		String[] cds = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		BigInteger index = BigInteger.valueOf(26);
		BigInteger nextVal = n;
		int exact = 0;
		StringBuilder ans = new StringBuilder();
		BigInteger border = BigInteger.ONE;
		
		while (true) {
			n = n.subtract(BigInteger.ONE);
			nextVal = n.divide(index);
			exact = n.mod(index).intValue();
			
			ans.insert(0, cds[exact]);
			
			if (nextVal.equals(BigInteger.ZERO)) {
				break;
			}
			n = nextVal;
		}
		System.out.println(ans);
	}
}
