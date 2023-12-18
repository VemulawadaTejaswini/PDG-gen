import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next());
		Arrays.sort(a);
		int alice = 0;
		int bob = 0;
		int c = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (c == 0) {
				alice += a[i];
				c = 1;
			}
			else {
				bob += a[i];
				c = 0;
			}
		}
		System.out.println(alice - bob);
	}
}