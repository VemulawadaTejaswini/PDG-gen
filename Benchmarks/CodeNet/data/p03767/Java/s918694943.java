import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int [3*n];
		for (int i=0;i<3*n;i++) {
			int temp = sc.nextInt();
			a[i] = temp;
		}
		Arrays.sort(a);
		int ans = 0;
		for (int i=n; i<a.length;i+=2) {
			ans += a[i];
		}
		System.out.println(ans);
	}
}