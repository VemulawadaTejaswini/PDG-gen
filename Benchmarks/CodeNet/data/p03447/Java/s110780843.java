import java.util.*;
// warm-up
// Do i have to? Donuts? Cake? 
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		System.out.println(X-A-(((X-A)/B)*B));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}