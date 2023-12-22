import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static final boolean debugMode = false;

	static int[] mark;
	static int[] cost;
	static Map<Integer, Set<Integer>> linkList;
	static int n;
	static int m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = readInt(sc);
		m = readInt(sc);
		mark = new int[n + 1];
		cost = new int[n + 1];

		linkList = new HashMap<Integer, Set<Integer>>();

		for (int i = 0; i < m; i++) {
			int a = readInt(sc);
			int b = readInt(sc);
			Set s = linkList.get(a);
			if (s == null)
				linkList.put(a, new HashSet<Integer>() {
					{
						add(b);
					}
				});
			else
				s.add(b);

			s = linkList.get(b);
			if (s == null)
				linkList.put(b, new HashSet<Integer>() {
					{
						add(a);
					}
				});
			else
				s.add(a);

		}

		mark[1] = 1;
		dfs(1);

		String res = "";
		for (int i = 2; i < n + 1; i++) {
			if (mark[i] == 0) {
				System.out.println("No");
				return;
			}
			res += mark[i] + System.lineSeparator();
		}
		System.out.println("Yes");
		System.out.println(res);
	}

	static void dfs(int start) {
		Set<Integer> list = linkList.get(start);
		if (list == null)
			return;

		for (int next : list) {
			if (mark[next] != 0 && cost[start] + 1 >= cost[next]) { // visited
				continue;
			}

			mark[next] = start;
			cost[next] = cost[start] + 1;
			dfs(next);
		}
	}

	static int readInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	static Long readLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static void log(String s) {
		if (debugMode) {
			System.out.println(s);
		}
		return;
	}
}

class KrmlUtil {
	// a >= b
	static int gcd(int a, int b) {
		while (true) {
			if (b == 0)
				break;

			int mod = a % b;
			a = b;
			b = mod;
		}
		return a;
	}

	// a >= b
	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	// a >= b
	static long gcd(long a, long b) {
		while (true) {
			if (b == 0)
				break;

			long mod = a % b;
			a = b;
			b = mod;
		}
		return a;
	}

	// a >= b
	static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

	static BigInteger gcd(BigInteger a, BigInteger b) {
		return a.gcd(b);
	}

	static BigInteger lcm(BigInteger a, BigInteger b) {
		return a.divide(a.gcd(b)).multiply(b);
	}
}

class Pair {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Pair() {

	}

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
