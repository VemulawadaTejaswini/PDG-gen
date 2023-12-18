import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String s = String.join("", sc.nextLine().split(" "));
		System.out.println(Integer.parseInt(s)%4==0 ? "YES" : "NO");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}