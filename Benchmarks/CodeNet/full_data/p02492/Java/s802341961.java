import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int a,b;
	static String op;

	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}


	static boolean read() {
		if(!sc.hasNext()) return false;
		a = sc.nextInt();
		op = sc.next();
		b = sc.nextInt();

		if(op.equals("?")) return false;
		return true;
	}

	static void solve()	{
		int ans = 0;
		if(op.equals("+")) {
			ans = a + b;
		}
		if(op.equals("-")) {
			ans = a - b;
		}
		if(op.equals("*")) {
			ans = a * b;
		}
		if(op.equals("/")) {
			ans = a / b;
		}
		System.out.println(ans);

		return;

	}
}