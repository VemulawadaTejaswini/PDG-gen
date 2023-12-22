import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		BigInteger n = new BigInteger(sc.next());
		String[] cds = new String[]{"z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"};
		
		BigInteger index = BigInteger.valueOf(26);
		BigInteger nextVal = null;
		int exact = 0;
		StringBuilder ans = new StringBuilder();
		while (true) {
			nextVal = n.divide(index);
			exact = n.mod(index).intValue();
			
			ans.insert(0, cds[exact]);
			if (nextVal.equals(BigInteger.ZERO)) {
				break;
			} else if (nextVal.equals(BigInteger.ONE) && exact == 0) {
				break;
			}
			
			n = nextVal;
		}
		System.out.println(ans);
	}
}
