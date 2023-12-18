import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n + 1];
		for(int i = 0; i < n + 1; i++) x[i] = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		Arrays.sort(x);
		for(int i = 0; i < n; i++) set.add(Math.abs(x[i] - x[i + 1]));
		int ans = 0;
		for(int key : set) {
			ans = gcd(ans, key);
		}
		System.out.println(ans);
	}


	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}

}


