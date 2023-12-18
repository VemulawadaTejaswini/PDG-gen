import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long ans = 0;
		BigInteger md = new BigInteger("2019");
		for(int i = 0; i < s.length(); i++) {
			for(int j = i + 3; j < s.length(); j++) {
				BigInteger attempt = new BigInteger(s.substring(i, j + 1));
				BigInteger res = attempt.mod(md);
				if(res.equals(new BigInteger("0"))) ans += 1L;
			}
		}
		System.out.println(ans);
	}
}