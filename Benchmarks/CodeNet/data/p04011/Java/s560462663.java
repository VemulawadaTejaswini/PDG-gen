import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
		System.out.println(((n>k ? k : n)*x)+(((n-k>0) ? n-k : 0) *y));
		sc.close();
	}

	public static void main(String args[]) {
		solve();
	}

}
