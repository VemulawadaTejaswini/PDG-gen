import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
		System.out.println((X-Z)/(Y+Z));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}