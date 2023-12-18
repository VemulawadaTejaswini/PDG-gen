import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		boolean[] color = new boolean[8];
		int n = sc.nextInt(), mi=0, ma=0;
		while (n-->0) {
			int a = sc.nextInt();
			if (a/400>=7) ma++;
			color[a/400>=7 ? 7 : a/400]=true;
		}
		for (boolean t : color) {
			if (t) mi++;
		}
		System.out.println(mi+" "+Math.min(8-mi, mi+(ma==0 ? 0 : ma-1)));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}
