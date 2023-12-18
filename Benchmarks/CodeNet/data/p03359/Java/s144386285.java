import java.util.*;
// Good catch
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(a>b ? a-1 : a);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}