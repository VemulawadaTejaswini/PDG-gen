import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 2101
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			ArrayList<Integer> div = divisor(N);
			div.remove(div.indexOf(N));
			int S = 0;
			for (int i = 0; i < div.size(); i++) S += div.get(i);
			if (N > S) {
				System.out.println("deficient number");
			} else if (N < S) {
				System.out.println("abundant number");
			} else {
				System.out.println("perfect number");
			}
		}
	}
	
	public static ArrayList<Integer> divisor(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				ret.add(i);
				if (i != (n / i)) ret.add(n / i);
			}
		}
		return ret;
	}
}