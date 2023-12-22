import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static String str;
	static int[][] memo;

	public static void main(String[] a) {
		str = sc.next();
		N = str.length();
		memo = new int[N + 1][N + 1];
		System.out.println(rec(0, N) ? "Cat" : "Rabbit");
	}

	static boolean rec(int s, int e) {
		if (s == e) return true;
		if (memo[s][e] != 0) return memo[s][e] == 1 ? true : false;
		if (str.charAt(s) != 'm') return false;
		if (str.charAt(e - 1) != 'w') return false;
		boolean ret = false;
		for (int i = s + 1; i < e - 1; ++i) {
			if (str.charAt(i) != 'e') continue;
			if (rec(s + 1, i) && rec(i + 1, e - 1)) {
				ret = true;
				break;
			}
		}
		memo[s][e] = ret ? 1 : -1;
		return ret;
	}

}