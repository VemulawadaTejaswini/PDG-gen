import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		
		int alice = 0;
		int bob = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				alice += a[i];
			} else {
				bob += a[i];
			}
		}
		
		System.out.println(alice - bob);
	}
}