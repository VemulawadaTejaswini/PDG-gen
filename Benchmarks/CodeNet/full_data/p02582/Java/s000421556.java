
import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=0;
		for (char ch : sc.next().toCharArray()) if (ch=='R') n++;
		System.out.println(n);
		sc.close();	
	}

	public static void main(String args[]) {
		solve();
	}

}
