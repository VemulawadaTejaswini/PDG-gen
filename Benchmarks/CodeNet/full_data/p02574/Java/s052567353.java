import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	private static HashSet<Integer> primeFactor(int n) {
		HashSet<Integer> ans = new HashSet<Integer>();
		if (n == 1) {
			ans.add(1);
			return ans;
		}
		while (n%2 == 0) {
			ans.add(2);
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(i); i+=2) {
			while (n%i == 0) {
				ans.add(i);
				n /= i;
			}
		}
		return ans;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		int[] a = new int[n];
		HashSet<Integer>[] f = new HashSet[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(tokens[i]);
			f[i] = primeFactor(a[i]);
		}
		int l = a[0];
		for (int i = 1; i < n; i++)
			l = Math.max(a[i], l);
		int count = 0;
		String ans = "pairwise coprime";
		for (int i = 2; i <= Math.sqrt(l); i+=2) {
			for (int j = 0; j < n; j++) {
				if (f[j].contains(i)) {
					count++;
				}
			}
			if (count == n) {
				ans = "not coprime";
				break;
			}
			if (count > 1) {
				ans = "setwise coprime";
			}	
			if (i == 2)
				i = 1;
		}
		System.out.println(ans);
	}
}
