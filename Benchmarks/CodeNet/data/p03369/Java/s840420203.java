import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int t = 700;
		for (char ch : sc.next().toCharArray()) t+=(ch=='o') ? 100 : 0;
		System.out.println(t);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}