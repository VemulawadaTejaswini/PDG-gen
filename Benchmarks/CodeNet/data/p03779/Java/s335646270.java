import java.util.*;

// UVa 11504

public class Main {

	static int dst;
	static HashMap<String, Integer> memo;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		dst = in.nextInt();
		memo = new HashMap<String, Integer>();
		System.out.println(solve(1, dst) - 1);
	}
	
	public static int solve(int i, int x) {
		String s = "" + i + ":" + x;
		if (x == 0) {
			return i;
		}
		if (memo.containsKey(s)) {
			return memo.get(s);
		}
		if (x < 0) {
			return Integer.MAX_VALUE;
		}
		if (i > dst) {
			return Integer.MAX_VALUE;
		}
		int a = solve(i + 1, x - i);
		int b = solve(i + 1, x + i);
		int c = solve(i + 1, x);
		
		int answer = Math.min(Math.min(a, b), c);
		memo.put(s, answer);
		
		return answer;
	}
}
