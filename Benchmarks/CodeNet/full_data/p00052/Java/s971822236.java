import java.util.*;
import java.util.regex.*;
import java.math.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pattern p = Pattern.compile("0+$");
		int l = in.nextInt();
		while(l-->0) {
			long n = in.nextLong();
			if(n==0L) break;
			BigInteger bi = BigInteger.valueOf(n);
			for(long i = n-1L; i > 0; i--) bi = bi.multiply(BigInteger.valueOf(i));
			Matcher m = p.matcher(bi.toString());
			System.out.println(m.find()?m.group().length():0);
		}
	}
}