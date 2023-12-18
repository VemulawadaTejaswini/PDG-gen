import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int res = 0;

	public static void main(String[] args) throws Exception {

		int n = sc.nextInt();
		System.out.println(helper(n));

	}

	Set<Integer> s = new HashSet<Integer>();

	private static int helper(int n) {
		// TODO Auto-generated method stub
		int k = Integer.MAX_VALUE;
		k = Math.min(k, sum(n));
		for (int time = 2; time < 10000000; time++) {
			k = Math.min(k, sum(n * time));
		}
		return k;
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		int res = 0;
		while (n != 0) {
			res += n % 10;
			n = n / 10;
		}
		return res;
	}

}