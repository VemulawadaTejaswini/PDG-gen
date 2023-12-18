import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), t=n, i=0;
		long[] a = new long[n];
		BigInteger o = BigInteger.ZERO, s = BigInteger.ZERO;
		while (t-->0) a[i++] = sc.nextLong();
		for (i=0; i<n; i++) {
			long k=a[i];
			int p = s.compareTo(BigInteger.ZERO), q = s.add(new BigInteger(""+a[i])).compareTo(BigInteger.ZERO);
			if (q==0) 
				a[i]=(p<0) ? BigInteger.ONE.subtract(s).longValue() : s.add(BigInteger.ONE).longValue();
			else if ((p<0 && q<0)||(p>0 && q>0)) 
				a[i]=(q<0) ? BigInteger.ONE.subtract(s).longValue() : BigInteger.ZERO.subtract(BigInteger.ONE).subtract(s).longValue();
			o = o.add(new BigInteger(""+Math.abs(k-a[i])));
			s = s.add(new BigInteger(""+a[i]));
		}
		System.out.println(o);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}