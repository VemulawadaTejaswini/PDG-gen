import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int noc=sc.nextInt(),k=sc.nextInt(),i=0,j=0,n=noc,m=Integer.MIN_VALUE;
		BigInteger s = BigInteger.ZERO;
		BigInteger maxVal = new BigInteger("-1000000001");
		int[] a = new int[noc];
		BigInteger[] c = new BigInteger[noc];
		while (noc-->0) a[i++]=sc.nextInt();
		noc=n;i=0;
		while (noc-->0) c[i++]=sc.nextBigInteger();
		noc=n;
		while (noc-->0) {
			if (c[noc].intValue()>m) { m=c[noc].intValue(); i=noc; } 
		}
		while (k-->0) {
			s = s.add(c[i]);
			maxVal = s.max(maxVal);
			i=a[i]-1;
		}
		System.out.println(maxVal);
		sc.close();	
	}

	public static void main(String args[]) {
		solve();
	}

}
