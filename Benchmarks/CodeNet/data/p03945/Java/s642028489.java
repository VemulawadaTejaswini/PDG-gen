import java.util.*;
// warm-up
// Awesome twist
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String tok = sc.next();
		int k=0;
		for (int i=0; i<tok.length()-1; i++) {
			if (tok.substring(i, i+2).equals("WB")) { k++; i++; }
		}
		for (int i=0; i<tok.length()-1; i++) {
			if (tok.substring(i, i+2).equals("BW")) { k++; i++; }
		}
		System.out.println(k);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}