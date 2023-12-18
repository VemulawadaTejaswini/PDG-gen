import java.util.*;
// warm-up
import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		boolean[] color = new boolean[8];
		int n = sc.nextInt(), mi=0, ma=0;
		while (n-->0) {
			int a = sc.nextInt();
			if (a/400>7) ma++;
			else color[a/400]=true;
		}
		for (boolean t : color) if (t) mi++;
		System.out.println(mi+" "+(mi+Math.min(8-mi, (ma==0 ? 0 : ma))));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}