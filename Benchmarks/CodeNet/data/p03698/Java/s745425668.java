import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		boolean ok = true;
		int[] c = new int[256];
		for (char ch : sc.next().toCharArray()) {
			c[ch]++; 
			if (c[ch]>1) ok=false;
		}
		System.out.println(ok ? "yes" : "no");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}