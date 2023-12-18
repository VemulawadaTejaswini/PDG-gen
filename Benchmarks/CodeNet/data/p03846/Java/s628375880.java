import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	static Set<Integer> a = new HashSet<Integer>();
	static Set<Integer> b = new HashSet<Integer>();

	static void solve() {
		Scanner sc = new Scanner(System.in);
		BigInteger m = new BigInteger("1000000007");
		int n=sc.nextInt();
		while (n-->0) {
			int c = sc.nextInt();
			if (c==0) continue;
			if (a.contains(c)) b.add(c);
			else a.add(c);
		}
		if (a.size()==b.size()) System.out.println(new BigInteger("2").pow(a.size()).mod(m));
		else System.out.println(0);
		sc.close();				
	}

	public static void main(String args[]) {
		solve();
	}

}