import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String op = "+-";
		int a = Integer.parseInt(sc.next().trim());
		if (op.indexOf(sc.next().trim())==0) {
			int b = Integer.parseInt(sc.next().trim());
			System.out.println(a+b);
		} else {
			int b = Integer.parseInt(sc.next().trim());
			System.out.println(a-b);
		} 
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}