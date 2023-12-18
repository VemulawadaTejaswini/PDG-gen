import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt(), s = 0, t = 0;
		while (N>=A) {
			boolean ok = true; s = 0;
			for (char ch : (""+N).toCharArray()) s+=Character.getNumericValue(ch);
			if (s>=A && s<=B) t+=N;
			N--;
		}
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}
