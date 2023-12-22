import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int noc=sc.nextInt(), i=0, n=noc;
		BigInteger t = BigInteger.ZERO;
		int[] a = new int[noc];
		while (noc-->0) a[i++] = sc.nextInt();
		for (i=0; i<n-1; i++) {
			if (a[i]>a[i+1]) {
				t = t.add(new BigInteger(""+(a[i]-a[i+1])));
				a[i+1]=a[i];
			}
		}
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}
