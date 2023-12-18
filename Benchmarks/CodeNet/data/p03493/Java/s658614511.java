import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int t = 0;
		for (char ch : sc.next().toCharArray()) if (ch=='1') t++;
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}