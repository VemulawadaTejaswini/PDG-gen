import java.util.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int d, r;
	static double f;

	public static void main(String[] args) {
		while(read()) {
			solve();
		}

	}

	static int a,b;
	static boolean read() {
		if(!sc.hasNextInt()) return false;
		a = sc.nextInt(); b = sc.nextInt();
		return true;
	}

	static void solve() {
		d = a / b;
		r = a % b;
		f = (double)a / (double)b;
		System.out.print(d +" " + r +" " + f);
	}

}