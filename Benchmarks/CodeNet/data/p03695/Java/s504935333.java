import java.util.*;
// warm-up
// Maximum can be 8 colors or not.. Missed that
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
		System.out.println(mi+" "+(mi+ma));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}