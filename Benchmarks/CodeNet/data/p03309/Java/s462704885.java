import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			b[i] = a[i] - (i+1);
		}
		// for(int value : b) {
		// 	System.out.print(value + " ");
		// }
		System.out.println();
		Arrays.sort(b);
		// for(int value : b) {
		// 	System.out.print(value + " ");
		// }
		// System.out.println();
		int ans = 0;
		int bMid;
		if(n % 2 == 0) {
			bMid = (b[n/2] + b[(n/2) + 1]) / 2;
		}
		else {
			bMid = b[n/2];
		}
		for(int i = 0; i < n; i++) {
			ans += Math.abs(b[i] - bMid);
		}
		System.out.println(ans);
	}
}
