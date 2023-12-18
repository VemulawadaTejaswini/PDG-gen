import java.util.Scanner;

public class Main {

	static int[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		memo = new int[100010];
		for(int i = 0 ; i < 100010 ; i++) {
			memo[i] = -1;
		}
		System.out.println(rec(n));
	}

	static int rec(int x) {
		if(x == 0) return 0;
		if(memo[x] != -1) return memo[x];
		int res = x;
	    for (int pow6 = 1; pow6 <= x; pow6 *= 6) res = Math.min(res, rec(x - pow6) + 1);
	    for (int pow9 = 1; pow9 <= x; pow9 *= 9) res = Math.min(res, rec(x - pow9) + 1);
		return memo[x] = res;
	}
}
