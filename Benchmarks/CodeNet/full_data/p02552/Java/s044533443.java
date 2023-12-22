import java.util.*;
import java.math.*;

public class A {
	static Scanner sc = new Scanner(System.in);

	void solve() {
		try {
			int num = sc.nextInt();
			if (num == 1)
				System.out.println(0);
			else
				System.out.println(1);
		} catch (Exception e) {
			return;
		}
	}

	public static void main(String[] args) {
		A ob = new A();
		ob.solve();
	}
}