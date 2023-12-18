
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
		Set<Integer> s = new HashSet<Integer>();
		int max = (int) Math.sqrt(n);
		for (int i = 2; i < max; i++) {
			while (n % i == 0) {
				n = n / i;
				s.add(i);
			}
		}
		int k = Integer.MAX_VALUE;
		for (int i : s) {
			k = Math.min(k, sum(n));
			for (int time = 2; i < 10000; time++) {
				k = Math.min(k, sum(n * time));
			}
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