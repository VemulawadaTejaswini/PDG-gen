import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String[] p = {"012","021","102","120","201","210"};
		int[] b = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		boolean ok = false;
		for (String a: p) {
			int i=Character.getNumericValue(a.charAt(0)),
			j=Character.getNumericValue(a.charAt(1)),
			k=Character.getNumericValue(a.charAt(2));
			if (b[i]+b[j]==b[k]) {
				ok=true; break;
			}
		}
		System.out.println(ok ? "Yes" : "No");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}