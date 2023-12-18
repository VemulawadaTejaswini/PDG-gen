import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		ArrayList<Integer> res = new ArrayList<Integer>();
		int cur = 1;
		for (int k = 99; k >= 0 && n >= 0; k--) {
			if (n >= (1 << k) - 1) {
				n -= (1 << k) - 1;
				for (int i = cur; i <= k; i++) res.add(i);
				for (int i = cur; i <= k; i++, cur++) res.add(i);
			}
		}
		System.out.println(res.size());
		for (int x : res) System.out.print(x + " ");
		System.out.println();
	}
}

